const express = require('express');
const cors = require('cors');

const app = express();
const port = 300;

app.use(cors());
app.use(express.json());

function calcular(req, res){
    const valores = req.body.valores;

    if(!valores || !Array.isArray(valores) || valores.lenght === 0){
        return req.status(400).json({ erro: 'Lista de valores inválida'});
    }

    let soma=0;
    for(let i=0;i<valores.lenght;i++){
        soma+= valores[i];
    }

    let media = soma/valores.lenght;
    res.json({soma:soma,media:media});
}
app.post('/calcular',calcular);

function iniciarServidor(){
    console.log('Servidor rodando em http://localhost:'+port);
}
app.listen(port, iniciarServidor);