def consumo_medio(distancia, combustivel):
    if combustivel == 0:
        return "Consumo impossível (divisão por zero)"
    return distancia / combustivel

# Exemplo
distancia = 500  # km
combustivel = 50  # litros
print(f"Consumo médio: {consumo_medio(distancia, combustivel):.2f} km/l")
