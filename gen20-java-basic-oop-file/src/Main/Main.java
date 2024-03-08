package Main;

import Proses.CRUD;
import Proses.FileProses;
import Proses.GetterSetter;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        FileProses proses = new FileProses();
        while (true) {
            System.out.println("\nSilahkan masukkan input!");
            System.out.println("1. Create file \".txt\"");
            System.out.println("2. Read file \".txt\"");
            System.out.println("3. Update file \".txt\"");
            System.out.println("4. Delete file \".txt\"");
            System.out.println("5. Exit");
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    System.out.println("\nMembuat \"filebaru.txt\"");
                    makeFile(proses, scan);
                    break;
                case 2:
                    System.out.println("\nMembaca \"file.txt\"");
                    readFile(proses);
                    break;
                case 3:
                    System.out.println("\nMenambah \"file.txt\"");
                    updateFile(proses, scan);
                    break;
                case 4:
                    System.out.println("\nMenghapus \"file.txt\"");
                    deleteFile(proses, scan);
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("\nInput yang dimasukkan tidak sesuai!");
                    break;
            }
        }
    }

    public static void makeFile(FileProses proses, Scanner scan){
        System.out.println("Isi text: ");
        scan.nextLine();
        String isiData = scan.nextLine();
        GetterSetter data = new GetterSetter(isiData);
        proses.createFile(data);
    }

    public static void readFile(FileProses proses){
        System.out.println("\nMembaca filebaru.txt");
        proses.readFile();
    }

    public static void updateFile(FileProses proses, Scanner scan){
        System.out.println("Isi text: ");
        scan.nextLine();
        String isiData = scan.nextLine();
        GetterSetter data = new GetterSetter(isiData);
        proses.updateFile(data);
    }

    public static void deleteFile(FileProses proses, Scanner scan){
        System.out.println("Menghapus row terakhir dalam file");
        System.out.println("row number: ");
        int row = scan.nextInt();
        proses.deleteFile(row);
    }
}
