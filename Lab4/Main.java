package Lab4;

import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        // Define variable
        int totalAssignment;
        String totalPoints;
        String pointsEarned;
        String weight;

        // Input data
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Total Assignments: ");
        totalAssignment = scan.nextInt();
        System.out.print("Enter Total Point: ");
        totalPoints = input.nextLine();
        System.out.print("Enter Points Earned: ");
        pointsEarned = input.nextLine();
        System.out.print("Enter Percentage: ");
        weight = input.nextLine();
        input.close();
        scan.close();

        // Process input data through WeightedGrade object
        WeightedGrade wg = new WeightedGrade();
        wg.setTotalAssignment(totalAssignment);
        wg.setTotalPoints(totalPoints);
        wg.setPointsEarned(pointsEarned);
        wg.setWeight(weight);

        // Check if the weights add up to 100, if yes, print the final grade, else print error message.
        if (!(wg.correctTotalWeight())){
            System.out.print("The total weight is not correct!");
        }
        else{
            System.out.print(wg.calculateFinalGrade());
        }
        
    } 
}