create or replace procedure calcular_nota_final(
    v_a2 in number,
    v_a1 in number,
    v_af in number
    )IS
    v_nota_somada number;
    v_maior_nota number;
    v_nota_final number;
    BEGIN
        if v_a1>=v_a2 then v_maior_nota:=v_a1;
            else v_maior_nota:=v_a2;
        end if;
        v_nota_somada:=v_a1+v_a2;
        v_nota_final:=v_maior_nota+v_af;
        if v_nota_somada>=6 then
            dbms_output.put_line('Aprovado, nota: ' || v_nota_somada);
            elsif v_nota_somada<6 then
            dbms_output.put_line('Ficou de AF, nota: ' || v_nota_somada);        
            elsif v_nota_final>=6 then
            dbms_output.put_line('Aprovado na AF, nota: ' || v_nota_final);
            else dbms_output.put_line('Reprovado, nota: ' || v_nota_final);
        end if;
        end calcular_nota_final;
    

exec calcular_nota_final(2,3,3);

