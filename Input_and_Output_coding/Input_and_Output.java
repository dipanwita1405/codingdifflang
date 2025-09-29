package Input_and_Output_coding;
import java.util.Scanner;
public class Input_and_Output {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt(); // Reads an integer
        String s = sc.nextLine(); // Reads a line
      
        // System.out.println("Number: " + n);
        System.out.println("Text: " + s);
        System.out.println(s.getClass().getName()); 
System.out.println(s.getClass().getSimpleName()); 


    }
}


