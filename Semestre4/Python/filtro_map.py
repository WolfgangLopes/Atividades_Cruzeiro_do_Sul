numeros = [1,2,3,4,5,6]

dobro = [n*2 for n in numeros]


print(f" Números dobrados:\n----------\n{dobro}")


pares_dobrados = list(map( lambda n: n*2 , filter(lambda n: n % 2 == 0, numeros )))

print(f"----------\nApenas números pares dobrados:\n----------\n{pares_dobrados}")


def filtrar_impar(numeros):
    return list(filter(lambda n: n % 2 == 0, numeros))

def dobrar(numeros):
    return list(map(lambda n: n*2, numeros))

print(f"----------\nApenas números pares dobrados (feito por função):\n----------\n{dobrar(filtrar_impar(numeros))}")
