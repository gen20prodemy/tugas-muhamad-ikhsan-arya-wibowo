import java.util.Scanner;

public class CustException {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Sebutkan tanggal lahir: ");
        int x = scan.nextInt();
        bulanLahir(x);


    }

    private static void bulanLahir(int x){
        if (x <= 0 || x > 31) {
            throw new InvalidBirthDate("Tanggal yang dimasukkan tidak sesuai");
        }
        else {
            System.out.println("Anda lahir tanggal " + x);
        }
    }
}
