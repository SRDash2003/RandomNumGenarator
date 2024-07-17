import java.util.Scanner;
class randomng
{
    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        int number=(int)(Math.random()*100);
        int num;
        do{
            System.out.print("\nGuess the number(0-100)= ");
            num=sc.nextInt();

            if(num==0) {
                System.out.print("GoodBye");
                break;
            }
            else if(num==number)
            {
                System.out.print("YAYYY!!!! U guessed the right number \nGoodBye....");
                break;
            }
            else if(num>number)
            {System.out.print("ur number is greater, guess smaller");}
            else
            {System.out.print("ur number is smaller, guess greater");}
        }while(num>0);

    }
}