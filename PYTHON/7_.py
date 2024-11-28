def imprimir_opcoes():
    print("Escolha uma forma de pagamento:")
    print("1) À vista com 10% de desconto")
    print("2) Em duas vezes (sem juros)")
    print("3) De 3 até 10 vezes com 3% de juros ao mês (acima de R$ 100,00)")

def calcular_a_vista(total):
    return total * 0.90

def calcular_duas_vezes(total):
    return total / 2

def calcular_parcelado(total, parcelas):
    juros = 0.03 * parcelas
    return total * (1 + juros) / parcelas

# Exemplo
total = float(input("Informe o total gasto: R$ "))
imprimir_opcoes()
opcao = int(input("Escolha a opção: "))

if opcao == 1:
    print(f"Total com desconto: R$ {calcular_a_vista(total):.2f}")
elif opcao == 2:
    print(f"Valor de cada parcela: R$ {calcular_duas_vezes(total):.2f}")
elif opcao == 3 and total > 100:
    parcelas = int(input("Informe o número de parcelas (3 a 10): "))
    if 3 <= parcelas <= 10:
        print(f"Valor de cada parcela: R$ {calcular_parcelado(total, parcelas):.2f}")
    else:
        print("Número de parcelas inválido!")
else:
    print("Opção inválida ou total menor que R$ 100 para parcelamento!")
