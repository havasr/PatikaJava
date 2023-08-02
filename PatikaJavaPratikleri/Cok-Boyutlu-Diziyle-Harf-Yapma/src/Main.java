public class Main {
    public static void main(String[] args) {

        int[][] letter = new int[5][4];

        for (int i = 0; i < letter.length; i++) {
            System.out.println();
            for (int j = 0; j < letter[0].length; j++) {
                if (i == 0 || i == 4 || j == 0 || (i == 2 && (j == 1 || j == 2)) || (j == 3 && (i == 1 || i == 3))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}