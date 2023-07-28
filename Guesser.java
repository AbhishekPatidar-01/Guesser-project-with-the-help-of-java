import java.util.Scanner;

class Guesser
{
int guesserNum;

int  GuessingNum()
{
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter guesser number");
    guesserNum = scan.nextInt();
    return guesserNum;
 }
}

class players
{
 int playerNum;

 int GuesNumber()
 {
    Scanner scan = new Scanner(System.in);

    System.out.println("Player Guess the Number");
    playerNum=scan.nextInt();
    return playerNum;
 }
}

class Umpire
{
   int numFromGuesser;
   int numFromPlayer1;
   int numFromPlayer2;
   int numFromPlayer3;


 void collectFromGuesserNumber()
 {
     
    Guesser g = new Guesser();
    numFromGuesser= g.GuessingNum();

 }

 void collectFromPlayerNumber()
 {
    players p1 = new players();
    numFromPlayer1 =p1.GuesNumber();

    players p2 = new players();
    numFromPlayer2 = p2.GuesNumber();

    players p3 = new players();
    numFromPlayer3 = p3.GuesNumber();
 }

 void compare()
 {
    if(numFromGuesser == numFromPlayer1)
    {
        if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3)
        {
         System.out.println("All players are Won ");
        }
        else if(numFromGuesser == numFromPlayer2)
        {
            System.out.println("Player 1 and 2 won ");
        }
        else if(numFromGuesser == numFromPlayer3)
        {
            System.out.println("Player 1 and 3 won");
        }
        else
        {
        System.out.println("Player 1 won");
        }
    }

    else if (numFromGuesser == numFromPlayer2)
    {
        if(numFromGuesser == numFromPlayer3)
        {
        System.out.println("Player 2 and 3 won");
        }
        else{
            System.out.println("Player 2 won ");
        }
    }

    else if(numFromGuesser == numFromPlayer3)
    {
        System.out.println("Won the player 3");
    }
    else
    {
        System.out.println("All players are loss ");
    }
 }



}



 class HelloWorld {
    public static void main(String[] args) {
        Umpire u = new Umpire();
        u.collectFromGuesserNumber();
        u.collectFromPlayerNumber();
        u.compare();

    }
}
