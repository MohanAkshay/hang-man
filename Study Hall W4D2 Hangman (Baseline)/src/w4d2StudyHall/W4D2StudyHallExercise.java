package w4d2StudyHall;

 

import java.util.Scanner;

 

public class W4D2StudyHallExercise

{

              /* Replace this line with a proper header which includes your name */

             

private static String usersName;

private static String inputFromUser;

private static char menuCharacter;

             

              public static void main(String args[])

             

              {

                           /* Initialize the Text Hangman game */

                          

                           Scanner akshay= new Scanner(System.in);

             

                           /* Welcome the user and request the user to enter a name */

System.out.println("welcome!");

System.out.println("please enter your name followed by return");

                          

String usersName= akshay.nextLine();

 

/* Read in the user's name */

 

 

System.out.println("enter your name" +usersName);

 

 

                           while (true)

                           {

                                        

                                        

 

                                         System.out.println("enter your name" +usersName);

                                        

                                         /* Display menu */

System.out.println( usersName+ "please enter a command letter followed by a return!");

 

                                         /* Read the menu character */

 

System.out.println("p-> Play the game");

System.out.println("s->view statistics");

System.out.println("q-> Quit");

 

 

menuCharacter = akshay.next().charAt(0);

 

if( menuCharacter == 'p')

{

 

              System.out.println("play the game command recognised");

System.out.println("please enter a command letter followed by a return!");

 

/* Read the menu character */

System.out.println("p-> Play the game");

System.out.println("s->view statistics");

System.out.println("q-> Quit");

}

 

                                         /* Play the game? */

else if( menuCharacter == 's')

{

             

System.out.println("View the statistics command recognized.");

System.out.println("Akshay, please enter a command letter followed by a return!");

System.out.println("play the game");

System.out.println("s->view statistics");

System.out.println("q-> Quit");

 

menuCharacter = akshay.next().charAt(0);

}

 

                                         /* View the statistics? */

 

/* Quit the game? */

else if( menuCharacter == 'q')

{

 

System.out.println("Quit the game command recodnized");

System.out.println("Thanks for plaiyng Akshay");

}

 

 

else

{

System.out.println("***Error***");

 

System.out.println(" Invalid menu item entered.  It must be p, s, or q! ");

System.out.println(" The input found was: w ");

System.out.println("Akshay, please enter a command letter followed by a return!");

System.out.println("play the game");

System.out.println("s->view statistics");

System.out.println("q-> Quit");

 

                                         /* Display error (if command is none of the above) */

 

}

                           }

              }

}