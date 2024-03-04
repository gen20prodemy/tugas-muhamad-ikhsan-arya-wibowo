import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter input: ");
        String inputPassed = scan.nextLine();
        if (inputPassed.equals("input")){
            System.out.println("Input valid");
        }
        else {
            throw new NumberFormatException("Input invalid");
        }

    }
}
