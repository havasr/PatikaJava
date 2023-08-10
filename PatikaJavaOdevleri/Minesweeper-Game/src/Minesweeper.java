import java.util.*;

public class Minesweeper {
    private int rowNumber;
    private int colNumber;
    String[][] game;

    public Minesweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;

        this.game = new String[rowNumber][colNumber];
    }

    public void run() {
        load();
        System.out.println("Game starts! Time to dig!");
        while (isGroundLeft()) {
            playRound();
        }
        System.out.println("Congrats you won!");
    }

    public void load() {

        int mineNumber = rowNumber * colNumber / 4;

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                game[i][j] = "-";
            }
        }

        Random random = new Random();
        boolean[][] filledPositions = new boolean[rowNumber][colNumber];

        for (int k = 0; k < mineNumber; k++) {
            int randomRow = random.nextInt(rowNumber);
            int randomCol = random.nextInt(colNumber);

            while (filledPositions[randomRow][randomCol]) {
                randomRow = random.nextInt(rowNumber);
                randomCol = random.nextInt(colNumber);
            }

            game[randomRow][randomCol] = "*";
            filledPositions[randomRow][randomCol] = true;
        }

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(game[i][j]);

            }
            System.out.println();
        }
    }

    public void playRound() {
        Scanner input = new Scanner(System.in);
        int digRow, digCol;

        do {
            System.out.println("Please enter row number: ");
            digRow = input.nextInt();
        } while (digRow <= 0 || digRow > rowNumber);

        do {
            System.out.println("Please enter column number: ");
            digCol = input.nextInt();
        } while (digCol <= 0 || digCol > colNumber);

        if (Objects.equals(game[digRow - 1][digCol - 1], "*")) {
            System.out.println("Game over, loser!");
        } else {
            int num = checkSurroundings(digRow - 1, digCol - 1);
            game[digRow - 1][digCol - 1] = String.valueOf(num);
        }
    }

    public int checkSurroundings(int row, int col) {

        List<String> surroundings = new ArrayList<>();
        int sum = 0;

        isValidPosition(surroundings, row - 1, col - 1);
        isValidPosition(surroundings, row - 1, col);
        isValidPosition(surroundings, row - 1, col + 1);
        isValidPosition(surroundings, row, col - 1);
        isValidPosition(surroundings, row, col + 1);
        isValidPosition(surroundings, row + 1, col - 1);
        isValidPosition(surroundings, row + 1, col);
        isValidPosition(surroundings, row + 1, col + 1);

        for (String surrounding : surroundings) {
            {
                if (surrounding.equals("*")) {
                    sum++;
                }
            }
        }
        return sum;
    }

    private void isValidPosition(List<String> list, int row, int col) {
        if (row >= 0 && row < game.length && col >= 0 && col < game[0].length) {
            list.add(game[row][col]);
        }
        ;
    }

    public boolean isGroundLeft() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (game[i][j] == "-") {
                    return true;
                }
            }
        }
        return false;
    }
}