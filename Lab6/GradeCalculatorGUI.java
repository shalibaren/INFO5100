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
        frame = new JFrame("Lab6 Assignment");

        // create a label to display text
        totalAssignmentPoints_label = new JLabel("Total Assignment Points");
        earnedPoints_label = new JLabel("Earned Points");
        percentageOfClass_label = new JLabel("Percentage of class");
        weightedScore_label = new JLabel("Weighted Score");

        // create a object of JTextField with 16 columns and a given initial text
        totalAssignmentPoints_textField = new JTextField("Enter Total Assignment Points", 16);
        earnedPoints_textField = new JTextField("Enter Earned Points", 16);
        percentageOfClass_textField = new JTextField("Enter Percentage Of class", 16);

        // create a new button
        button = new JButton("Click to calculate Score");

        // create a object of the text class
        GradeCalculatorGUI gradeCal = new GradeCalculatorGUI();

        // addActionListener to button
        button.addActionListener(gradeCal);

        // create a panel to add buttons and textfield
        JPanel p = new JPanel();

        // add buttons and textfield to panel
        p.add(totalAssignmentPoints_label);
        p.add(totalAssignmentPoints_textField);
        p.add(earnedPoints_label);
        p.add(earnedPoints_textField);
        p.add(percentageOfClass_label);
        p.add(percentageOfClass_textField);
        p.add(button);
        p.add(weightedScore_label);

        // add panel to frame
        frame.add(p);

        // set the size of frame
        frame.setSize(400, 400);

        frame.setVisible(true);
    }

        // if the button is pressed
        public void actionPerformed(ActionEvent e)
        {
            String s = e.getActionCommand();
            if (s.equals("Click to calculate Score")) {
                // set the text of the label to the text of the field
                double pointTotal = Double.parseDouble(totalAssignmentPoints_textField.getText());
                double earnPoints = Double.parseDouble(earnedPoints_textField.getText());
                double percentage = Double.parseDouble(percentageOfClass_textField.getText());
    
                // create weightedGrade object
                WeightedGrade wg = new WeightedGrade();
                wg.setPointTotal(pointTotal);
                wg.setEarnedPoints(earnPoints);
                wg.setAssignmentPercentage(percentage);
    
                // set the text of field to blank
                weightedScore_label.setText(String.format("%.1f", wg.TotalWeightedGrade()));
            }
        }
}
