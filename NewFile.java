import java.io.*;

class FileEx1{
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("Test1.txt");
        fr.write("This is an example file to create and write in new and existing file");
        fr.close();
    }
}