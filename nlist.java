import java.awt.*;
import java.awt.event.*;
class nlist extends Frame implements ActionListener,ItemListener
{
TextField t1;
Button b1,b2,b3,b4,b5;
List ls1,ls2;
Label l1,l2,l3;

public nlist()
{
setTitle("name list of students");
setLayout(null);
setBackground(Color.green);
resize(800,800);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent w)
{
System.exit(0);
}
});
l1=new Label("ENTER YOUR NAME");
l1.setBounds(150,50,150,20);
l1.setBackground(Color.green);
add(l1);

t1=new TextField();
t1.setBounds(300,50,100,20);
add(t1);

l2=new Label("SECTION 'A' STUDENTS ");
l2.setBounds(130,180,150,20);
l2.setBackground(Color.green);
add(l2);


ls1=new List();
ls1.setBounds(100,200,200,200);
add(ls1);
ls1.addItemListener(this);

l3=new Label("SECTION 'B' STUDENTS");
l3.setBounds(430,180,150,20);
l3.setBackground(Color.green);
add(l3);
ls2=new List();
ls2.setBounds(400,200,200,200);
add(ls2);
ls2.addItemListener(this);

b4=new Button("section A");
b4.setBounds(200,450,100,50);
add(b4);
b4.addActionListener(this);

b5=new Button("section B");
b5.setBounds(350,450,100,50);
add(b5);
b5.addActionListener(this);

b2=new Button("Clear all");
b2.setBounds(300,530,100,20);
b2.setBackground(Color.blue);
add(b2);
b2.addActionListener(this);
b3=new Button("exit");
b3.setBounds(300,560,100,20);
b3.setBackground(Color.red);
add(b3);
b3.addActionListener(this);




show();

}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b4)
{
ls1.add(t1.getText());
t1.setText("");
}

if(ae.getSource()==b5)
{
ls2.add(t1.getText());
t1.setText("");
}

if(ae.getSource()==b2)
{
t1.setText("");
ls1.clear();
ls2.clear();
}
if(ae.getSource()==b3)
{
System.exit(0);
}

}
public void itemStateChanged(ItemEvent ie)
{
if(ie.getSource()==ls1){
ls1.remove(ls1.getSelectedIndex());
}

if(ie.getSource()==ls2){
ls2.remove(ls2.getSelectedIndex());
}


}




public static void main(String arg[])
{
nlist nl=new nlist();
}
}