package Lab6;

public class WeightedGrade {
    private double pointTotal;
    private double earnedPoints;
    private double assignmentPercentage;

    public double getPointTotal() {
        return pointTotal;
    }

    public void setPointTotal(double pointTotal) {
        this.pointTotal = pointTotal;
    }

    public double getEarnedPoints() {
        return earnedPoints;
    }

    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public double getAssignmentPercentage() {
        return assignmentPercentage;
    }

    public void setAssignmentPercentage(double assignmentPercentage) {
        this.assignmentPercentage = assignmentPercentage;
    }

    /// Calculate Total Weighted Grade
    public double TotalWeightedGrade() {
        return (earnedPoints / pointTotal) * assignmentPercentage;
    }

}
