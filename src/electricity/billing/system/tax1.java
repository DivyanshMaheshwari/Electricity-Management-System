package electricity.billing.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class tax1 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JButton b1, b2;

    tax1() {
        super("Tax details");
        setSize(1000, 1000);

        JPanel p = new JPanel();
        p.setLayout(new GridLayout(12, 1, 12, 10));

        p.setBackground(Color.WHITE);

        l1 = new JLabel("Meter Location");
        t1 = new JTextField();
        p.add(l1);
        p.add(t1);
        l2 = new JLabel("Meter Type");
        t2 = new JTextField();
        p.add(l2);
        p.add(t2);

        l3 = new JLabel("Phase Code");
        t3 = new JTextField();
        p.add(l3);
        p.add(t3);

        l4 = new JLabel("Bill Type");
        t4 = new JTextField();
        p.add(l4);
        p.add(t4);

        l5 = new JLabel("Days");
        t5 = new JTextField();
        p.add(l5);
        p.add(t5);

        l6 = new JLabel("Meter Rent");
        t6 = new JTextField();
        p.add(l6);
        p.add(t6);

        l7 = new JLabel("MCB Rent");
        t7 = new JTextField();
        p.add(l7);
        p.add(t7);

        l8 = new JLabel("Service Rent");
        t8 = new JTextField();
        p.add(l8);
        p.add(t8);

        l9 = new JLabel("GST");
        t9 = new JTextField();
        p.add(l9);
        p.add(t9);

        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        p.add(b1);
        p.add(b2);
        setLayout(new BorderLayout());

        add(p, "Center");

        //for changing the color of the whole 
        getContentPane().setBackground(Color.WHITE);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {

        String a = t1.getText();
        String b = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String f = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        
        String q1 = "insert into tax values('" + a + "','" + b + "','" + c + "','" + d + "','" + e + "','" + f + "','" + g + "','" + h + "','" + i + "')";
        
        try {
            conn c1 = new conn();
            c1.s.executeUpdate(q1);
            JOptionPane.showMessageDialog(null, "Tax Updated");
            this.setVisible(false);
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new tax1().setVisible(true);
    }
}
