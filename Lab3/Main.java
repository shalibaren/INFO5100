package Lab3;

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        // Define variable
        String total_points;
        String points_earned;
        String weight;

        // Input data
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Total Point: ");
        total_points = input.nextLine();
        System.out.print("Enter Points Earned: ");
        points_earned = input.nextLine();
        System.out.print("Enter Percentage: ");
        weight = input.nextLine();
        input.close();

        // Process input data through WeightedGrade object
        WeightedGrade wg = new WeightedGrade();
        wg.setTotalPoints(total_points);
        wg.setPointsEarned(points_earned);
        wg.setWeight(weight);

        // Print Final Letter Grade
        System.out.print(wg.calculateFinalGrade());
    } 
}