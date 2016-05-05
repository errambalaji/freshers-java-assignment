package com.sairam.physicalstore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

public class Window  {

	private JFrame frame;
	JLabel label;
	int finalc;
	int fan;
	static JButton btnEnterStore;
	static String cartno = "5";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window(int m){
		
		fan = Integer.parseInt(cartno);
		fan++;
		cartno=Integer.toString(fan);
		System.out.println(cartno);
		
		
		cartup();
		
		
		
	}
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void cartup(){
System.out.println("cart up ");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Our Store");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(144, -31, 161, 120);
		frame.getContentPane().add(lblNewLabel_1);
		 frame.setVisible(false);
         frame.dispose();
		btnEnterStore = new JButton("Enter Store");
		btnEnterStore.setBounds(163, 149, 89, 23);
		frame.getContentPane().add(btnEnterStore);
		btnEnterStore.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("button clicked");
				if(Integer.parseInt(cartno)!= 0){
					products p= new products(frame);
					finalc = Integer.parseInt(cartno);
					finalc--;
					cartno= Integer.toString(finalc);
					label.setText(cartno);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No carts available please Wait");

				}
				
				
												
			}
			
		});
		JLabel lblNoOfCarts = new JLabel("No of carts ");
		lblNoOfCarts.setBounds(315, 75, 71, 14);
		frame.getContentPane().add(lblNoOfCarts);
		
		JPanel panel = new JPanel();
		panel.setBounds(367, 75, 57, 54);
		frame.getContentPane().add(panel);
		
		label = new JLabel("0");
		panel.add(label);
		label.setText(cartno);
				
				if(fan<5)
				{
			label.setText(cartno);
			System.out.println(fan);
			panel.repaint();
			label.repaint();
			frame.setVisible(true);
				}
			
			
		
		
		
		
	}
	
	
	
	private void initialize() {
		System.out.println("initialize");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Our Store");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(144, -31, 161, 120);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnEnterStore = new JButton("Enter Store");
		btnEnterStore.setBounds(163, 149, 89, 23);
		frame.getContentPane().add(btnEnterStore);
		
		btnEnterStore.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("button clicked");
				if(Integer.parseInt(cartno)!= 0){
					products p= new products(frame);
					finalc = Integer.parseInt(cartno);
					finalc--;
					cartno= Integer.toString(finalc);
					label.setText(cartno);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"No carts available please Wait");

				}
				
				
												
			}
			
		});

		
		
		
		JLabel lblNoOfCarts = new JLabel("No of carts ");
		lblNoOfCarts.setBounds(315, 66, 71, 14);
		frame.getContentPane().add(lblNoOfCarts);
		
		JPanel panel = new JPanel();
		panel.setBounds(374, 66, 38, 23);
		frame.getContentPane().add(panel);
		
		label = new JLabel("0");
		panel.add(label);
		label.setText(cartno);
		
		
		
	}
}
