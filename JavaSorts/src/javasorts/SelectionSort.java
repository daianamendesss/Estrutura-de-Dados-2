/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasorts;

import java.util.Scanner;

/**
 *
 * @author 15385404608
 */
public class SelectionSort {
    public static long  compara=0, trocas=0;
    private static int indexMinArray(int array[], int posAtual){
        int k = posAtual;
        for(int i= posAtual+1 ;i<array.length; i++){
            compara++; // contando comparacoes
            if(array[i]<array[k]) //k = indice do menor
                k = i;
        }// fim for
        return k; //indice do menor valor
    }
//------------------------------------------
public static void sSort(int array[]){
      for(int i=0; i<array.length-1; i++) {
      int k = indexMinArray(array, i);
      trocas++; //contando trocas
      int temp = array[i];
      array[i] = array[k];
      array[k] = temp;
      }
              
}
//-------------------------------------------
public static void sSortComentado(int array[]){
      Scanner scanner = new Scanner(System.in);
      for(int i=0; i<array.length-1; i++) {
          System.out.println("\n Fase: "+i);
      int k = indexMinArray(array, i);
          System.out.println("Atual:"+array[i] + " Trocando com menor valor: "+array[k]);
          //trocar valores de i com k
          scanner.nextLine(); // pausa
      int temp = array[i];
      array[i] = array[k];
      array[k] = temp;
//mostrando o valor ---------------------------
JavaSorts.printArray(array);
scanner.nextLine();
      
      }
              
}
    
}
