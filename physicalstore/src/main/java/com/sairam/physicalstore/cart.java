package com.sairam.physicalstore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;

public class cart {

	private JFrame frame;
	public ArrayList<String> b1;
	public ArrayList<String> b2;
	public ArrayList<String> b3;
	DefaultListModel listModel;
	int result=0;
	JFrame of;
	public ArrayList<Integer> b4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cart n = new cart();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 */
	cart(){
		initialize();
	}
	
	
	public cart(ArrayList<String> al,ArrayList<String> a2,ArrayList<String> a3,ArrayList<Integer> a4,final JFrame otherFrame) {
		
		b1= new  ArrayList<String>(al);
		b2= new  ArrayList<String>(a2);
		b3= new  ArrayList<String>(a3);
		b4= new  ArrayList<Integer>(a4);
		of=otherFrame;
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 364, 344);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		listModel = new DefaultListModel();
		listModel.addElement("silk");
		listModel.addElement("element");
		JLabel lblBill = new JLabel("Bill");
		lblBill.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblBill.setBounds(148, 11, 100, 25);
		frame.getContentPane().add(lblBill);
		
		JLabel lblProductName = new JLabel("Product Name");
		lblProductName.setBounds(10, 46, 78, 14);
		frame.getContentPane().add(lblProductName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(120, 47, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setBounds(202, 46, 46, 14);
		frame.getContentPane().add(lblQty);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(292, 46, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblGrandTotal = new JLabel("GRAND TOTAL");
		lblGrandTotal.setBounds(160, 240, 88, 14);
		frame.getContentPane().add(lblGrandTotal);
		
		JLabel lblGt = new JLabel("GT");
		lblGt.setBounds(292, 240, 46, 14);
		frame.getContentPane().add(lblGt);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	frame.setVisible(false);
		    	frame.dispose();
		    	
		    	
		    	new products();
		    	

		    }
		});
		
		
		
		
		JButton btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(236, 271, 89, 23);
		frame.getContentPane().add(btnCheckout);
		btnCheckout.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
		    	frame.dispose();
		    	new Window(1);
		    	new products(1);
		    	of.dispose();
				
			}
		}
		);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		String [] name = new String [100] ;
		String [] price=new String [100] ;
		String [] qty =new String [100];
		Integer [] total=new Integer[100];
		b1.toArray(name);
		b2.toArray(price);
		b3.toArray(qty);
		b4.toArray(total);
		
		
		
		
		
		JList list = new JList(name);
		list.setBounds(10, 71, 78, 157);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList(price);
		list_1.setBounds(98, 72, 72, 157);
		frame.getContentPane().add(list_1);
		
		JList list_2 = new JList(qty);
		list_2.setBounds(190, 71, 46, 158);
		frame.getContentPane().add(list_2);
		
		JList list_3 = new JList(total);
		list_3.setBounds(267, 71, 60, 157);
		frame.getContentPane().add(list_3);
		
	
			for (int i=0;i<total.length;i++ )
			{
				if(total[i]!=null){
				System.out.println(total[i]);
				result= result+total[i];
				String res = new String ();
				res=Integer.toString(result);
				lblGt.setText(res); 
				}
				else
				{
					break;
				}		
				
				 
			}
			
		
		
		frame.setVisible(true);
	}
}
