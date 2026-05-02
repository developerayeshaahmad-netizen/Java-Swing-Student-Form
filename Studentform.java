import javax.swing.*;




import java.awt.*;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

public class Studentform implements ActionListener {

  JButton b;

  JTextField t2;
  JTextField t3;
  JTextField t4;
  JTextField t5;

  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == b) {

    String name = t2.getText();
    String roll = t3.getText();
    String clas = t4.getText();
    String email = t5.getText();

    if (!name.matches("[A-Z].*")) {
        JOptionPane.showMessageDialog(null,"Name must start with a capital letter" , "message",JOptionPane.ERROR_MESSAGE);
    }
    else if (!roll.matches("[0-9]+")) {
        JOptionPane.showMessageDialog(null, "Roll No must contain only numbers","message",JOptionPane.ERROR_MESSAGE);
    }
    else if (!clas.matches("[A-Z]+")) {
        JOptionPane.showMessageDialog(null, "Class must be in capital letters only","message",JOptionPane.ERROR_MESSAGE);
    }
    else if (!email.contains("@") || !email.contains(".")) {
        JOptionPane.showMessageDialog(null, "Invalid Email","message",JOptionPane.ERROR_MESSAGE);
    }
    else {
      JOptionPane.showMessageDialog(null, "Form Submitted Successfully!");
     System.out.println(t2.getText());
     System.out.println(t3.getText());
      System.out.println(t4.getText());
       System.out.println(t5.getText());
    
    }
  }



}


 

  Studentform() {

    JFrame frame = new JFrame();
    ImageIcon image = new ImageIcon("image1.jpg");
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    t2 = new JTextField();
    JLabel label3 = new JLabel();
    t3 = new JTextField();
    JLabel label4 = new JLabel();
    t4 = new JTextField();
    JLabel label5 = new JLabel();
    t5 = new JTextField();

    b = new JButton();
    JButton b1 = new JButton();

    Container C1 = frame.getContentPane();

    frame.setTitle("This is a student form");
    frame.setResizable(false);
    frame.setSize(700, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setIconImage(image.getImage());
    


    frame.setBackground(new Color(250, 245, 246));
    label1.setText("Student registration form");
    label1.setFont(new Font("Times new romen", Font.BOLD, 25));
    label1.setHorizontalAlignment(JLabel.CENTER);
    label1.setVerticalAlignment(JLabel.TOP);
    label1.setBounds(100, 20, 400, 40);

    label2.setText("Name");
    label2.setBackground(new Color(115, 116, 116));
    label2.setFont(new Font("Times New Romen", Font.BOLD, 20));
    label2.setBounds(50, 100, 100, 30);
    t2.setBounds(200, 100, 300, 30);
    t2.setBackground(new Color(211, 211, 211));
    t2.setFont(new Font("Open Sans", Font.PLAIN, 15));
    t2.setCaretColor(new Color(37, 37, 37));
    t2.setBorder(BorderFactory.createLineBorder(Color.black, 2));

    label3.setText("Roll no");
    label3.setBackground(new Color(115, 116, 116));
    label3.setFont(new Font("Times New Romen", Font.BOLD, 20));
    label3.setBounds(50, 150, 100, 30);
    t3.setBounds(200, 150, 300, 30);
    t3.setBackground(new Color(211, 211, 211));
    t3.setFont(new Font("Open Sans", Font.PLAIN, 15));
    t3.setCaretColor(new Color(37, 37, 37));
    t3.setBorder(BorderFactory.createLineBorder(Color.black, 2));

    label4.setText("Class");
    label4.setBackground(new Color(115, 116, 116));
    label4.setFont(new Font("Times New Romen", Font.BOLD, 20));
    label4.setBounds(50, 200, 100, 30);
    t4.setBounds(200, 200, 300, 30);
    t4.setBackground(new Color(211, 211, 211));
    t4.setFont(new Font("Open Sans", Font.PLAIN, 15));
    t4.setCaretColor(new Color(37, 37, 37));
    t4.setBorder(BorderFactory.createLineBorder(Color.black, 2));

    label5.setText("Email");
    label5.setBackground(new Color(115, 116, 116));
    label5.setFont(new Font("Times New Romen", Font.BOLD, 20));
    label5.setBounds(50, 250, 100, 30);
    t5.setBounds(200, 250, 300, 30);
    t5.setBackground(new Color(211, 211, 211));
    t5.setFont(new Font("Open Sans", Font.PLAIN, 15));
    t5.setCaretColor(new Color(37, 37, 37));
    t5.setBorder(BorderFactory.createLineBorder(Color.black, 2));

    b.setText("Submit");
    b.setBackground(new Color(209, 211, 213));
    b.setBounds(270, 430, 100, 30);
    b.setFocusable(false);
  b.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    
    b.addActionListener(this);

    b1.setText("Reset");
    b1.setBackground(new Color(209, 211, 213));
    b1.setBounds(380, 430, 100, 30);
    b1.setFocusable(false);
    b1.addActionListener(e ->{
  
  
  t2.setText("");
     t3.setText("");
      t4.setText("");
       t5.setText("");
       System.out.println("Reset info");
    }
  
  );

    b1.setBorder(BorderFactory.createLineBorder(Color.black, 2));

    C1.add(label1);
    C1.add(label2);
    C1.add(t2);
    C1.add(label3);
    C1.add(t3);
    C1.add(label4);
    C1.add(t4);
    C1.add(label5);
    C1.add(t5);
    C1.setLayout(null);
    C1.add(b);
    C1.add(b1);
  
    frame.setVisible(true);

  }

  public static void main(String[] args) {
    Studentform s1 = new Studentform();

  }
}