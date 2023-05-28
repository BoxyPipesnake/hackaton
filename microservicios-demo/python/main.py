import pandas as pd
from hora_por_hectarea import calcular_litros
from hora_por_hectarea import calcular_Goteo
from hora_por_hectarea import calcular_Aspercion
from hora_por_hectarea import calcular_Microaspercion
from hora_por_hectarea import calcular_Gravedad
from hora_por_hectarea import calcular_Pivot

frecuencia_de_riego = 2
# Leer el archivo CSV
data = pd.read_csv("tabla_cultivos.csv")

# Obtener los parámetros del cultivo
cultivo = "Aguacate"
fila_cultivo = data[data["Cultivo"] == cultivo]
agua_por_planta = fila_cultivo["Agua por planta (ml)"].values[0]
duracion_cosecha = fila_cultivo["Duracion de cosecha"].values[0]
densidad_por_hectarea = fila_cultivo["Densidad por hectarea"].values[0]
horas_de_riego = fila_cultivo["horas de riego"].values[0]
recomendacion = fila_cultivo["Recomendacion"].values[0]
recomendacion_2 = fila_cultivo["2_Recomendacion"].values[0]
# parametros que se obtienen de la API del agricultor

num_hectareas = 1  #numero de hectareas por el agricultor
litros_almacenados = 100, 000  #litros almacenados por el agri
zona = "Apodaca"

agua_litros_planta_dia, agua_litros_hectarea_dia, agua_litros_hectareas_dia, agua_litros_hectareas_ciclo = calcular_litros(
  agua_por_planta, densidad_por_hectarea, frecuencia_de_riego,
  duracion_cosecha, horas_de_riego, num_hectareas)

# Imprimir los parámetros
print("Densidad por agua_litros_planta_dia:", agua_litros_planta_dia)
print("Densidad por agua_litros_hectarea_dia:", agua_litros_hectarea_dia)
print("Densidad por agua_litros_hectareas_dia:", agua_litros_hectareas_dia)
print("Densidad por agua_litros_hectareas_ciclo:", agua_litros_hectareas_ciclo)
print("recomendacion:", recomendacion)
print("recomendacion2:", recomendacion_2)

print("Ahora ingresar a cada tipo de sistema de refugio")

agua_litros_goteo = calcular_Goteo(agua_litros_hectareas_ciclo)
print("Densidad por agua_litros_goteo:", agua_litros_goteo)
agua_litros_aspercion = calcular_Aspercion(agua_litros_hectareas_ciclo)
print("Densidad por agua_litros_aspercion:", agua_litros_aspercion)
agua_litros_microaspercion = calcular_Microaspercion(
  agua_litros_hectareas_ciclo)
print("Densidad por agua_litros_microaspercion:", agua_litros_microaspercion)
agua_litros_gravedad = calcular_Gravedad(agua_litros_hectareas_ciclo)
print("Densidad por agua_litros_gravedad:", agua_litros_gravedad)
agua_litros_pivot = calcular_Pivot(agua_litros_hectareas_ciclo)
print("Densidad por agua_litros_pivot:", agua_litros_pivot)

#Sistema de Putuaje
puntuaje = 0