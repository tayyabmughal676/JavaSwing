import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App implements ActionListener {

    JTextField tf1,tf2,tf3;
    JButton b1,b2;
    public   void TextFieldExample(){
        JFrame f= new JFrame();

        tf1=new JTextField();
        tf1.setBounds(100,50,150,20);
        tf2=new JTextField();
        tf2.setBounds(100,100,150,20);
        tf3=new JTextField();
        tf3.setBounds(100,150,150,20);
        tf3.setEditable(false);
        b1=new JButton("+");
        b1.setBounds(100,200,50,50);
        b2=new JButton("-");
        b2.setBounds(200,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(b1);
        f.add(b2);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();

        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }else if(e.getSource()==b2){
            c=a-b;
        }
        String result=String.valueOf(c);
        tf3.setText(result);
    }

    public static void main(String[] args) {

        App m = new App();
        m.TextFieldExample();

    }
}
