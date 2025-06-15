import java.io.*;
import java.util.*;

class FileEx1{
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("Test1.txt");//cretes new file named as Test1.txt
        fr.write("This is an example file to create and write in new and existing file");
        fr.close();

        File f = new File("Test2.txt");
        if(f.createNewfile) {
            System.out.println("File created");
        } else {
            System.out.println("File not created");
        }
    }
}

