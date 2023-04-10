package yuvaraj.practice.Practices;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


class calculator extends JFrame{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2,b3,b4;
	calculator(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		l1=new JLabel("Simple Calculator OF UV: ");
		l2=new JLabel(" ");
		l1.setForeground(Color.GREEN);
		
		l1.setFont(new Font("Times New Roman",Font.BOLD,20));
		l1.setBounds(60, 10, 300, 30);
		l2.setBounds(250, 90	,250,	70);
		add(l1);
		add(l2);
		
		t1=new JTextField(60);
		t2=new JTextField(60);
		b1=new JButton("ADD");
		b2=new JButton("SUB");
		b3=new JButton("MUL");
		b4=new JButton("DIV");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(t1);
		add(t2);
		t1.setBounds(100, 60, 120, 30);
		t2.setBounds(100, 100, 120, 30);
		b1.setBounds(100,140,60,30);
		b2.setBounds(160, 140, 60, 30);
		b3.setBounds(100, 170, 60, 30);
		b4.setBounds(160, 170, 60, 30);
		
		//Addition
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				int no1=Integer.parseInt(t1.getText());
				int no2=Integer.parseInt(t2.getText());
				l2.setText("Addition of Two Numbers: "+(no1+no2));
				
				
			}
		});
		
		//Subtraction
b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int no1=Integer.parseInt(t1.getText());
				int no2=Integer.parseInt(t2.getText());
				l2.setText("Subtraction of Two Numbers: "+(no1-no2));
				
				
			}
		});

//Multiply
b3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int no1=Integer.parseInt(t1.getText());
		int no2=Integer.parseInt(t2.getText());
		l2.setText("Multiplication of Two Numbers: "+(no1*no2));
		
		
	}
});

//Division
b4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int no1=Integer.parseInt(t1.getText());
		int no2=Integer.parseInt(t2.getText());
		l2.setText("Division of Two Numbers: "+(no1/no2));
		
		
	}
});
		
		
	}
	
		
}



public class SimpleCalculator 
{
public static void main(String[] args) {
	calculator ch=new calculator();
	ch.setBounds(400,200,400,250);
	ch.setVisible(true);
	
	
	
}
}