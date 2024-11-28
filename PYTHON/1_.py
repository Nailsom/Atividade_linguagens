def calcular_fatorial(numero):
    fatorial = 1
    for i in range(1, numero + 1):
        fatorial *= i
    return fatorial

# Exemplo
numero = 5
print(f"O fatorial de {numero} é {calcular_fatorial(numero)}")
