def analisar_string(texto):
    caracteres_totais = len(texto)
    pontuacoes = sum(1 for c in texto if c in ".,!?;:-")
    numeros = sum(1 for c in texto if c.isdigit())
    minusculas = sum(1 for c in texto if c.islower())
    return caracteres_totais, pontuacoes, numeros, minusculas

# Exemplo
texto = "Olá, mundo! Tenho 2 cães e 1 gato."
totais, pontuacoes, numeros, minusculas = analisar_string(texto)
print(f"Total de caracteres: {totais}")
print(f"Pontuações: {pontuacoes}")
print(f"Números: {numeros}")
print(f"Minúsculas: {minusculas}")
