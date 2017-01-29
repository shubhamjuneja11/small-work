import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Helper extends JFrame{
private JFrame frame;
private JPanel cotrolPanel;
private JLabel label;
private JTextField field;
public static void main(String s[]){
  new Helper().preparegui();
}
private void preparegui(){

  setLayout(new FlowLayout());
  setSize(500,500);
  addWindowListener(new WindowAdapter(){
    public void windowClosing(WindowEvent windowevent){
      System.exit(0);
    }
  });
label=new JLabel("Enter class name");
field=new JTextField();
add(label);
add(field);



  setVisible(true);
}
}
