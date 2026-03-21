n=4
i=0
nota = [0]*n
somanota=0

for i in range(n):
    nota[i] = float(input(F"Digite a nota {i+1}\n"))
    somanota = somanota+nota[i]

notafinal = somanota/4

if(notafinal>6):
    print(F"Nota final: {notafinal}, aprovado\n")
elif(notafinal<6 and notafinal>4):
    print(F"Nota final: {notafinal}, ficou de AF\n")
else:
    print(F"Nota final: {notafinal}, reprovado\n")

    
