package br.ufma.ldsi;

import java.util.Arrays;

import static br.ufma.ldsi.Redes.*;

public class Main {


    public static void main(String[] args) {
//        testeBruteForce();
        testeTopologia(matriz_estrela2);
        testeTopologia(matriz_estrela);

    }

    private static void testeTopologia(int[][] matriz) {

        if(ehTopologiaAnel(matriz)){
            System.out.println("Matriz representa topologia Anel");
        }else if(ehTopologiaEstrela(matriz)){
            System.out.println("Matriz representa topologia Estrela");
        }else if(ehTopologiaMalha(matriz)){
            System.out.println("Matriz representa topologia Malha");
        }else{
            System.out.println("Matriz representa outra topologia");
        }

    }

    private static boolean ehTopologiaMalha(int[][] matriz) { // n²
        boolean topologiaMalha = true;

        for (int i = 0; i < matriz.length ; i++) { // n
            for (int j = 0; j < matriz[i].length ; j++) { // n
                if (matriz[i][j] != 1) { // 1
                    if(i!=j){ //1
                        topologiaMalha = false;
                    }
                }
            }
        }
        return topologiaMalha;
    }

    private static boolean ehTopologiaEstrela(int[][] matriz) {// n³ + n² = O(n³)
        boolean topologiaEstrela = true;

        Integer linha_do_elemento_central = null;
        Integer indice_do_elemento_central = null;
        for (int i = 0; i < matriz.length ; i++) { // n
            int[] linha = matriz[i];
            if(count(linha, 0) == 1){ // n
                if(linha_do_elemento_central == null){
                    linha_do_elemento_central = i;
                    indice_do_elemento_central = findIndex(linha, 0); // n
                }else{
                    return false;
                }
            }
        }
        if(indice_do_elemento_central==null ){
            return false;
        }

        int[] linha = new int[matriz.length];

        for (int i = 0; i < matriz.length ; i++) {
            linha[i] = matriz[i][indice_do_elemento_central];
            if(i != linha_do_elemento_central && count(matriz[i],0) != matriz.length-1){
                return false;
            }

        }
        return count(linha,1) == matriz.length-1;

    }

    private static boolean ehTopologiaAnel(int[][] matriz) {
        boolean topologiaAnel = false;
        // cada linha da matriz, so pode ter 2 elementos true para a topologia anel


        return topologiaAnel;

    }

    static public void bruteForce( int[] array, int number ){
        for (int i = 0; i < array.length; i++) { // N
            for (int j = 0; j < array.length; j++) { // N
                if(!(i == j)){ // 1
                    if((array[i] - array[j]) == number){ // 1
                        System.out.println("Subtracao entre "+array[i]+" e "+array[j]+" = "+ number); // 1
                    }
                }
            }
        }
    } // Complexidade: N²
     //  ou 2N+3


    static void testeBruteForce(){
        int[] array = new int[]{2, 3,4,5,6,7,8};
        int number = 2;
        bruteForce(array, number);
    }

    static public int count(int [] array, int number) {
        int c = 0;

        for(int el: array) {
            if(el == number) c++;
        }
        return c;
    }
    static public Integer findIndex(int [] array, int element) {

        for (int i = 0; i < array.length ; i++) {
            if(array[i] == element) return i;
        }
        return null;
    }
}
