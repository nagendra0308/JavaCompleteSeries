import java.awt.*;
class program21a extends Frame implements Runnable
{
	Thread t;
	TextField ti,t2;
	program21a()
	{
	t=new Thread(this,"NC");
	t1=new TextField(2);
	t2=new TextField(2);
	setSize(200,200);
	setVisible(True);
	add(t1);
	add(t2);
	setLaout(new FlowLayout());
	}
 	

}



class program21
{
public static void main(String args[])
	{

	program21a o1=new program21a();
	
	}



}