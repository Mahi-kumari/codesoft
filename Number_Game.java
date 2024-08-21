import java.util.Scanner;
public class Number_Game{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int chances=8;
        int finals=0;
        boolean playAgain=true;
        System.out.println("WELCOME");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0; i<chances; i++){
                System.out.println("chance"+(i+1)+"  Enter your guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You Won");
                    break;
                }
                else if(user>rand){
                    System.out.println("Too High");
                }
                else{
                    System.out.println("Too low");
                }
            }
            if(guess==false){
                System.out.println("Sorry! You lost the chances. The Number is "+rand);
            }
            System.out.println("Do You Want to play Again(y/n)");
            String pa=sc.next();
            playAgain=pa.equalsIgnoreCase("y");
        }
        System.out.println("Here is your score"+ finals);
    }
    public static int getrandN(int min, int max){
        return(int)(Math.random()*(max-min+1)+min);
    }
}