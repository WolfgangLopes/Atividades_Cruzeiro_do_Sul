const Cliente = require('../models/clienteModel');

exports.listar = (req, res) => {
  const busca = req.query.busca || '';

  Cliente.buscarClientes(busca, (err, results) => {
    if (err) {
      return res.status(500).send("Erro ao buscar clientes");
    }

    res.render('index', { 
      clientes: results,
      termoBusca: busca
    });
  });
};

exports.formNovo = (req, res) => {
  res.render('form', { cliente: {} });
};

exports.inserir = (req, res) => {
  const { nome, endereco, telefone, cpf, data_nascimento, email } = req.body;

  Cliente.verificarNomeExistente(nome, (err, results) => {
    if (results.length > 0) {
      return res.send('Erro: já existe um cliente com esse nome.');
    }
    
    Cliente.inserir({ nome, endereco, telefone,  cpf, data_nascimento, email }, () => {
      res.redirect('/');
    });
  });
};

exports.editar = (req, res) => {
  Cliente.buscarPorId(req.params.id, (err, results) => {
    res.render('form', { cliente: results[0] });
  });
};

exports.atualizar = (req, res) => {
  const { nome, endereco, telefone, cpf, data_nascimento, email } = req.body;
  Cliente.atualizar(req.params.id, { nome, endereco, telefone, cpf, data_nascimento, email }, () => {
    res.redirect('/');
  });
};

exports.excluir = (req, res) => {
  Cliente.excluir(req.params.id, () => {
    res.redirect('/');
  });
};

exports.detalhes = (req, res) => {
  Cliente.buscarPorId(req.params.id, (err, results) => {
    res.render('detalhes', { cliente: results[0] });
  });
}; 
        

