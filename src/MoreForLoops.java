import java.util.Scanner;
public class MoreForLoops {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int i;
        // odd numbers from 1-20
        for (i=1; i<=20; i+=2){
            System.out.println(i);
        }
        // even numbers from 1-20
        for (i=2; i<=20; i+=2){
            System.out.println(i);
        }

        // Reverse the word Program
        System.out.println("Please select a word to be reversed.");
        String str_1 = scn.nextLine();
        String str_2 = "";
        int x = str_1.length();
        for (i=x-1; i>=0; i--){
            str_2+=str_1.charAt(i);
        }
        System.out.println(str_2);

        //Print the factors of an input.
        System.out.println("Enter a number to know the factors: ");
        int input_A = scn.nextInt();
        for (i = 1; i < input_A; i+=1){
            if (input_A%i == 0){        // mod operation to find divisible numbers.
                System.out.println(i);
            }
        }

        System.out.println("Enter a number to know its factorial: ");
        String fact_str = "";
        int product = 1;
        int input_B = scn.nextInt();
        for (i=1; i <= input_B; i+=1){
            product*=i;
            Integer.toString(i);        //convert the integers to strings as they are calculated
            if (i<input_B)              //append my empty string  with the integers turned strings
            fact_str += i + "*";        //add an if statement to prevent the loop from adding one more * than I want
            else {                      //use the else statement to "put a bow on it"
                fact_str += i + "=" + product;
                System.out.println("The factorial of " + input_B + " is " + fact_str);
            }
        }
    }
}
