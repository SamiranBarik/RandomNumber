//import java.util.Random;
import java.util.Random;
import java.util.Scanner;
 public class Rngame
 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random rd=new Random();
        int score=0;
        int round=1;
        
        for (int i = 0; i < 5; i++)
        {
            int numberguess=rd.nextInt(10)+1;
            System.out.println("Guess a number between 1 - 10:");
            int userguess=sc.nextInt();

            if(userguess==numberguess)
            {
                System.out.println("Congratulation you are generating corectly");
                score++;
                numberguess=rd.nextInt(10)+1;
                round++;
                System.out.println("your score is now"+ score +"and you have played"+ round +"Rounds");
            }
            else{
                System.out.println("Better luck Next Time");
            }

        }
    System.out.println("Game over! your final score is"+ score +"after"+ round+"Rounds");  

    }
}
