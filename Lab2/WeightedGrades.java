package Lab2;

public class WeightedGrades{
    
private double point_total, earned_point, percentage, weighted_grade;

// Set the variable from input value
public void setvariable(double point_total, double earned_point, double percentage){
    this.point_total = point_total;
    this.earned_point = earned_point;
    this.percentage = percentage;
}

// Calculate the weighted grade
public double calculate_weighted_grade(){
    weighted_grade = earned_point / point_total * percentage * 100;
    return weighted_grade;
}

// print the final result
public void print_result(){
    System.out.printf("Total Weighted grade is: " + String.format("%.3f", calculate_weighted_grade()));
}
}