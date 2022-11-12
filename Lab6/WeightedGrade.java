package Lab6;

public class WeightedGrade {
    private double pointTotal;
    private double earnedPoints;
    private double weight;

    public double getPointTotal() {
        return pointTotal;
    }

    public double getEarnedPoints() {
        return earnedPoints;
    }

    public double getAssignmentWeight() {
        return weight;
    }

    public void setPointTotal(double pointTotal) {
        this.pointTotal = pointTotal;
    }

    public void setEarnedPoints(double earnedPoints) {
        this.earnedPoints = earnedPoints;
    }

    public void setAssignmentWeight(double weight) {
        this.weight = weight;
    }

    /// Calculate Total Weighted Grade
    public double TotalWeightedGrade() {
        return (earnedPoints / pointTotal) * weight;
    }

}
