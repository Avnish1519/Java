import java.util.*;
class basics{
    public static void main(String[] args){

        //Using String Literal
        String name="Avnish Singh";
        String college="Galgotias University";
        String greeting="Welcome to my coding world";

        //Using new Keyword
        String str1= new String("Hello");
        String str2 = new String("Hello, World!");
        System.out.println(name);//printing output
        System.out.println(college);//printing output
        System.out.println(str1);

        int length = str1.length(); // Returns the length of the string
        // Correcting the typo and comment:
        String str3 = str1.concat(" How are you!"); // Concatenate str1 and the new String
        System.out.println(str2);
        System.out.println(length);//printing output
        char ch = str1.charAt(0); // Returns 'H' finds char at place

        
        // Correcting the substring usage:
        String sub = str2.substring(7, 12); // Returns "World"
        String replacedStr = str1.replace('H', 'J'); // Returns "Jello, World!"
        String upperStr = str2.toUpperCase(); // Returns "HELLO, WORLD!"
        String lowerStr = str2.toLowerCase(); // Returns "hello, world!"
        boolean isEqual = str1.equals(str2); // Returns false as str1 and str2 are different
        int comparison = str1.compareTo(str2); // Returns a negative number as str1 < str2

        //Printing the output 
        System.out.println("Concatenated String: " + str3);  //printing concatenated string
        System.out.println("Character at position 0 in str1: " + ch);
        System.out.println("Substring from str2: " + sub);//for output of substring
        System.out.println("String with replaced character: " + replacedStr);
        System.out.println("Uppercase String: " + upperStr);  //printing Uppercase string
        System.out.println("Lowercase String: " + lowerStr);
        System.out.println("Are str1 and str2 equal? " + isEqual);
        System.out.println("Comparison result: " + comparison);  //printing comparison result
    }
}
