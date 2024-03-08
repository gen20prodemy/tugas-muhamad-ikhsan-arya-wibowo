package Main;

import CRUD.DataSiswa;
import CRUD.MapSiswa;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MapSiswa mapSiswa = new MapSiswa();
        while (true){
            System.out.println("Selamat datang di SDN 01 Pagi");
            System.out.println("1. Tambahkan data siswa");
            System.out.println("2. Lihat data siswa");
            System.out.println("3. Perbarui data siswa");
            System.out.println("4. Hapus data siswa");
            System.out.println("5. Exit");
            try {
                int i = scan.nextInt();
                switch (i){
                    case 1 :
                        addData(mapSiswa, scan);
                        System.out.println();
                        break;
                    case 2:
                        readData(mapSiswa);
                        System.out.println();
                        break;
                    case 3 :
                        updateData(mapSiswa, scan);
                        System.out.println();
                        break;
                    case 4 :
                        deleteData(mapSiswa, scan);
                        System.out.println();
                        break;
                    case 5 :
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Input yang dimasukkan tidak sesuai");
                        System.out.println();
                        break;
                }
            }catch (InputMismatchException e){
                System.err.println("Incorrect pin! " + e.getMessage());
                break;
            }

        }
    }

    public static void addData(MapSiswa mapSiswa, Scanner scan){
        try{
            System.out.print("Input ID Siswa: ");
            int id = scan.nextInt();
            System.out.println("Input nama Siswa: ");
            scan.nextLine();
            String name = scan.nextLine();
            DataSiswa siswa = new DataSiswa(id, name);
            mapSiswa.createMap(siswa);
        }catch (InputMismatchException e){
            System.err.println("\nIncorrect pin! " + e.getMessage());
        }

    }
    public static void updateData(MapSiswa mapSiswa, Scanner scan){

        try {
            System.out.print("Input ID Siswa: ");
            int id = scan.nextInt();
            System.out.print("Input nama Siswa: ");
            scan.nextLine();
            String a = scan.nextLine();

            DataSiswa newSiswa = new DataSiswa(id, a);
            newSiswa.setName(a);
            newSiswa.setId(id);

            mapSiswa.updateMap(newSiswa);
        }catch (InputMismatchException e){
            System.err.println("\nIncorrect pin! " + e.getMessage());
        }

    }
    public static void readData(MapSiswa mapSiswa){
        System.out.println("ID\t: Nama Siswa");
        System.out.println("----------------------");
        mapSiswa.readMap();

    }
    public static void deleteData(MapSiswa mapSiswa, Scanner scan){
        try {
            System.out.println("Input ID yang ingin di hapus: ");
            int id = scan.nextInt();
            DataSiswa idSiswa = new DataSiswa(id);
            mapSiswa.deleteMap(idSiswa);
        }catch (InputMismatchException e){
            System.err.println("\nIncorrect pin! " + e.getMessage());
        }

    }
}
