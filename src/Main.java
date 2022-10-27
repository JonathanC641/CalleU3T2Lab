import java.util.Scanner;
public class Main {
    public static void main(String[] args){
//        // Tell the user to enter a question
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Welcome to the Magic 8 Ball!");
//        System.out.print("Enter a yes-no question and I will answer it: ");
//        String question = scan.nextLine();
//        String response = "";  // update this variable with the response
//        int num = (int) (Math.random() * 6) + 1;
//        if (num == 1){
//            response = "Yes";
//        } else if (num ==2) {
//            response = "NOPE";
//        } else if (num == 3) {
//            response = "Perhaps";
//        } else if (num == 4) {
//            response = "You wish lol";
//        } else if (num == 5) {
//            response = "Ask again later";
//        } else if (num == 6) {
//            response = "This question is beyond my abilities";
//        }
//        System.out.println(response);  // print response

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();
        boolean value1 = num % 5 == 0;
        boolean value2 = num % 7 ==0;
        boolean even = num % 2 ==0;
        boolean odd = num % 2 != 0;
        if (num <= 0){
            System.out.println("That's not positive!");
        }else if (num > 0 && value1 && value2 && odd){
            System.out.println("Divisible by 5!");
            System.out.println("Divisible by 7!");
        }else if (num > 0 && value1 && odd){
            System.out.println("Divisible by 5!");
        }else if (num > 0 && value2 && odd){
            System.out.println("Divisible by 7!");
        }else if (num > 0 && value1 != true && value2 != true && odd){
            System.out.println("Not divisible by 5 or 7");
        }else if (even && num > 1000){
            System.out.println("Big even number!");
        }else if (num > 100 && num < 1000){
            System.out.println("Medium even number!");
        }else if(num < 100){
            System.out.println("Small even number!");
        }


    }
}
