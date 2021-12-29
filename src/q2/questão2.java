package q2;

import java.util.Random;

public class questão2 {
    public static void main(String[] args) throws Exception {

        int[][] matriz = new int[5][5];
        Random gerador = new Random();
        int somaS = 0;
        int somaP = 0;
        int somaT = 0;
        int dif=0;
        int ig = 0;
        System.out.println();

        // valores que a matriz recebera, usando gerador de numeros para preencher
        System.out.println("Valores presentes na matriz 5x5: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                int x = gerador.nextInt(9) + 1;
                matriz[i][j] = x; 
            }
        }


        // imprimir a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }



        //diagonal principal
        System.out.println();
        System.out.println("Diagonal Principal");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
             
           somaP += matriz[i][i]; //soma dos valores da diag. principal
           
        }
        System.out.println();
        System.out.println(); 
  
  
  
        //diagonal secundaria
        System.out.println("Diagonal Secundaria");
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + " ");
          if (i == (matriz.length-1-i)){
              ig = matriz[i][i];  //receber valor que se repete nas duas matrizes
          }
          somaS += (matriz[i][matriz.length - 1 - i]); //soma dos valores da diag. secundaria
          }

        somaT = somaS+somaP-ig; //soma dos valores das duas diagonais retirando o valor repetido
        
        dif= somaT-somaS;       // calculo da diferença

        System.out.println(); 
        System.out.println(); 
        System.out.println("A soma da diagonal secundaria é de: " + somaS);
        System.out.println("A soma das duas diagonais é de: " + somaT);
        System.out.println("A diferença da soma total com a diagonal secundaria é de: " + dif); 

        
        


        
    }

}