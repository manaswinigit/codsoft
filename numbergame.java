
import java.util.Scanner;
public class numbergame {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int chances = 6;
                int finals=0;
                boolean PLAYAGAIN=true;
                System.out.println("Welcome Dear!");
                System.out.println("You have "+chances+" chances to win the game ");
                while(PLAYAGAIN){
                    int random=getrandN(1,100);
                    boolean guess=false;
                    for(int i=0;i<chances;i++)
                    {
                        System.out.println("Chance "+(i+1)+" Enter your guess:");
                        int user=sc.nextInt();
                        if(user==random){
                            guess=true;
                            finals+=10;
                            System.out.println("congo ! You won!!!");
                            break;
                        }
                        else if(user>random){
                            System.out.println("it is too high");
                        }
                        else{
                            System.out.println("it is too low");
                        }
                    }
                    if(guess==false){
                        System.out.println("Sorry dear,your chances are finished.There you go the number is--> "+random);

                    }
                    System.out.println("Would you like to play again?(y/n)");
                    String pA=sc.next();
                    PLAYAGAIN=pA.equalsIgnoreCase("y");

                }
                System.out.println(":) Hope you enjoyed the game!! :)");
                System.out.println("Here is your score "+finals);
            }
                public static int getrandN(int min,int max){
                    return (int)(Math.random()*(max-min+1)+min);
                }   


    
}
