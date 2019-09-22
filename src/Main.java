import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {


        myFrame();
    }

    static void myFrame(){
        JFrame jFrame  = new JFrame("Swing..." );
        //Label First Name
        JLabel jLabelFirstName = new JLabel("First Name");
        jLabelFirstName.setBounds(40 , 30 , 300 , 30);

        // First name Edit Field
        final JTextField jTextFieldFirstName=new JTextField();
        jTextFieldFirstName.setBounds(40,60, 300,30);

        // Last Name  Label
        JLabel jLabelLastName = new JLabel("Last Name");
        jLabelLastName.setBounds(40 , 90 , 300 , 30);
        // LAst Name Edit Field
        final JTextField jTextFieldLastName=new JTextField();
        jTextFieldLastName.setBounds(40,120, 300,30);

        // Last Password  Label
        JLabel jLabelPasswordField = new JLabel("Password");
        jLabelPasswordField.setBounds(40 , 150 , 300 , 30);
        // LAst Password Edit Field
        final JTextField jTextFieldPassword=new JPasswordField();
        jTextFieldPassword.setBounds(40,180, 300,30);


//        JButton myBtn = new JButton(new ImageIcon("D:\\ChannelLogo.png"));
        JButton myBtn = new JButton("Submit");
        myBtn.setBounds(140,220,100,40);



        myBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String firstName = jTextFieldFirstName.getText();
                String lastName = jTextFieldLastName.getText();
                String password = jTextFieldPassword.getText();


//                if(firstName != null){
//                    JOptionPane.showMessageDialog(null , "Enter First Name");
//                }else if(lastName != null){
//                    JOptionPane.showMessageDialog(null , "Enter Last Name");
//                }else if(password != null){
//                    JOptionPane.showMessageDialog(null , "Enter Last Password");
//                }else{
////
//                }
                
                JOptionPane.showMessageDialog(null ,

                        "First => " + firstName +
                                "Last => " + lastName +
                                "Password => " + password
                );
            }
        });


        jFrame.add(jLabelFirstName);
        jFrame.add(jTextFieldFirstName);

        jFrame.add(jLabelLastName);
        jFrame.add(jTextFieldLastName);

        jFrame.add(jLabelPasswordField);
        jFrame.add(jTextFieldPassword);

        jFrame.add(myBtn);




        jFrame.setSize(400,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
