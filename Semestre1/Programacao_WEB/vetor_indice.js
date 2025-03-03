function alteraTitulo(){
    document.querySelector("#tit").innerHTML=document.querySelector
    ("#titulo").ariaValueMax;
    document.querySelector("#tit").style.color="blue";
    document.querySelector("#tit").style.fontSize="50pt"; 
}

function criarTabela(){
    linhas= document.querySelector("#linhas").value;
    colunas= document.querySelector("#coluna").value;
    conteudo="";
    conteudo += "<table border='1'>"
    for(i=1; i<=linha;i++){
        conteudo+="<tr>";
    for(j=1;j<=coluna;j++){
    }
    conteudo+="</tr>";
}
    conteudo +="</table>";
    document.querySelector("#tab").innerHTML=conteudo;  
}

let obj1 = document.querySelector("button");
let obj2 = document.querySelector("button2");
obj1.onclick = alteraTitulo;
obj2.onclick = criaTabela;