package gittodo;
import java.util.*;

/**
 *
 * @author Gail
 */

public class GitTodo {
      
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter name: ");
        String name = input.nextLine();
        System.out.println("Welcome "+name+"\nPlease enter your task for today");
        String task = input.nextLine();

        System.out.println("Hello world!"); // this is my comment
        
    }
    
}
