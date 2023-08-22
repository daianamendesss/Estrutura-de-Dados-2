package javasorts;

import java.util.Scanner;

/**
 *
 * @author luizh
 */
public class AtividadeBubbleSort {
    
    public static void bSort(int array[]) {
        int n = array.length;
        int temp;
        for(int fase = 1; fase < n; fase++) {
            boolean trocaFase = false;

            for(int comp = 0; comp < n - fase; comp++) {
                if(array[comp] > array[comp + 1]) {
                    temp = array[comp];
                    array[comp] = array[comp + 1];
                    array[comp + 1] = temp;
                    trocaFase = true;
                }
            }

            if(!trocaFase) {
                return;
            }// fim troca
        }
    }
    
    
            