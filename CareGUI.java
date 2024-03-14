package guis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class CareGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CareGUI extends JFrame
{
    // instance variables - replace the example below with your own
    private JFrame myFrame = new JFrame("Vizier controls");
    
    private JLabel title = new JLabel ("What would you like to do?");
    
    private JButton payFee = new JButton("Pay team entry fee");
    private JButton payReward = new JButton("Pay the enemy team");
    private JButton retireChamp = new JButton("Retire a champion");
    private JButton checkTreasury = new JButton("Check treasury amount");
    
    public CareGUI(String comment)
    {
        super (comment);
        
        setLayout(new BorderLayout());
        add(title, BorderLayout.NORTH);
        
        JPanel allPanel = new JPanel();
        allPanel.setLayout(new GridLayout(4,1));
        //myFrame.add(title);
        add(allPanel, BorderLayout.CENTER);
        allPanel.add(payFee);
        payFee.setPreferredSize(new Dimension(200, 30));
        allPanel.add(payReward);
        payReward.setPreferredSize(new Dimension(200, 30));
        allPanel.add(retireChamp);
        retireChamp.setPreferredSize(new Dimension(200, 30));
        allPanel.add(checkTreasury);
        checkTreasury.setPreferredSize(new Dimension(200, 30));
        
        this.pack();
        //myFrame.setVisible(true);
        setVisible(true);
    }
}
