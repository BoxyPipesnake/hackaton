def calcular_litros(requerimiento_agua_planta, densidad_plantas_hectarea,
                    frecuencia_riego_dia, duracion_cosecha, horas_de_riego,
                    num_hectareas):
  # Cálculo de la cantidad de agua por planta en litros/hora
  agua_planta_litros_hora = (requerimiento_agua_planta /
                             1000) * frecuencia_riego_dia

  # Cálculo de la cantidad de agua por hectárea en litros/hora
  agua_litros_planta_dia = agua_planta_litros_hora * horas_de_riego
  agua_litros_hectarea_dia = agua_litros_planta_dia * densidad_plantas_hectarea
  agua_litros_hectareas_dia = agua_litros_hectarea_dia * num_hectareas
  agua_litros_hectareas_ciclo = agua_litros_hectareas_dia * duracion_cosecha

  return int(agua_litros_planta_dia), int(agua_litros_hectarea_dia), int(
    agua_litros_hectareas_dia), int(agua_litros_hectareas_ciclo)


def calcular_Goteo(agua_litros_hectareas_ciclo):
  error_eficiencia = .10
  agua_litros_hectareas_ciclo = agua_litros_hectareas_ciclo + (
    agua_litros_hectareas_ciclo * error_eficiencia)
  return agua_litros_hectareas_ciclo


def calcular_Aspercion(agua_litros_hectareas_ciclo):
  error_eficiencia = .25
  agua_litros_hectareas_ciclo = agua_litros_hectareas_ciclo + (
    agua_litros_hectareas_ciclo * error_eficiencia)
  return agua_litros_hectareas_ciclo


def calcular_Microaspercion(agua_litros_hectareas_ciclo):
  error_eficiencia = .20
  agua_litros_hectareas_ciclo = agua_litros_hectareas_ciclo + (
    agua_litros_hectareas_ciclo * error_eficiencia)
  return agua_litros_hectareas_ciclo


def calcular_Gravedad(agua_litros_hectareas_ciclo):
  error_eficiencia = .55
  agua_litros_hectareas_ciclo = agua_litros_hectareas_ciclo + (
    agua_litros_hectareas_ciclo * error_eficiencia)
  return agua_litros_hectareas_ciclo


def calcular_Pivot(agua_litros_hectareas_ciclo):
  error_eficiencia = .22
  agua_litros_hectareas_ciclo = agua_litros_hectareas_ciclo + (
    agua_litros_hectareas_ciclo * error_eficiencia)
  return agua_litros_hectareas_ciclo
