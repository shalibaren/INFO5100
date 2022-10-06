package Lab3;

public class WeightedGrade {
    private double[] total_points;
    private double[] points_earned;
    private double[] weight;

    // Functions to transform string inputs to array of doubles
    public void setTotalPoints(String str){
        this.total_points = tool.string2array(str, ",");
    }

    public void setPointsEarned(String str){
        this.points_earned = tool.string2array(str, ",");
    }

    public void setWeight(String str){
        this.weight = tool.string2array(str, ",");
    }

    // Function that calculate total grade
    public double calculateTotalGrade(double[] total, double[] earned, double[] weight){
        double total_grade = 0;
        int n = total.length;
        for(int i=0; i<n; i++){
            if (earned[i] == 0){
                continue;
            }
            total_grade += (earned[i] / total[i]) * weight[i];
        }
        return total_grade;
    }

    // Function for final grade
    public String calculateFinalGrade(){
        double grade = calculateTotalGrade(this.total_points, this.points_earned, this.weight);
        System.out.println("Final Grade: " + grade);
        if (grade >= 90){
            return "A";
        } else if (grade >= 80){
            return "B";
        } else if (grade >= 70){
            return "C";
        } else if (grade >= 60){
            return "D";
        } else {
            return "F";
        }
    }
}
