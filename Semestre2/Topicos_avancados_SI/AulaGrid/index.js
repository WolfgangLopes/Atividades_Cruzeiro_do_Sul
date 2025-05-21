const express = require('express')
const cors = require('cors') // Importa o módulo CORS
const fs = require('fs') // Módulo para trabalhar com arquivos

const app = express()
const port = 3000
const filePath = 'pessoas.json' // Nome do JSON para armazenar os dados

// Habilitao CORS para todas as requisições
// Isso é importante para permitir que um frontend (HTML) em um domínio diferente
// acesse este servidor
app.use(cors())

//Middleware para analisar o corpo das requisições como JSON
// Isso permite que você acesse os dados enviados no corpo da requisiçãovia req.body
app.use(express.json())

// Função auxiliar para leros dados do arquivo JSON
function lerDadosPessoas(){
    try{
        // Lê o conteúdo do arquivo de forma síncrona
        const data = fs.readFileSync(filePath,'utf8')
        // Converte o string JSON lida para um objeto JavaScript
        return JSON.parse(data)
    } catch(err){
        // Se o arquivo não existir ou houver um erro de leitura/parsing
        // retorna um array vazio para iniciar com dados vazios
        if(err.code==='ENOENT'){
            console.log('Arquivo pessoas.json não encontrado. Criando um novo.')
            return[]
        }
        console.error('Erro ao ler arquivo do JSON:',err)
        return[]
    }
}
// Função auxiliar para escrever os dados no arquivo JSON
function escreverDadosPessoas(data){
    try{
        // Converte o objeto JavaScript para uma string JSON formatada (identação de 2 espaços)
        // e escreve no arquivo de forma síncrona
        fs.writeFileSync(filePath, JSON.stringify(data,null,2))
    }catch(err){
            console.error('Erro ao escrever o arquivo no JSON',err)
        }
}

// Rota POST para incluir um novo cadastro de pessoa
app.post('/cadastrar-pessoa',(req,res) =>{
    // Extrai os dados do corpo da requisição
    const { nome, idade, telefone, endereco} = req.body

    // Validação básica dos dados recebidos
if (!nome|| !idade || !telefone || !endereco) {
    return res.status(400).json({erro: 'Todos os campos (nome, idade, telefone, endereco'})
}

// Validação de tipo para idade (opcional, mas boa prática)
if (typeof idade !=='number' || idade <=0){
    return res.status(400).json({erro: 'Idade deve ser um número positivo'})
}

// Lê os dados existentes
const pessoas = lerDadosPessoas()

// Cria um novo objeto pessoa
const novaPessoa = {
    id: pessoas.lenght > 0 ? Math.max(...pessoas.map(p=>p.id))
    +1:1, //Gera um ID simples
    nome,
    idade,
    telefone,
    endereco
}

//Adiciona a nova pessoa ao array
pessoas.push(novaPessoa)

//Escreve o array atualizado de volta no arquivo JSON
escreverDadosPessoais(pessoas)

// Envia uma resposta de sucesso
res.status(201).json({mensagem: 'Pessoa cadastrada com sucesso!', pessoa: novaPessoa})
})

// Rota GET para listar todosos cadastros de pessoas
app.get('/listar-pessoas',(req,res)=>{
    // Lê todos os dados do arquivo JSON
    const pessoas = lerDadosPessoas()
    // Verifica se há pessoas cadastradas
    if (pessoas.lenght===0){
        return res.status(200).json({mensagem: 'Nenhuma pessoa cadastrada ainda.'})

    }

    // Envia a lista de pessoas como resposta JSON
    res.status(200).json (pessoas)
})

// ROTA PARA O AUTOCOMPLETE: Rota GET para pesquisar pessoas por nome
// Esta rota é utilizada pelo componente de autocomplete no frontend
app.get('/pesquisar-pessoa',(req,res)=>{
    const nomePesquisa=req.query.nome // Obtém o parâmetro 'nome' da query string

    if (!nomePesquisa){
        // Se o parâmetro 'nome' não for fornecido, retorna um erro 400
        return res.status(400).json({erro: 'O parâmetro "nome" é obrigatório para a pesquisa.'})
    }

    const pessoas = lerDadosPessoas()
    // Filtra as pessoas cujo nome contém a string da pesquisa (case-sensitive)
    const resultados = pessoas.filter(pessoa=>
        pessoa.nome.toLowerCase().includes(nomePesquisa.toLowerCase())
    )

    if (resultados.length===0){
        // Senenhuma pessoa for encontrada, retorna uma mensagem indicando isso
        return res.status(200).json({mensagem: 'Nenhuma pessoa encotnrada com o nome especidificado'})
    }

    //Retorna os resultados da pesquisa como um array JSON
    res.status(200).json(resultado)
})

// Inicia o servidor
app.listen(port, () => {
    console.log(`Servidor de cadastro de pessoas rodando em http://localhost:${port}`)
})
