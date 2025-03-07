--CREATE TABLE CLIENTE
--(
--    cd_cliente number(4),
--    ds_endereco varchar2(70),
--    cd_municipio number(5),
--    sg_estado char(2),
--   nr_cep varchar2(8),
--    nr_ddd number(3),
--    nr_fone number(7),
--    ie_sexo char(1),
--    constraint cliente_cd_cliente_pk primary key (cd_cliente)
--);

--"CTRL + ENTER" Executa o código
--SELECT * FROM CLIENTE

--CREATE TABLE ESTADO
--(
--    sg_estado char(2),
--    nm_estado varchar2(35),
--    CONSTRAINT estado_sg_estado_pk primary key (sg_estado),
--    CONSTRAINT estado_nm_estado UNIQUE (nm_estado)
--);

--ALTER TABLE CLIENTE ADD
-- CONSTRAINT cliente_sg_estado_fk FOREIGN KEY (sg_estado) REFERENCES estado(sg_estado);
--ALTER TABLE CLIENTE ADD
-- CONSTRAINT cliente_ie_sexo_ck CHECK (ie_sexo in('M','F'))

--INSERT INTO CLIENTE (cd_cliente, nm_cliente, sg_estado, ie_sexo) VALUES (10,'Fulano','SP','M')
--Nesse caso o código resulta em um erro pois não há um valor equivalente na Foreign Key da tabela ESTADO

--INSERT INTO ESTADO (sg_estado, nm_estado) VALUES ('SP','São Paulo');

--INSERT INTO CLIENTE (cd_cliente, sg_estado, ie_sexo) VALUES (10,'SP','M')

--DESCRIBE CLIENTE

--"SYSDATE (Data do sistema)"    "TODATE('06032025') DDMMYYYY"
