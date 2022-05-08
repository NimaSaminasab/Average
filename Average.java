/*Calculates average of a series of digits until -1 is entered*/
import java.util.Scanner ;
public class Average {
    public static void main(String[] args) {
        double number = 0 ;
        double sum = 1 ;
        int count = -1 ;
        Scanner in = new Scanner(System.in) ;

        do{
            System.out.println("Enter a number, (enter -1 , to quit) ");
            number = in.nextDouble();
            sum = sum+number ;
            count++ ;

        }while(number!= -1);

        System.out.println("The average of the numbers are : " + sum/count);
    }
}
