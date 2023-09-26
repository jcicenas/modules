/**
 * module1
 */
import java.util.*;
public class module1 {
    public static void main(String[] args) {
        String name;
        int age = 0;
        double gpa = 0.0;
        Scanner newscan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = newscan.nextLine();
        for (int i = 0; -1 < i; i++) {
            System.out.println("Enter your age: ");
           if(newscan.hasNextInt()){
                age = newscan.nextInt();
                i = -2;
            }
            else{
                System.out.println("Re-enter your age");
            }
        }

        for (int i = 0; -1 < i; i++) {
            System.out.println("Enter your GPA: ");
            if(newscan.hasNextDouble()){
                gpa = newscan.nextDouble();
                i = -2;
            }else{
                System.out.println("Enter a new GPA:");
            }
        }
        System.out.println("Your name is " + name + " and your age is " + age + " and your Gpa is " + gpa);
        newscan.close();
    }
    
}