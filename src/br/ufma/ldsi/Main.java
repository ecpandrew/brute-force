package br.ufma.ldsi;

public class Main {



    public static void main(String[] args) {
        int[] array = new int[]{2, 3,4,5,6,7,8};
        int number = 2;
        bruteForce(array, number);
    }

    static public void bruteForce( int[] array, int number ){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(!(i == j)){
                    if((array[i] - array[j]) == number){
                        System.out.println("Subtracao entre "+array[i]+" e "+array[j]+" = "+ number);
                    }
                }
            }
        }
    }
}
