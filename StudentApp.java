
import javax.swing.*;
import java.awt.event.*;

class Student implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel lblId,lblName,lblCourse,lblTitle;
    JTextField tfId,tfName;
    JComboBox cboCourse;
    JButton btnAdd,btnCancel;
    public Student() {
      frame=new JFrame("student");
      panel=new JPanel();
      panel.setLayout(null);
      
      btnAdd=new JButton("Add");
      btnAdd.setBounds(100,300,100,30);
      btnAdd.addActionListener(this);
      
      btnCancel=new JButton("Cancel");
      btnCancel.setBounds(200,300,100,30);
      btnCancel.addActionListener(this);
      
      lblTitle=new JLabel("Student Management System");
      lblTitle.setBounds(100,20,300,30);
//      lblTitle.setFont(new Font("arial",2));
      lblId=new JLabel("Student Id");
      lblId.setBounds(100, 50, 100, 30);
      tfId=new JTextField(10);
      tfId.setBounds(250, 50, 100, 30);
      
      lblName=new JLabel("Student Name");
      lblName.setBounds(100, 120, 100, 30);
      tfName=new JTextField(20);
      tfName.setBounds(250, 120, 200, 30);
      
      lblCourse=new JLabel("Course");
      lblCourse.setBounds(100, 200, 100, 30);
      cboCourse=new JComboBox(new Object[]{"select course","Java","Python"});
      cboCourse.setBounds(250, 200, 130, 30);
      
      panel.add(lblTitle);
      panel.add(lblId);
      panel.add(lblName);
      panel.add(lblCourse);
      
      panel.add(tfId);
      panel.add(tfName);
      panel.add(cboCourse);
      
      panel.add(btnAdd);
      panel.add(btnCancel);
      
      frame.add(panel);
      
      frame.setSize(600,400);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
          if(e.getSource()==btnAdd)
          {
              int s1=Integer.parseInt(tfId.getText().trim());
              String s2=tfName.getText();
              String s3=(String)cboCourse.getSelectedItem();
              System.out.println("id is"+s1);
              System.out.println("course is"+s3);            
          }
          if(e.getSource()==btnCancel)
          {
              tfId.setText("");
              tfName.setText("");
          }
    }
}

public class StudentApp {

    public static void main(String[] args) {
         Student s=new Student();
    }

}
