create table empregados(
    empregado_id number,
    nome varchar2(50),
    salario number,
    primary key (empregado_id)
);

create sequence empregado_seq
start with 1
increment by 1
nocache;


insert into empregados (empregado_id, nome, salario)
values (empregado_seq.nextval, 'Marcos', 1500);

insert into empregados (empregado_id, nome, salario)
values (empregado_seq.nextval, 'João', 2000);

insert into empregados (empregado_id, nome, salario)
values (empregado_seq.nextval, 'Maria', 1800);


DECLARE
    v_id empregados.empregado_id%type := 4;
    v_nome empregados.nome%type := 'Marcelo';
    v_salario empregados.salario%type := 2500;
    v_limite_salario number := 6000;
BEGIN
    --1 Verificando a existencia do empregado
    select nome, salario into v_nome, v_salario
    from empregados where empregado_id = v_id;

    dbms_output.put_line('Empregado(a) encontrado: ' || v_nome);

    -- 2 Atualizar salario
    IF v_salario <= v_limite_salario THEN
        UPDATE EMPREGADOS
        SET salario = salario * 1.10
        where EMPREGADO_ID = v_id;
        dbms_output.put_line('Empregado(a) ' || v_nome || ', teve o salario atualizado para R$: ' || v_salario * 1.10);
    ELSE
    -- Deletar o empregado se ultrapassar o limite
        DELETE FROM EMPREGADOS
        where EMPREGADO_ID = v_id;
        dbms_output.put_line('Empregado(a) deletado(a) pois ultrapassou o limite de R$6000');
    END IF;
EXCEPTION
    WHEN no_data_found THEN
        --3 Inserir novo empregado
        insert into empregados (empregado_id, nome, salario) 
        VALUES
        (v_id, v_nome, v_salario);
        dbms_output.put_line('Novo empregado(a) inserido: ' || v_nome || ', salario R$: ' || v_salario);

    WHEN OTHERS THEN
        dbms_output.put_line('Erro desconhecido: ' || SQLERRM);
END;
