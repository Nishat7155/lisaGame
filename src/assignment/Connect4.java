package assignment;

public class Connect4 {

    private static char[][] GameBoard = new char[6][7];
    private static int row = 0;

    public static void PrintBoard(int column, char suit) {

        //this part will print the game bord
        //in this bord we have 7 column
        // 6 rows

        System.out.println("_ + _ + _ + _ + _ + _ + _");
        row = 5;
        while((GameBoard[row][column] == 'x') || (GameBoard[row][column] == 'o')) {
            row--;

        }

        GameBoard[row][column] = suit;

        for(int rowIndex = 0; rowIndex < 6; rowIndex++) {
            for(int columnIndex = 0; columnIndex < 7; columnIndex++) {
                System.out.print(GameBoard[rowIndex][columnIndex]);
                if(columnIndex < 6) {
                    System.out.print(" | ");
                }

            }if(rowIndex < 5) {
                System.out.println("\n---+---+---+---+---+---+---");
            }

        }
        System.out.println("\n");

    }

    public static String checkWinner() {

        String GameWinner = "";
        int Oponent1 = 0;
        int Oponent2 = 0;



        //Check Columns first
        for(int columIndex = 0; columIndex < 6; ++columIndex) {
            for(int rowIndex = 5; rowIndex > 0; --rowIndex) {
                if(GameBoard[rowIndex][columIndex] == 'x'
                        && (GameBoard[rowIndex -1][columIndex] == GameBoard[rowIndex][columIndex])) {
                    Oponent1++;
                }else if(GameBoard[rowIndex][columIndex] == 'o'
                        && (GameBoard[rowIndex -1][columIndex] == GameBoard[rowIndex][columIndex])) {
                    Oponent2++;
                }

            }
            if(Oponent1 == 3){
                GameWinner = "Player 1";
                break;
            }
            if(Oponent2 == 3) {
                GameWinner = "Player 2";
                break;
            }
            Oponent1 = 0;
            Oponent2 = 0;
        }

        //this one is for checking Rows

        for(int rowIndex = 5; rowIndex > 0; --rowIndex) {
            for(int columnIndex = 0; columnIndex < 6; ++columnIndex) {
                if(GameBoard[rowIndex][columnIndex] == 'x'
                        && (GameBoard[rowIndex][columnIndex +1] == GameBoard[rowIndex][columnIndex])) {
                    Oponent1++;
                }else if(GameBoard[rowIndex][columnIndex] == 'o'
                        && (GameBoard[rowIndex][columnIndex +1] == GameBoard[rowIndex][columnIndex])) {
                    Oponent2++;
                }

            }
            if(Oponent1 == 3){
                GameWinner = "Player 1";
                break;
            }
            if(Oponent2 == 3) {
                GameWinner = "Player 2";
                break;
            }
            Oponent1 = 0;
            Oponent2 = 0;
        }


        for(int colmnIndx = 0; colmnIndx < 4; ++colmnIndx) {
            for(int rowIndx = 3; rowIndx > 0; --rowIndx) {
                if(GameBoard[rowIndx][colmnIndx] == 'x'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent1++;
                }
                if(GameBoard[rowIndx][colmnIndx] == 'o'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent2++;
                    System.out.println(Oponent2);
                }
            }
            if(Oponent1 == 4){
                GameWinner = "Player 1";
                break;
            }
            if(Oponent2 == 4) {
                GameWinner = "Player 2";
                break;
            }
            Oponent1 = 0;
            Oponent2 = 0;
        }

        for(int colmnIndx = 0; colmnIndx < 5; ++colmnIndx) {
            for(int rowIndx = 4; rowIndx > 0; --rowIndx) {
                if(GameBoard[rowIndx][colmnIndx] == 'x'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent1++;
                }
                if(GameBoard[rowIndx][colmnIndx] == 'o'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent2++;
                    System.out.println(Oponent2);
                }
            }
            if(Oponent1 == 4){
                GameWinner = "Player1";
                break;
            }
            if(Oponent2 == 4) {
                GameWinner = "Player2";
                break;
            }
            Oponent1 = 0;
            Oponent2 = 0;
        }

        for(int colmnIndx = 0; colmnIndx < 5; ++colmnIndx) {
            for(int rowIndx = 5; rowIndx > 0; --rowIndx) {
                if(GameBoard[rowIndx][colmnIndx] == 'x'
                        && (GameBoard[rowIndx - 1][colmnIndx + 1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent1++;
                }else if(GameBoard[rowIndx][colmnIndx] == 'o'
                        && (GameBoard[rowIndx - 1][colmnIndx + 1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent2++;
                }
            }
            if(Oponent1 == 4){
                GameWinner = "Player1";
                break;
            }
            if(Oponent2 == 4) {
                GameWinner = "Player2";
                break;
            }
            Oponent1 = 0;                                                                                           //Counterreset
            Oponent2 = 0;
        }


        for(int colmnIndx = 1; colmnIndx < 6; ++colmnIndx) {
            for(int rowIndx = 5; rowIndx > 0; --rowIndx) {
                if(GameBoard[rowIndx][colmnIndx] == 'x'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent1++;
                }
                if(GameBoard[rowIndx][colmnIndx] == 'o'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent2++;
                }
            }
            if(Oponent1 == 4){
                GameWinner = "Player1";
                break;
            }
            if(Oponent2 == 4) {
                GameWinner = "Player2";
                break;
            }
            Oponent1 = 0;
            Oponent2 = 0;
        }


        for(int colmnIndx = 2; colmnIndx < 6; ++colmnIndx) {
            for(int rowIndx = 5; rowIndx > 0; --rowIndx) {
                if(GameBoard[rowIndx][colmnIndx] == 'x'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent1++;
                }
                if(GameBoard[rowIndx][colmnIndx] == 'o'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent2++;
                }
            }
            if(Oponent1 == 4){
                GameWinner = "Player1";
                break;
            }
            if(Oponent2 == 4) {
                GameWinner = "Player2";
                break;
            }
            Oponent1 = 0;
            Oponent2 = 0;
        }


        for(int colmnIndx = 3; colmnIndx < 6; ++colmnIndx) {
            for(int rowIndx = 5; rowIndx > 0; --rowIndx) {
                if(GameBoard[rowIndx][colmnIndx] == 'x'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent1++;

                }
                if(GameBoard[rowIndx][colmnIndx] == 'o'
                        && (GameBoard[rowIndx -1][colmnIndx +1] == GameBoard[rowIndx][colmnIndx])) {
                    Oponent2++;
                }
            }
            if(Oponent1 == 4){
                GameWinner = "Player1";
                break;
            }
            if(Oponent2 == 4) {
                GameWinner = "Player2";
                break;
            }
            Oponent1 = 0;
            Oponent2 = 0;
        }

        return GameWinner;
    }
}
