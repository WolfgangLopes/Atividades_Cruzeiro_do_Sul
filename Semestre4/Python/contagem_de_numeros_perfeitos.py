cont = 0
j = 1

while(j<1000):    
    i = 1
    val=0
    while(i<j):                
        if(j%i==0):            
            val += i               
        i+=1        

    if(val==j):
        print(f"{j} é um número perfeito")
        cont+=1    
    j+=1

print(f"---------------\nNúmeros perfeitos encontrados: {cont}")
