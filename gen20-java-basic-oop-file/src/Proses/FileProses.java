package Proses;

import Interface.IFiles;
import java.io.*;

public class FileProses implements IFiles {

    @Override
    public void createFile(CRUD data) {
        try{
            BufferedWriter text = new BufferedWriter(new FileWriter("C:\\#prodemy\\gen20-java-basic-oop-file\\filebaru.txt"));
            text.write(data.getData());
            text.close();
            System.out.println("\nBerhasil membuat \"filebaru.txt\"");
        }
        catch (IOException e){
            e.getMessage();
        }
    }

    @Override
    public void readFile() {
        try{
            BufferedReader read = new BufferedReader(new FileReader("C:\\#prodemy\\gen20-java-basic-oop-file\\filebaru.txt"));
            String currentLine;
            while ((currentLine = read.readLine()) !=null){
                System.out.println(currentLine);
            }
            read.close();
        }
        catch (IOException e) {
            e.getMessage();
        }
    }

    @Override
    public void updateFile(CRUD crud) {
        try {
            FileWriter update = new FileWriter("C:\\#prodemy\\gen20-java-basic-oop-file\\filebaru.txt",true);
            update.append("\n"+crud.getData());
            update.close();
        } catch (IOException e) {
            System.err.println("Gagal menambahkan" + e.getMessage());
        }
    }

    @Override
    public void deleteFile(int row) {
        String tempFile = "C:\\#prodemy\\gen20-java-basic-oop-file\\temp.txt";
        File oldFile = new File("C:\\#prodemy\\gen20-java-basic-oop-file\\filebaru.txt");
        File newFile = new File(tempFile);
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile, true));
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader("C:\\#prodemy\\gen20-java-basic-oop-file\\filebaru.txt");
            BufferedReader br = new BufferedReader(fr);

            int line = 0;
            String currentLine;
            while ((currentLine = br.readLine()) != null)
            {
                line++;

                if(row != line){
                    pw.println(currentLine);
                }
            }

            pw.flush();
            pw.close();
            fr.close();
            br.close();
            pw.close();

            oldFile.delete();
            File dump = new File("C:\\#prodemy\\gen20-java-basic-oop-file\\filebaru.txt");
            newFile.renameTo(dump);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}