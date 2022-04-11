import java.awt.*;
import java.awt.event.*;
class menu extends Frame
{
	public menu()
	{
		setLayout(null);
		setTitle("notepad");
		resize(1000,1000);
		MenuBar mb=new MenuBar();
		Menu fmenu=new Menu("format");
		Menu cmenu=new Menu("color");
		Menu smenu=new Menu("settings");
	    Menu smenu1=new Menu("type");
		MenuItem fmenu1=new MenuItem("font");
		MenuItem cmenu1=new MenuItem("colortpicker");
		MenuItem smenu2=new MenuItem("notepad");
		MenuItem smenu3=new MenuItem("colorPicker");
		mb.add(fmenu);
		mb.add(cmenu);
		
		fmenu.add(fmenu1);
		fmenu.add(smenu);
		smenu.add(smenu1);
		smenu1.add(smenu2);
		smenu1.add(smenu3);
		cmenu.add(cmenu1);
		setMenuBar(mb);
		
		TextArea ar=new TextArea();
		ar.setBounds(50,70,850,850);
		add(ar);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent w)
			{
				System.exit(0);
			}
		});
		show();
	}
	public static void main(String arg[])
	{
		menu m=new menu();
	}
}
