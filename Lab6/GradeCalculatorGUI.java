package Lab6;
import java.awt.event.*;
import javax.swing.*;
class GradeCalculatorGUI extends JFrame implements ActionListener {
    // JFrame
    static JFrame frame;

    // JLabel
    static JLabel totalAssignmentPoints_label;
    static JLabel earnedPoints_label;
    static JLabel percentageOfClass_label;
    static JLabel weightedScore_label;
    static JLabel showScore_label;

    // JTextField
    static JTextField totalAssignmentPoints_textField;
    static JTextField earnedPoints_textField;
    static JTextField percentageOfClass_textField;

    // JButton
    static JButton button;
    
    // default constructor
    GradeCalculatorGUI()
    {
    }

    // UI Configuration
    public void calculator()
    {
        // create a new frame to store text field and button
        frame = new JFrame("Lab6 Assignment - Grade Calculator with GUI");

        // create a label to display text
        totalAssignmentPoints_label = new JLabel("Total Assignment Points");
        earnedPoints_label = new JLabel("Earned Points");
        percentageOfClass_label = new JLabel("Percentage of class");
        weightedScore_label = new JLabel("Weighted Score:");
        showScore_label = new JLabel("       ");

        // create a object of JTextField with 16 columns and a given initial text
        totalAssignmentPoints_textField = new JTextField("Enter Points", 16);
        earnedPoints_textField = new JTextField("Enter Points", 16);
        percentageOfClass_textField = new JTextField("Enter Percentage", 16);


        // create a new button
        button = new JButton("Click to Calculate");

        // create a object of the text class
        GradeCalculatorGUI gradeCalculate = new GradeCalculatorGUI();

        // addActionListener to button
        button.addActionListener(gradeCalculate);

        // create a panel to add buttons and textfield
        JPanel jp = new JPanel();

        // add buttons and textfield
        jp.add(totalAssignmentPoints_label);
        jp.add(totalAssignmentPoints_textField);
        jp.add(earnedPoints_label);
        jp.add(earnedPoints_textField);
        jp.add(percentageOfClass_label);
        jp.add(percentageOfClass_textField);
        jp.add(button);
        jp.add(weightedScore_label);
        jp.add(showScore_label);

        // add panel
        frame.add(jp);

        // set the size
        frame.setSize(400, 600);

        frame.setVisible(true);
    }

        // if the button is pressed
        public void actionPerformed(ActionEvent e)
        {
            String s = e.getActionCommand();
            if (s.equals("Click to Calculate")) {
                // set the text of the label to the text of the field
                double pointTotal = Double.parseDouble(totalAssignmentPoints_textField.getText());
                double earnPoints = Double.parseDouble(earnedPoints_textField.getText());
                double weight = Double.parseDouble(percentageOfClass_textField.getText());
    
                // create weightedGrade object
                WeightedGrade wg = new WeightedGrade();
                wg.setPointTotal(pointTotal);
                wg.setEarnedPoints(earnPoints);
                wg.setAssignmentWeight(weight);
    
                // set the text of field to blank
                showScore_label.setText(String.format("%.1f", wg.TotalWeightedGrade()));
            }
        }
}
