package TestQuestion;
import java.util.*;
 class RockPaperScissor {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        //Enter 0 for Rock
        // Enter 1 for Paper
        // Enter 2 for Scissor
        System.out.println("########## Game Start #############");
        System.out.println("Enter 0 for Rock ,Enter 1 for Paper,Enter 2 for Scissor :");
        int userInput=sc.nextInt();

        Random random=new Random();
        int computerInput=random.nextInt(3);
      if(computerInput==userInput){
          System.out.println("==========Match is Drawn===========");
      }
      else if(userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
          System.out.println("-----Congratulation You Win This Match------");
      }
      else{
          System.out.println("------------Computer is Win --------------");
      }
      if(computerInput == 0){
          System.out.println("Computer chioce :: Rock");
      } else if (computerInput == 1) {
          System.out.println("Computer choice :: Paper");
      }
      else if(computerInput == 2){
          System.out.println("Compter chioce :: Scissor");
      }
    }
}
