import java.util.Scanner;
public class Strings_And_IO{
//Strings are strings of characters
//matlab it is a vector of characte
//C++ it is an array of characters
//Java Strings are objects

/*Sting are constand they cannot be changed. Once you create a string you cannot change it's character so if you do change it a ghost variable is created*/
//codePoints: UNknown not taught yet
    public static void main(String [] args){
        String a = "Suzzy";
        String b = "Mark";
        System.out.println(a);
        System.out.println(b);
        

        a = b;
        // two sting cannot be compared
        

        System.out.println(a);
        System.out.println(b);
        
        b = "Mary";

        //Now the memory for b is pointing to "Mary"

        System.out.print(b);

        String c = new String("Mary");

        //a is not == b since they are put in two different alocations of memory and the value is not changed since stings are immutable
        /*for (int i = 0; i < 5; ++i) {
            System.out.println(i);
        }*/
    }
}