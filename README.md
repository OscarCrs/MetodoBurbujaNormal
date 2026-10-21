# Práctica: Algoritmo de Ordenamiento Burbuja (Normal vs. Mejorado)

## 📌 Descripción
Aplicación en Java desarrollada para la materia de Estructura de Datos que implementa, compara y analiza el rendimiento entre el algoritmo de ordenamiento **Burbuja Tradicional** y el **Burbuja Mejorado (Optimizado con bandera)**.

## ⚙️ Métodos Implementados
1. `ordenamientoBurbuja(int[] arreglo)`: Realiza pasadas completas comparando elementos adyacentes sin importar si el arreglo ya está ordenado.
2. `ordenamientoBurbujaMejorado(int[] arreglo)`: Incorpora una variable booleana (`huboIntercambio`) que interrumpe el ciclo anticipadamente si una pasada finaliza sin realizar ningún intercambio.

## 🚀 Instrucciones de Ejecución
1. Clona este repositorio o descarga los archivos fuente.
2. Abre el proyecto en tu entorno de desarrollo Java preferido (NetBeans, IntelliJ IDEA, VS Code).
3. Ejecuta la clase principal.

## 📊 Resultados Esperados en Consola
El programa ejecuta pruebas con tres escenarios distintos:
* Arreglo desordenado.
* Arreglo parcialmente ordenado.
* Arreglo ya ordenado (donde se evidencia la eficiencia del algoritmo mejorado al reducir drásticamente el número de comparaciones).
*
