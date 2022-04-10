import java.awt.*;
import java.awt.event.*;
class calculator extends Frame implements ActionListener
{
Label l1,l2,l3,l4;
Button b1,b2,b3,b4,b5,b6;
TextField t1,t2;
public calculator()
{
setTitle("calculator");
setLayout(null);
setBackground(Color.yellow);
resize(700,1000);
l1=new Label("Enter Number 1");
l1.setBounds(50,100,100,50);
l1.setBackground(Color.green);
add(l1);

t1=new TextField();
t1.setBounds(150,100,150,50);
add(t1);

l2=new Label("Enter Number 2");
l2.setBounds(50,200,100,50);
l2.setBackground(Color.green);
add(l2);

t2=new TextField();
t2.setBounds(150,200,150,50);
add(t2);

l3=new Label("Result");
l3.setBounds(50,300,100,50);
l3.setBackground(Color.green);
add(l3);

l4=new Label("");
l4.setBounds(150,300,100,50);
l4.setBackground(Color.green);
add(l4);

b1=new Button("add");
b1.setBounds(50,400,80,50);
add(b1);
b1.addActionListener(this);

b2=new Button("sub");
b2.setBounds(150,400,80,50);
add(b2);
b2.addActionListener(this);

b3=new Button("multi");
b3.setBounds(50,500,80,50);
add(b3);
b3.addActionListener(this);

b4=new Button("div");
b4.setBounds(150,500,80,50);
add(b4);
b4.addActionListener(this);

b5=new Button("clear");
b5.setBounds(50,600,80,50);
b5.setBackground(Color.blue);
add(b5);
b5.addActionListener(this);

b6=new Button("exit");
b6.setBounds(150,600,80,50);
b6.setBackground(Color.red);
add(b6);
b6.addActionListener(this);




addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent w)
{
System.exit(0);
}
});
show();

}
public void actionPerformed(ActionEvent ae)
{

if(ae.getSource()==b1)
{
l4.setText(String.valueOf(Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText())));

}

if(ae.getSource()==b2)
{
l4.setText(String.valueOf(Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText())));

}

if(ae.getSource()==b3)
{
l4.setText(String.valueOf(Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText())));

}

if(ae.getSource()==b4)
{
l4.setText(String.valueOf(Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText())));

}

if(ae.getSource()==b5)
{
t1.setText("");
t2.setText("");
l4.setText("");

}

if(ae.getSource()==b6)
{
System.exit(0);

}
}
public static void main(String arg[])
{
calculator ca=new calculator();
}

}