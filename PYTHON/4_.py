def salario_final(salario_fixo, vendas):
    comissao = vendas * 0.15
    return salario_fixo + comissao

# Exemplo
nome = "João"
salario_fixo = 2000
vendas = 10000
print(f"Vendedor: {nome}")
print(f"Salário fixo: R$ {salario_fixo:.2f}")
print(f"Salário final: R$ {salario_final(salario_fixo, vendas):.2f}")
