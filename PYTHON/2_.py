def eh_primo(numero):
    if numero < 2:
        return False
    for i in range(2, int(numero**0.5) + 1):
        if numero % i == 0:
            return False
    return True

def maior_primo_ate(numero):
    for i in range(numero, 1, -1):
        if eh_primo(i):
            return i
    return None

# Exemplo
numero = 20
print(f"O maior número primo menor ou igual a {numero} é {maior_primo_ate(numero)}")
