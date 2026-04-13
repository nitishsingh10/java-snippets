import java.util.Scanner;

/** This class is responsible for the Guesser's functionality.
 * It allows the Guesser to choose a number.
 * The Guesser's chosen number is stored in the variable Gnum.
 * @return The Guesser's chosen number.
 * <p>
 * This number is used by the Umpire to compare with the Players' guesses.
 * </p>
 */

class Guesser{

    int Gnum;

    int ChooseNum(){

        System.out.println("Kindly choose a Number ! ");

        Scanner scan = new Scanner(System.in);

        Gnum = scan.nextInt();

        return Gnum;
    }

}

/**
 * This class is responsible for the Player's functionality
 * <p>
 * This class allows the Player to guess a number.
 * </p>
 * <p>
 * The Player's guessed number is stored in the variable Pnum.
 * This number is used by the Umpire to compare with the Guesser's chosen number.
 * </p>
 * @param p The player number.
 * @return The Player's guessed number.
 * 
 */

class Player{

    int Pnum;

    int GuessNum(int p){

        System.out.println("Take a Guess player " + p);

        Scanner scan = new Scanner(System.in);

        Pnum = scan.nextInt();

        return Pnum;
    }
}

/**
 * <p>
 * This class is responsible for conducting the game.
 * It interacts with the Guesser and Players to facilitate the game.
 * It creates instances of the Guesser and Players.
 * It compares the Guesser's chosen number with the Player's guessed numbers and determines the winner.
 * </p>
 * @return The Umpire's result.
 * <p>
 * This result is determined by comparing the Guesser's chosen number with the Players' guessed numbers.
 * </p>
 */

class Umpire{

    int numGuesser;
    int numPlayer1;
    int numPlayer2;
    int numPlayer3;

    void getGnum(){

        Guesser g = new Guesser();
        numGuesser = g.ChooseNum();

    }

    void getPnum(){

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numPlayer1 = p1.GuessNum(1);
        numPlayer2 = p2.GuessNum(2);
        numPlayer3 = p3.GuessNum(3);


    }

    void Compare(){

        System.out.println("Player 1's Guess is, "+numPlayer1);
        System.out.println("Player 2's Guess is, "+numPlayer2);
        System.out.println("Player 3's Guess is, "+numPlayer3);

    }

    void Results(){

        if(numGuesser == numPlayer1){
            System.out.println("Player 1 Wins !");
        }
        else if(numGuesser == numPlayer2){
            System.out.println("Player 2 Wins !");
        }
        else if(numGuesser == numPlayer3){
            System.out.println("Player 3 Wins !");
        }
        else{
            System.out.println("No winner");
        }

    }
}

/**

 * This class is responsible for the main functionality of the game.

 */

public class Main{

    public static void main(String[] args) {
        Umpire u = new Umpire();

        u.getGnum();
        u.getPnum();
        u.Compare();
        u.Results();

    }
}