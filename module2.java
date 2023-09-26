import java.util.*;
public class module2 {
    public static void main(String[] args) {
       Scanner newscan = new Scanner(System.in);
       int roll;
        int side = 0;
        boolean valid = false;
       while (valid = false) {

            System.out.println("Please enter the number of sides: ");

            if(newscan.hasNextInt()){
                    side = newscan.nextInt();
                    valid = true;
            }else{
                System.out.println("You have entered an invalid nubmer of sides.");
            }

        }
        roll = (int)Math.random() * side + 1;
        System.out.println(roll);
        newscan.close();
    }
}
