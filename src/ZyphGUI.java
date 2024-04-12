/* ###################################
Title: ZyphGUI class
Author: Draedn Groves
Date: April.10th/2024
Purpose: The file for running the SWING.
################################### */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Zyphs form class
 */
public class ZyphGUI {

    private JPanel panelMain;
    private JLabel lblZyphs;
    private JComboBox cbZyphs;
    private JLabel lblSize;
    private JLabel lblWeight;
    private JLabel lblType;
    private JLabel lblName;
    private JLabel lblHabitat;
    private JLabel lblSizeOutput;
    private JLabel lblWeightOutput;
    private JLabel lblTypeOutput;
    private JLabel lblNameOutput;
    private JLabel lblHabitatOutput;

    /**
     * Creates Zyphs and adds listeners
     */
    public ZyphGUI() {
        Driver.makeZyphs();
        cbZyphs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(cbZyphs, "This Zyph is now yours! : " + cbZyphs.getSelectedItem());
                Zyph zyph = Zyph.getZyph(cbZyphs.getSelectedItem().toString());
                System.out.println(zyph.getDetails());

                lblNameOutput.setText(zyph.getName());
                lblTypeOutput.setText(zyph.getType());
                lblSizeOutput.setText(zyph.getSize());
                lblWeightOutput.setText(String.valueOf(zyph.getWeight()));
                lblHabitatOutput.setText(zyph.getHabitat());
            }
        });
    }
    /**
     * Main method to run.
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("frmDemo3");
        frame.setContentPane(new ZyphGUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

