package bank.management.system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener  {
    JRadioButton r1,r2,m1,m2,m3;

    JButton Nextpage;

    JTextField textName,textFname, dateChooser, Email, Add, pincode, City, state;


    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("Application Form No:" +first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details:");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Ralway",Font.BOLD,20));
        labelName.setBounds(100,190,100,30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFN = new JLabel("Father's Name :");
        labelFN.setFont(new Font("Ralway",Font.BOLD,20));
        labelFN.setBounds(100,240,200,30);
        add(labelFN);

        textFname = new JTextField();
        textFname.setFont(new Font("Ralway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Ralway",Font.BOLD,20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser = new JTextField();
        dateChooser.setFont(new Font("Ralway",Font.BOLD,14));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,340,200,30);
        add(labelG);



        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,340,90,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,340,90,30);
        add(r2);

        ButtonGroup button = new ButtonGroup();
        button.add(r1);
        button.add(r2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setFont(new Font("Ralway",Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        Email = new JTextField();
        Email.setFont(new Font("Ralway",Font.BOLD,14));
        Email.setBounds(300,390,400,30);
        add(Email);

        JLabel labelMS = new JLabel("Marital Status :");
        labelMS.setFont(new Font("Ralway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Ralway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,90,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Ralway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,100,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Ralway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(600,440,100,30);
        add(m3);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(m1);
        buttonGroup.add(m2);
        buttonGroup.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Ralway",Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        Add = new JTextField();
        Add.setFont(new Font("Ralway",Font.BOLD,14));
        Add.setBounds(300,490,400,30);
        add(Add);

        JLabel labelPin = new JLabel("City :");
        labelPin.setFont(new Font("Ralway",Font.BOLD,20));
        labelPin.setBounds(100,540,200,30);
        add(labelPin);

        City = new JTextField();
        City.setFont(new Font("Ralway",Font.BOLD,14));
        City.setBounds(300,540,400,30);
        add(City);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Ralway",Font.BOLD,20));
        labelstate.setBounds(100,590,200,30);
        add(labelstate);

        state = new JTextField();
        state.setFont(new Font("Ralway",Font.BOLD,14));
        state.setBounds(300,590,400,30);
        add(state);

        JLabel labelpincode = new JLabel("Pin Code :");
        labelpincode.setFont(new Font("Ralway",Font.BOLD,20));
        labelpincode.setBounds(100,640,200,30);
        add(labelpincode);

        pincode = new JTextField();
        pincode.setFont(new Font("Ralway",Font.BOLD,14));
        pincode.setBounds(300,640,400,30);
        add(pincode);

        Nextpage = new JButton("Next");
        Nextpage.setFont(new Font("Raleway",Font.BOLD,14));
        Nextpage.setBackground(Color.BLACK);
        Nextpage.setForeground(Color.WHITE);
        Nextpage.setBounds(620,710,80,30);
        Nextpage.addActionListener(this);
        add(Nextpage);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           String formno = first;
           String name = textName.getText();
           String fname = textFname.getText();
           String dob = dateChooser.getText();
           String gender = null;
           if(r1.isSelected()){
               gender = "Male";
           }else if (r2.isSelected()){
               gender ="Female";
           }
           String email = Email.getText();
           String marital = null;
           if(m1.isSelected()){
               marital ="married";
           }else if(m2.isSelected()){
               marital ="unmarried";

           } else if (m3.isSelected()) {
               marital = "Other";
           }
           String address = Add.getText();
           String city = City.getText();
           String State = state.getText();
           String Pincode = pincode.getText();

           try{
               if(textName.getText().equals("")){
                   JOptionPane.showConfirmDialog(null, "Fill all the fields");
               }else {
                   Con con1 = new Con();
                   String q = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+State+"','"+Pincode+"')";
                   con1.statement.executeUpdate(q);
                   new Signup2();
                   setVisible(false);
               }
           }catch(Exception E){
               E.printStackTrace();
           }

    }

    public static void main(String[] args) {
        new Signup();
    }
}


