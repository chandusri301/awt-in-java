import java.awt.*;
import java.awt.event.*;
class colormixer extends Frame implements AdjustmentListener
{
	Scrollbar s1=new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,305);
	Scrollbar s2=new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,305);
	Scrollbar s3=new Scrollbar(Scrollbar.HORIZONTAL,0,50,0,305);
	Label s=new Label("");
	Label red,green,blue,redv,greenv,bluev,f,redv1,greenv1,bluev1;
	
	
	public colormixer()
	{
	setLayout(null);
	setTitle("color Mixer");
	resize(500,600);
	s.setBounds(50,50,300,200);
	s.setBackground(Color.RED);
	add(s);
    f=new Label("RGB-",Label.CENTER);
	f.setBounds(50,270,30,20);
	add(f);
	redv1=new Label("0",Label.CENTER);
	redv1.setBounds(80,270,20,20);
	add(redv1);
	greenv1=new Label("0",Label.CENTER);
	greenv1.setBounds(100,270,20,20);
	add(greenv1);
	bluev1=new Label("0",Label.CENTER);
	bluev1.setBounds(120,270,20,20);
	add(bluev1);
	
	red=new Label("RED",Label.CENTER);
	red.setBackground(Color.RED);
	red.setForeground(Color.WHITE);
	red.setBounds(50,300,50,20);
	add(red);
	s1.setBounds(100,300,200,20);
	add(s1);
	s1.addAdjustmentListener(this);
	redv=new Label("0",Label.CENTER);
	redv.setBackground(Color.RED);
	redv.setForeground(Color.WHITE);
	redv.setBounds(300,300,50,20);
	add(redv);
	//redv.addAdjustmentListener(this);
	green=new Label("GREEN",Label.CENTER);
	green.setBackground(Color.GREEN);
	green.setForeground(Color.BLACK);
	green.setBounds(50,350,50,20);
	add(green);
	s2.setBounds(100,350,200,20);
	add(s2);
	s2.addAdjustmentListener(this);
	greenv=new Label("0",Label.CENTER);
	greenv.setBackground(Color.GREEN);
	greenv.setForeground(Color.BLACK);
	greenv.setBounds(300,350,50,20);
	add(greenv);
	blue=new Label("BLUE",Label.CENTER);
	blue.setBackground(Color.BLUE);
	blue.setForeground(Color.WHITE);
	blue.setBounds(50,400,50,20);
	add(blue);
	s3.setBounds(100,400,200,20);
	add(s3);
	s3.addAdjustmentListener(this);
	bluev=new Label("0",Label.CENTER);
	bluev.setBackground(Color.BLUE);
	bluev.setForeground(Color.WHITE);
	bluev.setBounds(300,400,50,20);
	add(bluev);
	
	addWindowListener(new WindowAdapter()
	{
		public void windowClosing(WindowEvent  w)
		{
			System.exit(0);
		}
	});
	show();
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		if(ae.getSource()==s1)
		{
			s.setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
			redv.setText(String.valueOf(s1.getValue()));
			redv1.setText(String.valueOf(s1.getValue()));
		}
		if(ae.getSource()==s2)
		{
			s.setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
			greenv.setText(String.valueOf(s2.getValue()));
			greenv1.setText(String.valueOf(s2.getValue()));
		}
		if(ae.getSource()==s3)
		{
			s.setBackground(new Color(s1.getValue(),s2.getValue(),s3.getValue()));
			bluev.setText(String.valueOf(s3.getValue()));
			bluev1.setText(String.valueOf(s3.getValue()));
		}
	}
	public static void main(String arg[])
	{
		colormixer mx=new colormixer();
	}
}