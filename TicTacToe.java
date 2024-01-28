package Graphics;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame implements ActionListener{
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button1 ,button2, button3, button4, button5, button6, button7, button8 , button9;
	 JLabel label , label2;
	 Random rand = new Random();
	 int num1 ,num2;
	 
	 TicTacToe(){
		 

		 
		 button1 = new JButton();
		 button1.setFocusable(false);
		 button1.setBorder(BorderFactory.createEtchedBorder());
		 button1.setBounds(80,100, 100, 100);
		 button1.addActionListener(this);
		 button2 = new JButton();
		 button2.setFocusable(false);
		 button2.setBorder(BorderFactory.createEtchedBorder());
		 button2.setBounds(180, 100, 100, 100);
		 button2.addActionListener(this);
		 button3 = new JButton();
		 button3.setFocusable(false);
		 button3.setBorder(BorderFactory.createEtchedBorder());
		 button3.setBounds(280, 100, 100, 100);
		 button3.addActionListener(this);
		 button4 = new JButton();
		 button4.setFocusable(false);
		 button4.setBorder(BorderFactory.createEtchedBorder());
		 button4.setBounds(80, 200, 100, 100);
		 button4.addActionListener(this);
		 button5 = new JButton();
		 button5.setFocusable(false);
		 button5.setBorder(BorderFactory.createEtchedBorder());
		 button5.setBounds(180, 200, 100, 100);
		 button5.addActionListener(this);
		 button6 = new JButton();
		 button6.setFocusable(false);
		 button6.setBorder(BorderFactory.createEtchedBorder());
		 button6.setBounds(280, 200, 100, 100);
		 button6.addActionListener(this);
		 button7 = new JButton();
		 button7.setFocusable(false);
		 button7.setBorder(BorderFactory.createEtchedBorder());
		 button7.setBounds(80, 300, 100, 100);
		 button7.addActionListener(this);
		 button8 = new JButton();
		 button8.setFocusable(false);
		 button8.setBorder(BorderFactory.createEtchedBorder());
		 button8.setBounds(180, 300, 100, 100);
		 button8.addActionListener(this);
		 button9 = new JButton();
		 button9.setFocusable(false);
		 button9.setBorder(BorderFactory.createEtchedBorder());
		 button9.setBounds(280, 300, 100, 100);
		 button9.addActionListener(this);
		
		 this.getContentPane().setBackground(Color.black);	
		 this.setVisible(true);
		 this.setSize(500, 500);
		 this.setResizable(false);
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 label = new JLabel();
		 	label.setVisible(true);
			
		 	label.setText("player X turn");
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setVerticalTextPosition(JLabel.TOP);
			label.setBackground(Color.black);
			label.setForeground(Color.green);
			
			label.setOpaque(true);
			label.setFont(new Font("MV Boli", Font.ITALIC, 20));
			label.setBounds(150,0,200,100);
			this.setTitle("TicTacToe");
			label2 = new JLabel();
			label2.setText("player O turn");
			label2.setBounds(150,0,200,100);
			label2.setVisible(false);
			label2.setForeground(Color.red);
			label2.setHorizontalTextPosition(JLabel.CENTER);
			label2.setVerticalTextPosition(JLabel.TOP);
			label2.setFont(new Font("MV Boli", Font.ITALIC, 20));
			this.add(label2);
			this.setLocation(500, 200);
		
	
		 this.add(label);
		 this.add(button1);
		 this.add(button2);
		 this.add(button3);
		 this.add(button4);
		 this.add(button5);
		 this.add(button6);
		 this.add(button7);
		 this.add(button8);
		 this.add(button9);
		 
		 this.getContentPane().setLayout(null);
		 
		
		 
	 }
	 
	 int flag = 0;
	 
	
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		 
		if(e.getSource()==button1 &&  (button1.getText()!="X" && button1.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			
			button1.setText("X");
			flag++;
			CheckWinner();
			button1.setBackground(Color.green);
			}
			else {
				button1.setText("O");
				flag++;
				button1.setBackground(Color.red);
				CheckWinner();
				
			}
		}
		if(e.getSource()==button2 &&  (button2.getText()!="X" && button2.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			button2.setText("X");
			flag++;
			CheckWinner();
			button2.setBackground(Color.green);
			}
			else {
				button2.setText("O");
				flag++;
				button2.setBackground(Color.red);
				CheckWinner();
				
			}
		}
		if(e.getSource()==button3  &&  (button3.getText()!="X" && button3.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			button3.setText("X");
			flag++;
			button3.setBackground(Color.green);
			CheckWinner();
		
			}
			else {
				button3.setText("O");
				flag++;
				button3.setBackground(Color.red);
				CheckWinner();
			}
		}
		if(e.getSource()==button4 &&  (button4.getText()!="X" && button4.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			button4.setText("X");
			flag++;
			button4.setBackground(Color.green);
			CheckWinner();
			
			}
			else {
				button4.setText("O");
				flag++;
				button4.setBackground(Color.red);
				CheckWinner();
			}
		}
		if(e.getSource()==button5  &&  (button5.getText()!="X" && button5.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			button5.setText("X");
			flag++;
			button5.setBackground(Color.green);
			CheckWinner();
	
			}
			else {
				button5.setText("O");
				flag++;
				button5.setBackground(Color.red);
				CheckWinner();
			
			}
		}
		if(e.getSource()==button6 &&  (button6.getText()!="X" && button6.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			button6.setText("X");
			flag++;
			button6.setBackground(Color.green);
			CheckWinner();
			}
			else {
				button6.setText("O");
				flag++;
				button6.setBackground(Color.red);
				CheckWinner();
			}
		}
		if(e.getSource()==button7  &&  (button7.getText()!="X" && button7.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			button7.setText("X");
			flag++;
			button7.setBackground(Color.green);
			CheckWinner();
			}
			else {
				button7.setText("O");
				flag++;
				button7.setBackground(Color.red);
				CheckWinner();
			}
		}
		if(e.getSource()==button8  &&  (button8.getText()!="X" && button8.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			button8.setText("X");
			flag++;
			button8.setBackground(Color.green);
			CheckWinner();
			}
			else {
				button8.setText("O");
				flag++;
				button8.setBackground(Color.red);
				CheckWinner();
			}
		}
		if(e.getSource()==button9  &&  (button9.getText()!="X" && button9.getText()!="O"))
		{	
			if(flag % 2 == 0) {
			button9.setText("X");
			flag++;
			button9.setBackground(Color.green);
			CheckWinner();
			}
			else {
				button9.setText("O");
				flag++;
				button9.setBackground(Color.red);
				CheckWinner();
			}
		}
		int check=3;
		
		
		if(CheckWinner()==false && flag==9) {
			  JOptionPane.showMessageDialog(null, "Game Over! It is a draw");
			  this.setVisible(false);
			  new TicTacToe();
			  
		}
		if(flag % 2 ==0 ) {
			label2.setVisible(false);
			label.setVisible(true);
			check =1;
		}
		else {
			label.setVisible(false);
			label2.setVisible(true);
			check=2;
		}
		if(CheckWinner()) {
			if(check == 1) {
				JOptionPane.showMessageDialog(null, "Player O wins!");
				this.setVisible(false);
			}
			if (check ==2) {
				JOptionPane.showMessageDialog(null, "Player X wins!");
				this.setVisible(false);
			}
			
			
			new TicTacToe();
			
		}
	
	}
	boolean CheckWinner() {
		
			if(button1.getText()=="X" && "X"==button3.getText() && button2.getText()=="X" ) {
				//JOptionPane.showMessageDialog(null, "Player X wins!");
			
				
				return true;
			}
			if(button4.getText()=="X" && "X"==button5.getText() && button6.getText()=="X" ) {
				//JOptionPane.showMessageDialog(null, "Player X wins!");	
				return true;
				}
			if(button7.getText()=="X" && "X"==button8.getText() && button9.getText()=="X" ) {
				//JOptionPane.showMessageDialog(null, "Player X wins!");
				return true;
				}
			if(button1.getText()=="X" && "X"==button4.getText() && button7.getText()=="X" ) {
				//JOptionPane.showMessageDialog(null, "Player X wins!");
				return true;
				}
			if(button2.getText()=="X" && "X"==button5.getText() && button8.getText()=="X" ) {
				//JOptionPane.showMessageDialog(null, "Player X wins!");
				
				return true;
				}
			if(button3.getText()=="X" && "X"==button6.getText() && button9.getText()=="X" ) {
			//	JOptionPane.showMessageDialog(null, "Player X wins!");
				return true;
				}
			if(button1.getText()=="X" && "X"==button5.getText() && button9.getText()=="X" ) {
				//JOptionPane.showMessageDialog(null, "Player X wins!");
				return true;
				}
			if(button3.getText()=="X" && "X"==button5.getText() && button7.getText()=="X" ) {
			//	JOptionPane.showMessageDialog(null, "Player X wins!");
				return true;
				}
			if(button1.getText()=="O" && "O"==button3.getText() && button2.getText()=="O" ) {
				//JOptionPane.showMessageDialog(null, "Player O wins!");
				return true;
			}
			if(button4.getText()=="O" && "O"==button5.getText() && button6.getText()=="O" ) {
			//	JOptionPane.showMessageDialog(null, "Player O wins!");	
				return true;
				}
			if(button7.getText()=="O" && "O"==button8.getText() && button9.getText()=="O" ) {
			//	JOptionPane.showMessageDialog(null, "Player O wins!");
				return true;
				}
			if(button1.getText()=="O" && "O"==button4.getText() && button7.getText()=="O" ) {
			//	JOptionPane.showMessageDialog(null, "Player O wins!");
				return true;
				}
			if(button2.getText()=="O" && "O"==button5.getText() && button8.getText()=="O" ) {
			//	JOptionPane.showMessageDialog(null, "Player O wins!");
				return true;
				}
			if(button3.getText()=="O" && "O"==button6.getText() && button9.getText()=="O" ) {
			//	JOptionPane.showMessageDialog(null, "Player O wins!");
				return true;
				}
			if(button1.getText()=="O" && "O"==button5.getText() && button9.getText()=="O" ) {
			//	JOptionPane.showMessageDialog(null, "Player O wins!");
				return true;
				}
			if(button3.getText()=="O" && "O"==button5.getText() && button7.getText()=="O" ) {
				//JOptionPane.showMessageDialog(null, "Player O wins!");
				return true;
				}
			 return false;
		
	}
	public static void main(String[] args) {
		new TicTacToe();
	}
}
