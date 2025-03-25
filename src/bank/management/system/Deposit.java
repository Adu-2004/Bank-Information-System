package bank.management.system;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField t10;
    JButton b1,b2;

    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1 .setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        l3.add(label1);

        t10 = new TextField();
        t10.setBackground(new Color(65,125,128));
        t10.setForeground(Color.WHITE);
        t10.setBounds(460,210,320,25);
        t10.setFont(new Font("Releway",Font.BOLD,21));
        l3.add(t10);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,410,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);









        setLayout(null);
        setSize(1550,1000);
        setLocation(0,0);
        setVisible(true);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = t10.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if(t10.getText().equals("")){
                    JOptionPane.showConfirmDialog(null,"Please enter the Amount you want to Deposit");
                }else{
                    Con c =new Con();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showConfirmDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Main_(pin);
                }
            } else if (e.getSource()==b2) {
                setVisible(false);
                new Main_(pin);
            }

        } catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Deposit("");

    }
}
