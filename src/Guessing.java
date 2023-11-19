import java.util.Random;
import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Random rand=new Random();
        int randNumber= rand.nextInt(100);
        Scanner input=new Scanner(System.in);
        int right=0;

        while (right<5){
            System.out.println("     --------------------");
            System.out.print("Please enter a number between 1-100: ");
            int inputNumber= input.nextInt();
            if (inputNumber<100&&inputNumber>0){
                if(inputNumber==randNumber){
                    System.out.println("Congratulations, your number guess is correct");
                    break;
                }else {
                    right++;
                    if (right==5){
                        System.out.println("Remaining attempts:"+(5-right));
                        System.out.println("Correct number is:"+randNumber);
                        System.out.println("Game over.");
                    }else {
                        if(inputNumber>randNumber){
                            System.out.println("Guess is greater than  secret number.");
                        }else {
                            System.out.println("Guess is smaller than  secret number");
                        }
                        System.out.println("Your number guess is not correct. Please try again");
                        System.out.println("Remaining attempts:"+(5-right));

                    }
                }

            }else {
                System.out.println("you entered an invalid number, try again.");
                right++;
                System.out.println("Remaining attempts:"+(5-right));
            }
        }

    }
}
