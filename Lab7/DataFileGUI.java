package Lab7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DataFileGUI extends JFrame implements ActionListener {

    // JPanel
    JPanel panel;
    // JTextField
    static JTextField newFileNameTF;
    // label to display text
    static JLabel readFileNameLabel;
    static JLabel filePathLabel;
    static JLabel firstFiveLinesOfFileLabel;
    static JLabel firstFiveLinesOfFileContentLabel;
    static JLabel fileNameToWrite;
    static JLabel firstFiveLinesOfNewFileLabel;
    static JLabel firstFiveLinesOfNewFileContentLabel;
    // JButton
    static JButton readFileBtn;
    static JButton writeFileBtn;

    /** Initiator **/
    DataFileGUI() {
        this.setTitle("Data Files GUI");
        this.setJPanel();
        this.getContentPane();
        this.add(panel);
        this.setSize(2000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    /** Panel Setup **/
    private void setJPanel() {
        panel = new JPanel();

        readFileNameLabel = new JLabel("File Name");
        Dimension readFileNameLabelSize = readFileNameLabel.getPreferredSize();
        readFileNameLabel.setBounds(10,10, readFileNameLabelSize.width, readFileNameLabelSize.height);
        panel.add(readFileNameLabel);

        filePathLabel = new JLabel("Annual.csv");
        Dimension filePathLabelSize = filePathLabel.getPreferredSize();
        filePathLabel.setBounds(10,readFileNameLabel.getY() + 20,filePathLabelSize.width,filePathLabelSize.height);
        panel.add(filePathLabel);

        readFileBtn = new JButton("Click to read from file");
        Dimension readFileBtnSize = readFileBtn.getPreferredSize();
        readFileBtn.setBounds(10, filePathLabel.getY() + 20, readFileBtnSize.width, readFileBtnSize.height);
        readFileBtn.addActionListener(this);
        panel.add(readFileBtn);

        firstFiveLinesOfFileLabel = new JLabel("First five lines of file");
        Dimension firstFiveLinesOfFileLabelSize = firstFiveLinesOfFileLabel.getPreferredSize();
        firstFiveLinesOfFileLabel.setBounds(10, readFileBtn.getY() + 30, firstFiveLinesOfFileLabelSize.width, firstFiveLinesOfFileLabelSize.height);
        panel.add(firstFiveLinesOfFileLabel);

        firstFiveLinesOfFileContentLabel = new JLabel("");
        firstFiveLinesOfFileContentLabel.setBounds(10, firstFiveLinesOfFileLabel.getY() + 40, 100, 20);
        panel.add(firstFiveLinesOfFileContentLabel);

        fileNameToWrite = new JLabel("File name to write");
        Dimension fileNameToWriteSize = fileNameToWrite.getPreferredSize();
        fileNameToWrite.setBounds(200,10, fileNameToWriteSize.width, fileNameToWriteSize.height);
        panel.add(fileNameToWrite);

        newFileNameTF = new JTextField();
        newFileNameTF.setBounds(200,fileNameToWrite.getY() + 20, 100, 20);
        panel.add(newFileNameTF);

        writeFileBtn = new JButton("Click to write to file");
        Dimension writeFileBtnSize = writeFileBtn.getPreferredSize();
        writeFileBtn.setBounds(200, newFileNameTF.getY() + 20, writeFileBtnSize.width, writeFileBtnSize.height);
        writeFileBtn.addActionListener(this);
        panel.add(writeFileBtn);

        firstFiveLinesOfNewFileLabel = new JLabel("Five lines of new file");
        Dimension firstFiveLinesOfNewFileLabelSize = firstFiveLinesOfNewFileLabel.getPreferredSize();
        firstFiveLinesOfNewFileLabel.setBounds(200, firstFiveLinesOfFileLabel.getY(), firstFiveLinesOfNewFileLabelSize.width, firstFiveLinesOfNewFileLabelSize.height);
        panel.add(firstFiveLinesOfNewFileLabel);

        firstFiveLinesOfNewFileContentLabel = new JLabel("");
        firstFiveLinesOfNewFileContentLabel.setBounds(200, firstFiveLinesOfNewFileLabel.getY() + 20, 100, 100);
        panel.add(firstFiveLinesOfNewFileContentLabel);

        panel.setLayout(null);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    }

    /** Button press action **/
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("Click to read from file")) {
            // set the text of the label to the text of the field
            System.out.println("Click read Btn");
            String filepath = "../INFO5100/Lab7/Annual.csv";
            firstFiveLinesOfFileContentLabel.setText(ReadFile.readToShow(filepath, 5, false));
            firstFiveLinesOfFileContentLabel.setSize(1700, 100);
        }
        if (s.equals("Click to write to file")) {
            // set the text of the label to the text of the field
            System.out.println("Click write Btn");
            String newFilename = newFileNameTF.getText();
            String path = "../INFO5100/Lab7/" + newFilename;
            FileOutput.createFile(newFilename);
            WriteFile.writeFile(newFilename, ReadFile.readToWrite());
            firstFiveLinesOfNewFileContentLabel.setText(ReadFile.readToShow(path, 5, true));
            firstFiveLinesOfNewFileContentLabel.setBounds(200, firstFiveLinesOfNewFileContentLabel.getY() + 20, 1700, 100);
        }
    }
}
