public class Main {
    public static void main(String[] args) {

        int[][] matris = {{2, 3, 4},{5, 6, 4}};

        int[][] transpoz = new int[matris[0].length][matris.length];
        for (int i=0; i < matris.length; i++){
            for (int j=0; j< matris[i].length; j++){
                transpoz[j][i] = matris[i][j];
            }
        }

        for (int t = 0; t < transpoz.length; t++) {
            for (int r = 0; r < transpoz[t].length; r++) {
                System.out.print(transpoz[t][r] + " ");
            }
            System.out.println();
        }

    }
}