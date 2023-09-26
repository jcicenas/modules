import java.util.*;
public class pt1{
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;

        System.out.println("Enter a value for 'A' in the standard quadratic form.");
        if(newscan.hasNextDouble()){
            a = newscan.nextDouble();
        }else{
            System.exit(0);
        }
        System.out.println("Enter a value for 'B' in the standard quadratic form.");
        if(newscan.hasNextDouble()){
           b = newscan.nextDouble();
        }else{
            System.exit(0);
        }
        System.out.println("Enter a value for 'C' in the standard quadratic form.");
        if(newscan.hasNextDouble()){
           c = newscan.nextDouble();
        }else{
            System.exit(0);
        }
        System.out.println(a + b + c);
        if(Math.pow(b, 2) - (4 * a * c)  < 0 ){
            System.out.println("There may be imaginary solutions - answer cannot be found");
        } else{
            System.out.println("Answer 1 is: " + ( ( -b + ( Math.sqrt( Math.pow(b, 2) - (4 * a * c) ) ) ) / (2 * a) ) );
            System.out.println("Answer 2 is: " + ( ( -b + ( Math.sqrt( Math.pow(b, 2) - (4 * a * c) ) ) ) / (2 * a) ) );
        }
        newscan.close();
    }
}