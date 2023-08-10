import java.util.Scanner;

public class TicTakToe {
    static int next = 0;
    static boolean gameOver = false;

    Scanner scan = new Scanner(System.in);
    static char[][] board = new char[][]{
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'},
    };

    public char[][] getField() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println(" ");
        }
        return board;
    }

    boolean checkGame() {
        int end = 0;
        char X = 'X';
        char O = 'O';

        check(X);
        check(O);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] == '-') {
                    end++;
                }
            }
        }

        if (end == 0) {
            System.out.println("Ничья");
            getField();
            gameOver = true;

        } else {
            System.out.println("");
        }
        return gameOver;
    }


    char check(char a) {

        if (board[0][0] == a && board[0][1] == a && board[0][2] == a) {
            System.out.println("Игра окончена, победил: " + a);
            getField();
            gameOver = true;
        }
        if (board[1][0] == a && board[1][1] == a && board[1][2] == a) {
            System.out.println("Игра окончена, победил: " + a);
            getField();
            gameOver = true;
        }
        if (board[2][0] == a && board[2][1] == a && board[2][2] == a) {
            System.out.println("Игра окончена, победил: " + a);
            getField();
            gameOver = true;
        }
        if (board[0][0] == a && board[1][0] == a && board[2][0] == a) {
            System.out.println("Игра окончена, победил: " + a);
            getField();
            gameOver = true;
        }
        if (board[0][1] == a && board[1][1] == a && board[2][1] == a) {
            System.out.println("Игра окончена, победил: " + a);
            getField();
            gameOver = true;
        }
        if (board[0][2] == a && board[1][2] == a && board[2][2] == a) {
            System.out.println("Игра окончена, победил: " + a);
            getField();
            gameOver = true;
        }
        if (board[0][0] == a && board[1][1] == a && board[2][2] == a) {
            System.out.println("Игра окончена, победил: " + a);
            getField();
            gameOver = true;
        }
        if (board[0][2] == a && board[1][1] == a && board[2][0] == a) {
            System.out.println("Игра окончена, победил: " + a);
            getField();
            gameOver = true;
        }


        return a;
    }

    boolean makeMove(int x, int y) {
        if (gameOver == true) {
            System.out.println("Игра окончена!!!");
        } else {

            if (board[x - 1][y - 1] != '-') {
                System.out.println("Ячейка " + x + ", " + y + " уже занята");
            } else {
                if (next % 2 == 0) {
                    board[x - 1][y - 1] = 'X';
                } else {
                    board[x - 1][y - 1] = 'O';
                }
                next++;

                checkGame();

                if (gameOver == false) {
                    System.out.println("Ход сделан");
                    getField();
                } else {
                    System.out.println("Спасибо за игру!");


                }
            }
        }

        return gameOver;
    }

    void newGame() {
        System.out.println("Игра крестики нолики началась!");
        getField();
        while (gameOver == false) {
            System.out.println("Введите коордитану Х: ");
            int one = scan.nextInt();
            System.out.println("Введите координату У: ");
            int two = scan.nextInt();
            makeMove(one, two);
        }


    }

}
