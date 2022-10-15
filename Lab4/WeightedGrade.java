package Lab4;

public class WeightedGrade {
    private double[] total_points;
    private double[] points_earned;
    private double[] weight;
    private int n;

    // Set int attributes
    public void setTotalAssignment(int num){
        this.n = num;
    }
    // Functions to transform string inputs to array of doubles
    public void setTotalPoints(String str){
        this.total_points = Tool.string2array(str, ",", n);
    }

    public void setPointsEarned(String str){
        this.points_earned = Tool.string2array(str, ",", n);
    }

    public void setWeight(String str){
        this.weight = Tool.string2array(str, ",", n);
    }

    // Function that calculate total grade
    public double calculateTotalGrade(double[] total, double[] earned, double[] weight, int num){
        double total_grade = 0;
        for(int i=0; i<n; i++){
            if (earned[i] == 0){
                continue;
            }
            total_grade += (earned[i] / total[i]) * weight[i];
        }
        return total_grade;
    }

    // Function that calculate total weights
    public boolean correctTotalWeight(){
        double totalWeight = 0;
        for(int i=0; i<this.n; i++){
            totalWeight += this.weight[i];
        }
        if (totalWeight != 100){
            return false;
        }
        else{
            return true;
        }
    }

    // Function for final grade
    public String calculateFinalGrade(){
        double grade = calculateTotalGrade(this.total_points, this.points_earned, this.weight, this.n);
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
