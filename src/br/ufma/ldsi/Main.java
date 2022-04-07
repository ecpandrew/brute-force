package br.ufma.ldsi;

public class Main {



    public static void main(String[] args) {
        int[] array = new int[]{2, 3,4,5,6,7,8};
        int number = 2;
        bruteForce(array, number);
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
}
