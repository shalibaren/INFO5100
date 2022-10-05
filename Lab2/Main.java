package Lab2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        WeightedGrades calculate = new WeightedGrades();
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter Point Total: ");
        double point_total = input.nextDouble();
        System.out.print("Please enter Earned Point: ");
        double earned_point = input.nextDouble();
        System.out.print("Please enter Assignment %: ");
        double percentage = input.nextDouble();
        input.close();
        
        calculate.setvariable(point_total, earned_point, percentage);
        calculate.print_result();


    }
}
