/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodoburbujanormal;

/**
 * @author OSCAR CORTES SOLARES
 */
import java.util.Arrays;

public class MetodoBurbujaNormal {
    
    // 1. Método de burbuja normal
    public static void ordenamientoBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // 2. Método de burbuja mejorado con bandera
    public static void ordenamientoBurbujaMejorado(int[] arreglo) {
        int n = arreglo.length;
        boolean huboCambio;
        
        for (int i = 0; i < n - 1; i++) {
            huboCambio = false; // Se reinicia en cada pasada
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    huboCambio = true; // Detecta que hubo un intercambio
                }
            }
            
            // Si no hubo ningún intercambio, el arreglo ya está ordenado ⏱️
            if (!huboCambio) {
                break;
            }
        }
    }

    // Método principal para pruebas
    public static void main(String[] args) {
        int[] arregloPrueba = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("Estado inicial: " + Arrays.toString(arregloPrueba));
        
        ordenamientoBurbujaMejorado(arregloPrueba);
        
        System.out.println("Resultado final: " + Arrays.toString(arregloPrueba));
    }
}