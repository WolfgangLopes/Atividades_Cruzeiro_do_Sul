#Invertendo o valor entre duas variáveis
print("Primeiro metodo")
a = 2
b = 5

x = a
a = b
b = x

print(a, b)

print("Segundo metodo")
a = 2
b = 5

a = a + b
b =  a - b
a = a - b

print(a , b)

print("Terceiro metodo")
a = 2
b = 5

a, b = b, a

print(a, b)
