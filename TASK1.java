import java.util.Scanner;
import java.util.Random;

class NumberGame{
    
    public static Scanner sc=new Scanner(System.in);
    
    public static void printGameRules(){
        System.out.println("----------WELCOME TO NUMBER GAME-----------");
        System.out.println("You have to guess My number here. You will be provided with 10 attempts for each round and you can play as many rounds as you want!!!");
        System.out.println("RULES:");
        System.out.println("1.Each round will have 10 attempts.");
        System.out.println("2.At start of each round you will be given 10 points.");
        System.out.println("3.For each attempt you take 1 point will be deduced from your score");
        System.out.println("4.My number will always lie between 1 and 100");
        System.out.println("----------------GOOD LUCK-----------------");
    }
    
    public static int playGame(String name){
        Random rand=new Random();
        int score=0;
        int flag=0;
        boolean cond=true;
        int round_count=1;
        while (cond==true){
            System.out.println("Round "+round_count);
            score+=10;
            int my_num=rand.nextInt(100);
            for(int i=1;i<=10;i++){
                System.out.print("Enter your guess:");
                int user_guess=sc.nextInt();
                if(user_guess==my_num){
                    System.out.println("Congratulations!! "+name+" You won!!");
                    flag=1;
                    break;
                }
                else if(user_guess<my_num){
                    System.out.println("Your guess is less than my number");
                    score-=1;
                }
                else{
                    System.out.println("Your guess is greater than my number");
                    score-=1;
                }
            }
            if(flag==0){
                System.out.println("My number is:"+my_num+". Good luck next time!!");
            }
            sc.nextLine();
            char ch;
            System.out.println("Do you want to continue (y/n) ? ");
            ch=sc.nextLine().charAt(0);
            if(ch=='y'||ch=='Y'){
                cond=true;
                round_count+=1;
            }
            else{
                cond=false;
            }
        }
        return score;
    }
    
    public static void printScore(int score,String name){
        System.out.println(name+", your score is: "+score);
    }
    
     public static void main(String[] args) {
        printGameRules();
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        int score=playGame(name);
        printScore(score,name);
    }
}