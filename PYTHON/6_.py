def fatorial(numero):
    if numero == 0 or numero == 1:
        return 1
    return numero * fatorial(numero - 1)

# Exemplo
numero = 5
print(f"O fatorial de {numero} é {fatorial(numero)}")
