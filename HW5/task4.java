/*
 * На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
package HW5;

import java.util.Random;

public class task4 {
    public static class Queen {
        int x, y;
        static int count = 0;

        public Queen(Board board) {
            while (true) {
                // System.out.println("Создаем ферзя");
                Random rnd = new Random();
                int x = rnd.nextInt(8);
                int y = rnd.nextInt(8);
                if (board.cell[x][y] == 0) {
                    this.x = x;
                    this.y = y;
                    count++;
                    break;
                }
            }
        }
    }

    public static class Board {
        int size;
        int[][] cell;

        public Board(int size) {
            this.size = size;
            this.cell = new int[this.size][this.size];
        }

        public void addQueen(Queen queen, int index) {
            this.cell[queen.x][queen.y] = index + 2;
            for (int i = 1; i < 8; i++) {
                int x = queen.x;
                int y = queen.y;
                if ((x + i) < 8 && (y + i) < 8 && (x + i) >= 0 && (y + i) >= 0 && this.cell[x + i][y + i] == 0) {
                    this.cell[x + i][y + i] = 1;
                }
                if ((x + i) < 8 && (y - i) < 8 && (x + i) >= 0 && (y - i) >= 0 && this.cell[x + i][y - i] == 0) {
                    this.cell[x + i][y - i] = 1;
                }
                if ((y + i) < 8 && (y + i) >= 0 && this.cell[x][y + i] == 0) {
                    this.cell[x][y + i] = 1;
                }
                if ((y - i) < 8 && (y - i) >= 0 && this.cell[x][y - i] == 0) {
                    this.cell[x][y - i] = 1;
                }
                if ((x - i) < 8 && (y + i) < 8 && (x - i) >= 0 && (y + i) >= 0 && this.cell[x - i][y + i] == 0) {
                    this.cell[x - i][y + i] = 1;
                }
                if ((x - i) < 8 && (y - i) < 8 && (x - i) >= 0 && (y - i) >= 0 && this.cell[x - i][y - i] == 0) {
                    this.cell[x - i][y - i] = 1;
                }
                if ((x + i) < 8 && (x + i) >= 0 && this.cell[x + i][y] == 0) {
                    this.cell[x + i][y] = 1;
                }
                if ((x - i) < 8 && (x - i) >= 0 && this.cell[x - i][y] == 0) {
                    this.cell[x - i][y] = 1;
                }
            }
        }

        public boolean checkBoard() {
            for (int[] row : this.cell) {
                for (int elem : row) {
                    if (elem == 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        public void print() {
            for (int i = 0; i < this.size; i++) {
                for (int j = 0; j < this.size; j++) {
                    if (this.cell[j][i] == 0 || this.cell[j][i] == 1) {
                        System.out.print(" - ");
                    } else {
                        System.out.printf(" %d ", this.cell[j][i] - 1);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void start() {
        int size = 8;
        Board board = new Board(size);
        nextTurn(board);
    }

    public static void nextTurn(Board board) {
        Queen[] queens = new Queen[8];
        for (int i = 0; i < 8; i++) {
            if (board.checkBoard()) {
                start();
                return;
            }
            queens[i] = new Queen(board);
            board.addQueen(queens[i], i);
        }
        board.print();
    }

    public static void main(String[] args) {
        start();
    }
}
