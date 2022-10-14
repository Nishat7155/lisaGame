package assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        String choice1 = null;
        boolean selectName = true;

        Scanner scanner = new Scanner(System.in);
        Connect4 PrintBoard = new Connect4();
        String GameWinner = "";

      do {


        System.out.println("<------------Connect4------------->");
        System.out.println("Hello and welcome to Connect 4!!");
        System.out.println();
        System.out.println("Hello Player 1!!! ");
        System.out.println("-> Are you human or computer? ");

        Scanner in = new Scanner(System.in);
        String ans = in.nextLine();

        if (ans.equals("human")) {
            System.out.println("What is your name ?");

            String name = in.nextLine();
            System.out.println("Welcome to connect 4 game  " + name);
        } else {
            System.out.println("Welcome to connect 4 game ");

        }
        System.out.println("Hello Player 2!!! ");
        System.out.println("->Are you Human or computer ?");

        String ans2 = in.nextLine();

        if (ans2.equals("human")) {
            System.out.println("What is your name? ");
            String name2 = in.nextLine();
            System.out.println("Welcome to connect 4 game " + name2);
        } else {
            System.out.println("Welcome to connect 4 game ");
        }

        while(GameWinner.equals("")){


            System.out.println( "Player 1, which column do you want to choose?");
            Connect4.PrintBoard(0, ' ');
            int choice2 = scanner.nextInt()-1;
            Connect4.PrintBoard(choice2, 'x');
            GameWinner = Connect4.checkWinner();
            if(GameWinner != ""){
                break;
            }
            System.out.println("Player 2, which column do you want to choose?");
            choice2 = scanner.nextInt()-1;
            Connect4.PrintBoard(choice2, 'o');
            GameWinner = Connect4.checkWinner();
        }

        System.out.println(GameWinner + " wins!!! Congratulation!!!!");
        //scanner.close();

        System.out.println("Do you want to continue the the game? (y/n)");
        Scanner scanner1 =new Scanner(System.in);
        String option = scanner1.nextLine();

        if (option.equals("y")){
            System.out.println("You want to keep the same settings?(y/n)");
            choice1= scanner1.nextLine();
            if (choice1.equals("y")){
                selectName = false;
            }else   {
                selectName= true;
            }

        }else {
            break;
        }






      }while (true);



    }
}
