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

        SelectionMadness madness = new SelectionMadness();

        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());
        System.out.println(madness.flipCoin());

        // test largest
        System.out.println(madness.largest(5, 8, 3));
        System.out.println(madness.largest(8, 5, 3));
        System.out.println(madness.largest(3, 5, 8));
        System.out.println(madness.largest(-5, -8, -3));
        System.out.println(madness.largest(11, 11, 10));

        System.out.println(madness.rightTriangle(3, 4, 5));
        System.out.println(madness.rightTriangle(5, 4, 3));
        System.out.println(madness.rightTriangle(6, 8, 10));
        System.out.println(madness.rightTriangle(8, 10, 6));
        System.out.println(madness.rightTriangle(3, 6, 5));
        System.out.println(madness.rightTriangle(1, 2, 3));


    }
}
