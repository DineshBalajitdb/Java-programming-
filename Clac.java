import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;
import java.util.*;
import java.io.*;
//<Appelet code ="Clac" height =300 width =300></Applet>
public class Clac extends JApplet implements ActionListener
{
	int i;
	JButton[] B=new JButton[17];
	JButton clear=new JButton("Clear");
	TextField T =new TextField("",0);
	boolean boo =false;
	String Operator=" ",Mem1,Mem2;
	boolean Boo=false;
	public void init()
	{
		setLayout(new BorderLayout());
		Panel P=new Panel();
		P.setLayout(new GridLayout(4,4,2,2));
		for(i=0;i<=15;i++);
		{
			if(i<=9)
			{
				B[i]=new JButton(""+i);
			}
			else if(i==10)
			{
				B[i]=new JButton("C");
			}
			else if(i==11)
			{
				B[i]=new JButton("+");
			}
			else if(i==12)
			{
				B[i]=new JButton("-");
			}
			else if(i==13)
			{
				B[i]=new JButton("*");
			}
			else if(i==14)
			{
				B[i]=new JButton("/");
			}
			else
			{
				B[i]=new JButton("=");
		
				B[i].addActionListener(this);
				P.add(B[i]);
			}
		}
		clear.addActionListener(this);
		add(T,BorderLayout.NORTH);
		add(P,BorderLayout.CENTER);
		add(clear,BorderLayout.SOUTH);
		start();
	}
	public void actionPerformed(ActionEvent AE)
	{
		int i,A,Be;
		if(AE.getSource()==B[0])
		{
			if(T.getText().length()==0)
			{
				Mem1="";
				Mem2="";
				T.setText("");
			}
			else
			{
				T.setText(T.getText()+"0");
			}
		}
	
		else if(AE.getSource()==clear)
		{
			Mem1=" ";
			Mem2=" ";
			T.setText(" ");
		}
		else 
		{
			for(i=0;i<=15;i++)
			{
				if(AE.getSource()==B[i])
				{
					if(i<=9)
					{
						T.setText(T.getText()+B[i].getLabel());

					}
					else if(B[i].getLabel()=="=")
					{
						A=Integer.parseInt(Mem1);
						Mem2 =T.getText();
						Be=Integer.parseInt(Mem2);
						if(Operator=="+")
						{
							T.setText(""+(A+Be));
						}
						else if(Operator=="-")
						{
							T.setText(""+(A-Be));
						}
						else if(Operator=="*")
						{
							T.setText(""+(A*Be));
						}
						else if(Operator=="/")
						{
							T.setText(""+(A/Be));
						}
						Mem1=T.getText();
					}
					
					else 
					{
						Mem1=T.getText();
						Operator=B[i].getLabel();
						T.setText("");
	
					}
					
				}
			}
		}
	}
}	

					
	
	