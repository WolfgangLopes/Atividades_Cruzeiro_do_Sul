print("Calculo de média de notas\n")

i=0
j=i+1
notafinal=0
nota=[0]*4

while(i<4):
    print("Digite a nota "+str(j)+"/4:\n")
    nota[i] = int(input(""))    
    i=i+1

media = (nota[0]+nota[1]+nota[2]+nota[3])/4

print(f'Média das notas:  {media: .2f}')

