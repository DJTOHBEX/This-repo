package mribrahimtasks;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckMore {

	public static void main(String[] args) {
		String meet = "Lets check".toUpperCase();
		int mis = 12345;
		
		if(mis == 12)
			System.out.println("True");
		else
			System.out.println("False");
		if(meet.contains("C"))
			System.out.println("True");
		else
			System.out.println("False");
		System.out.println(meet.charAt(8));
//		System.out.println(mis);
		JFrame fr = new JFrame();
		fr.setVisible(true);
		fr.getContentPane().setBackground(Color.BLACK);
		fr.setFocusable(true);
		fr.setSize(200,200);
		fr.setLayout(new FlowLayout());
		fr.setTitle("MyFrame.Jframe");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocationRelativeTo(null);

	    JLabel l = new JLabel();
	    l.setVisible(true);
	    l.setText("Contact here");
	    l.setSize(50,50);
	    l.setFocusable(true);
//	    l.setLayout(new FlowLayout());
	    l.setForeground(Color.yellow);
//	    l.setBackground(Color.green);
	    fr.add(l);
	    
	    
		Button bt = new Button("myButton");
		bt.setVisible(true);
		bt.setSize(30,30);
		bt.setFocusable(true);
		bt.setForeground(Color.blue);
		bt.setBackground(Color.gray);
		fr.add(bt);
	}
}
