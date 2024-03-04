import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        int a = scan.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scan.nextInt();
        arithmetic(a, b);
        System.out.println("end process.");
    }

    public static void arithmetic(int a, int b){
        try {
            System.out.println("Nilai dari a/b adalah: " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("error. " + e.getMessage());
            System.exit(1);
        }finally{
            System.out.println("continue process.");
        }
    }

}