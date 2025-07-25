import java.io.*;
import java.util.*;

class FileEx1{
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("Test1.txt");//cretes new file named as Test1.txt
        fr.write("This is an example file to create and write in new and existing file");
        fr.close();

        File f = new File("Test2.txt");
        if(f.createNewfile) {
            System.out.println("File created");//output
        } else {
            System.out.println("File not created");//giving output
        }

        File f2 = new File("Test5.txt");
        Scanner sc = new Scanner(f2);
        if(sc.hasNextLine()) {
            String s =sc.nextLine();//taking input 
            System.out.println(s);
        }

        int a = sc.nextInt();//taking input 
        int b = sc.nextInt();

        a=a+b;//swap without using third variable
        b=a-b;//to swap to numbers without using third variable
        a=a-b;//to swap to numbers without using third variable

        System.out.println(a);//printing value
        System.out.println(b);//printing value
        

        int a[] = new int[2];//arrays
		try{//using try and catch block
		    System.out.println("a[4]:"+a[4]);
		} catch(ArrayIndexOutOfBoundsException e) {
		    System.out.println(e);
		} finally {//using finally keyword
		    a[1]= 30;
		    System.out.println("a[1]:"+a[1]);//printing  the values
		    System.out.println("End of the program");//printing value
		}
        
    }
}

