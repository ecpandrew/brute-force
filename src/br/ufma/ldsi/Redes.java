package br.ufma.ldsi;

public class Redes {


    static int linha1_malha[] = new int[] {0, 1, 1, 1, 1, 1};
    static int linha2_malha[] = new int[] {1, 0, 1, 1, 1, 1};
    static int linha3_malha[] = new int[] {1, 1, 0, 1, 1, 1};
    static int linha4_malha[] = new int[] {1, 1, 1, 0, 1, 1};
    static int linha5_malha[] = new int[] {1, 1, 1, 1, 0, 1};
    static int linha6_malha[] = new int[] {1, 1, 1, 1, 1, 0};

//            [1, 1, 1, 0, 1, 1]
//            [0, 0, 0, 1, 0, 0]
//            [0, 0, 0, 1, 0, 0]
//            [0, 0, 0, 1, 0, 0]
//            [0, 0, 0, 1, 0, 0]
//            [0, 0, 0, 1, 0, 0]


                                //           a  b  c  d  e  f
    static int linha1_estrela2[] = new int[] {0, 0, 1, 0, 0, 0};
    static int linha2_estrela2[] = new int[] {0, 0, 1, 0, 0, 0};
    static int linha3_estrela2[] = new int[] {1, 1, 0, 1, 1, 1};
    static int linha4_estrela2[] = new int[] {0, 0, 1, 0, 0, 0};
    static int linha5_estrela2[] = new int[] {0, 0, 1, 0, 0, 0};
    static int linha6_estrela2[] = new int[] {0, 0, 1, 0, 0, 0};



    static int linha1_estrela[] = new int[] {1, 1, 1, 0, 1, 1};
    static int linha2_estrela[] = new int[] {0, 0, 0, 1, 0, 0};
    static int linha3_estrela[] = new int[] {0, 0, 0, 1, 0, 0};
    static int linha4_estrela[] = new int[] {0, 0, 0, 1, 0, 0};
    static int linha5_estrela[] = new int[] {0, 0, 0, 1, 0, 0};
    static int linha6_estrela[] = new int[] {0, 0, 0, 1, 0, 0};


    static int linha1_anel[] = new int[] {0, 1, 0, 0, 0, 1};
    static int linha2_anel[] = new int[] {1, 0, 1, 0, 0, 0};
    static int linha3_anel[] = new int[] {0, 1, 0, 1, 0, 0};
    static int linha4_anel[] = new int[] {0, 0, 1, 0, 1, 0};
    static int linha5_anel[] = new int[] {0, 0, 0, 1, 0, 1};
    static int linha6_anel[] = new int[] {1, 0, 0, 0, 1, 0};

    static int[][] matriz_malha_completa = new int[][]{
            linha1_malha, linha2_malha, linha3_malha, linha4_malha, linha5_malha, linha6_malha};

    static int[][] matriz_estrela = new int[][]{
            linha1_estrela, linha2_estrela, linha3_estrela, linha4_estrela,   linha5_estrela, linha6_estrela};

    static int[][] matriz_estrela2 = new int[][]{
            linha1_estrela2, linha2_estrela2, linha3_estrela2,  linha4_estrela2,   linha5_estrela2, linha6_estrela2};

    static int[][] matriz_anel = new int[][]{
            linha1_anel, linha2_anel, linha3_anel,  linha4_anel,   linha5_anel, linha6_anel};


}
