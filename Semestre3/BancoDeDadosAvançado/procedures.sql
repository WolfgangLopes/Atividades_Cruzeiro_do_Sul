-- Procedures: Instruções SQL reaproveitáveis

CREATE OR REPLACE PROCEDURE saudar(
    p_nome IN VARCHAR2
) IS
BEGIN
    dbms_output.PUT_LINE('Olá , ' || p_nome || '!');
    END saudar;

    BEGIN
        saudar('Wolf');
        END;

CREATE OR REPLACE PROCEDURE mostrar_texto_fixo(
    p_texto OUT VARCHAR2
    )IS
    BEGIN
        p_texto := 'Texto vindo de dentro da PROCEDURE';
    END mostrar_texto_fixo;

    DECLARE
    v_meu_texto VARCHAR2(100);
    BEGIN
        mostrar_texto_fixo(v_meu_texto);
        dbms_output.put_line('Texto: ' || v_meu_texto);
        END;

CREATE OR REPLACE PROCEDURE adicionar_dez_porcento(
    p_valor IN OUT NUMBER 
)IS
    v_valor_original NUMBER;
    BEGIN
        v_valor_original := p_valor;

        p_valor:= p_valor * 1.10;

        dbms_output.put_line('Original: ' || v_valor_original || ' -> Novo: ' || p_valor);
    END adicionar_dez_porcento;

    DECLARE
        v_preco NUMBER:= 100;
    BEGIN
        ADICIONAR_DEZ_PORCENTO(v_preco);
    END;


SELECT object_name, status FROM user_objects WHERE object_type = 'PROCEDURE'
order by object_name;


select text from user_source where name='MOSTRAR_TEXTO_FIXO' order by line;

DROP procedure MOSTRAR_TEXTO_FIXO;

create table clientes(
    id number primary key,
    nome varchar2(50),
    email varchar2(150)
)

create or replace procedure inserir_cliente(
    p_id IN clientes.id%TYPE,
    p_nome IN clientes.nome%TYPE,
    p_email IN clientes.email%TYPE
)IS
BEGIN
    INSERT INTO clientes VALUES(p_id, p_nome, p_email);    
    dbms_output.put_line('Cliente inserido com sucesso!');
EXCEPTION
    when DUP_VAL_ON_INDEX THEN
    dbms_output.put_line('Erro: id ' || p_id || 'já existe!');
    when others then
    dbms_output.put_line('Erro desconhecido! ' || SQLERRM);
END inserir_cliente;


-- Executando a procedure
BEGIN
    INSERIR_CLIENTE(1, 'João da Silva', 'joao@email.com');
END;

-- Outro metodo de execução da procedure
EXEC INSERIR_CLIENTE(1, 'João da Silva', 'joao@gmail.com');

SELECT * from clientes;
