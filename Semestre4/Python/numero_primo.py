n = int(input("Digite um número inteiro:\n"))
i = 2
isPrimo = True
while(i<n):    
    if((n/i)%2==0):
        isPrimo = False    
        break
    i+=1

print(f"O número {n} é primo?\nResultado: {isPrimo}")
