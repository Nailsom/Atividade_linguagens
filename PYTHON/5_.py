def situacao_final(media):
    if media >= 7:
        return "Aprovado"
    elif media < 3:
        return "Reprovado"
    else:
        return "Prova final"

def calcular_media(nota1, nota2):
    return (nota1 + nota2) / 2

# Exemplo
nota1 = 6.0
nota2 = 8.0
media = calcular_media(nota1, nota2)
print(f"Média final: {media:.2f}")
print(f"Situação: {situacao_final(media)}")
