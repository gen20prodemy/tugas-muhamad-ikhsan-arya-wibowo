import java.util.Scanner;

public class ThrowException {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter input: ");
        String inputPassed = scan.nextLine();
        int x = Integer.parseInt(inputPassed);
        System.out.println(x);
        throw new NumberFormatException("Input invalid");
    }

}

