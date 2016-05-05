package com.sairam.physicalstore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class products  {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public ArrayList<String> al;
	public ArrayList<String> a2;
	public ArrayList<String> a3;
	public ArrayList<Integer> a4;
	
	JFrame of = new JFrame();
	ArrayList<JFrame> jFrameList = new ArrayList<JFrame>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					products window = new products();
					window.frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 * 
	 * 
	 */
	
	public products(int n)
	{
		frame = new JFrame();
		frame.setVisible(false);
		frame.dispose();
		
	}
	public products(final JFrame otherFrame){
		System.out.println("called");
		jFrameList.add(otherFrame);
		System.out.println(jFrameList);
		initialize();
		
		
	}
	public products() {
		System.out.println("called");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		System.out.println("called");
		al=new ArrayList<String>();
		a2=new ArrayList<String>();
		a3=new ArrayList<String>();
		a4=new ArrayList<Integer>();
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 300);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{46, 266, 0, 89, 0};
		gridBagLayout.rowHeights = new int[]{14, 23, 23, 23, 23, 23, 23, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	frame.setVisible(false);
		    	frame.dispose();
		    	System.out.println(jFrameList);
		    	
		    	
		    	new Window(1);
		    	System.out.println(jFrameList);

		    }
		});
		
		JLabel lblProducts = new JLabel("Products ");
		lblProducts.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProducts.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblProducts = new GridBagConstraints();
		gbc_lblProducts.anchor = GridBagConstraints.NORTH;
		gbc_lblProducts.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblProducts.insets = new Insets(0, 0, 5, 5);
		gbc_lblProducts.gridx = 1;
		gbc_lblProducts.gridy = 0;
		frame.getContentPane().add(lblProducts, gbc_lblProducts);
		
		JLabel lblQty = new JLabel("qty");
		GridBagConstraints gbc_lblQty = new GridBagConstraints();
		gbc_lblQty.insets = new Insets(0, 0, 5, 5);
		gbc_lblQty.gridx = 2;
		gbc_lblQty.gridy = 0;
		frame.getContentPane().add(lblQty, gbc_lblQty);
		
		JLabel lblName = new JLabel("Silk");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.gridx = 0;
		gbc_lblName.gridy = 1;
		frame.getContentPane().add(lblName, gbc_lblName);
		
		JLabel lblPrice = new JLabel("105");
		GridBagConstraints gbc_lblPrice = new GridBagConstraints();
		gbc_lblPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrice.gridx = 1;
		gbc_lblPrice.gridy = 1;
		frame.getContentPane().add(lblPrice, gbc_lblPrice);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnAddToCart = new JButton("Add to Cart");
		GridBagConstraints gbc_btnAddToCart = new GridBagConstraints();
		gbc_btnAddToCart.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnAddToCart.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddToCart.gridx = 3;
		gbc_btnAddToCart.gridy = 1;
		frame.getContentPane().add(btnAddToCart, gbc_btnAddToCart);
		btnAddToCart.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textField.getText()==null){
					
				}else{
					al.add("silk");
					a2.add("105");
					String sqty = textField.getText();
					a3.add(sqty);
					int sq = Integer.parseInt(sqty);
					int sprice = sq*105;
					a4.add(sprice);
					System.out.println(al);
					System.out.println(a2);
					System.out.println(a3);
					System.out.println(a4);
				}
				
				
				
			}
			
		});
		
		JLabel lblSnickers = new JLabel("Snickers");
		GridBagConstraints gbc_lblSnickers = new GridBagConstraints();
		gbc_lblSnickers.insets = new Insets(0, 0, 5, 5);
		gbc_lblSnickers.gridx = 0;
		gbc_lblSnickers.gridy = 2;
		frame.getContentPane().add(lblSnickers, gbc_lblSnickers);
		
		JLabel label_5 = new JLabel("35");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 2;
		frame.getContentPane().add(label_5, gbc_label_5);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 2;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("Add to Cart");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTHWEST;
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 3;
		gbc_button.gridy = 2;
		frame.getContentPane().add(button, gbc_button);
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textField_1.getText()==null){
					
				}else{
					al.add("Snickers");
					a2.add("35");
					String sqty = textField_1.getText();
					a3.add(sqty);
					int sq = Integer.parseInt(sqty);
					int sprice = sq*35;
					a4.add(sprice);
					System.out.println(al);
					System.out.println(a2);
					System.out.println(a3);
					System.out.println(a4);
				}
				
				
				
			}
			
		});
		
		JLabel lblFerreroRocher = new JLabel("Ferrero Rocher");
		GridBagConstraints gbc_lblFerreroRocher = new GridBagConstraints();
		gbc_lblFerreroRocher.insets = new Insets(0, 0, 5, 5);
		gbc_lblFerreroRocher.gridx = 0;
		gbc_lblFerreroRocher.gridy = 3;
		frame.getContentPane().add(lblFerreroRocher, gbc_lblFerreroRocher);
		
		JLabel label_6 = new JLabel("350");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 3;
		frame.getContentPane().add(label_6, gbc_label_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		
		JButton button_1 = new JButton("Add to Cart");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 3;
		gbc_button_1.gridy = 3;
		frame.getContentPane().add(button_1, gbc_button_1);
		button_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textField_2.getText()==null){
					
				}else{
					al.add("ferrero Rocher");
					a2.add("350");
					String sqty = textField_2.getText();
					a3.add(sqty);
					int sq = Integer.parseInt(sqty);
					int sprice = sq*350;
					a4.add(sprice);
					System.out.println(al);
					System.out.println(a2);
					System.out.println(a3);
					System.out.println(a4);
				}
				
				
				
			}
			
		});
		
		JLabel lblMilkybar = new JLabel("MilkyBar");
		GridBagConstraints gbc_lblMilkybar = new GridBagConstraints();
		gbc_lblMilkybar.insets = new Insets(0, 0, 5, 5);
		gbc_lblMilkybar.gridx = 0;
		gbc_lblMilkybar.gridy = 4;
		frame.getContentPane().add(lblMilkybar, gbc_lblMilkybar);
		
		JLabel label_7 = new JLabel("10");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 5);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 4;
		frame.getContentPane().add(label_7, gbc_label_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 4;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		
		JButton button_2 = new JButton("Add to Cart");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 3;
		gbc_button_2.gridy = 4;
		frame.getContentPane().add(button_2, gbc_button_2);
		button_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textField_3.getText()==null){
					
				}else{
					al.add("MilkyBar");
					a2.add("10");
					String sqty = textField_3.getText();
					a3.add(sqty);
					int sq = Integer.parseInt(sqty);
					int sprice = sq*10;
					a4.add(sprice);
					System.out.println(al);
					System.out.println(a2);
					System.out.println(a3);
					System.out.println(a4);
				}
				
				
				
			}
			
		});
		
		JLabel lblKitKat = new JLabel("Kit Kat");
		GridBagConstraints gbc_lblKitKat = new GridBagConstraints();
		gbc_lblKitKat.insets = new Insets(0, 0, 5, 5);
		gbc_lblKitKat.gridx = 0;
		gbc_lblKitKat.gridy = 5;
		frame.getContentPane().add(lblKitKat, gbc_lblKitKat);
		
		JLabel label_8 = new JLabel("20");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 5);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 5;
		frame.getContentPane().add(label_8, gbc_label_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 5;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		
		JButton button_3 = new JButton("Add to Cart");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_3.insets = new Insets(0, 0, 5, 0);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 5;
		frame.getContentPane().add(button_3, gbc_button_3);
		button_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textField_4.getText()==null){
					
				}else{
					al.add("Kit Kat");
					a2.add("20");
					String sqty = textField_4.getText();
					a3.add(sqty);
					int sq = Integer.parseInt(sqty);
					int sprice = sq*20;
					a4.add(sprice);
					System.out.println(al);
					System.out.println(a2);
					System.out.println(a3);
					System.out.println(a4);
				}
				
				
				
			}
			
		});
		
		JLabel lblLuvIt = new JLabel("Luv it");
		GridBagConstraints gbc_lblLuvIt = new GridBagConstraints();
		gbc_lblLuvIt.insets = new Insets(0, 0, 5, 5);
		gbc_lblLuvIt.gridx = 0;
		gbc_lblLuvIt.gridy = 6;
		frame.getContentPane().add(lblLuvIt, gbc_lblLuvIt);
		
		JLabel label_9 = new JLabel("5");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 6;
		frame.getContentPane().add(label_9, gbc_label_9);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 2;
		gbc_textField_5.gridy = 6;
		frame.getContentPane().add(textField_5, gbc_textField_5);
		
		JButton button_4 = new JButton("Add to Cart");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 0);
		gbc_button_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_button_4.gridx = 3;
		gbc_button_4.gridy = 6;
		frame.getContentPane().add(button_4, gbc_button_4);
		button_4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(textField_5.getText()==null){
					
				}else{
					al.add("Luv it");
					a2.add("5");
					String sqty = textField_5.getText();
					a3.add(sqty);
					int sq = Integer.parseInt(sqty);
					int sprice = sq*5;
					a4.add(sprice);
					System.out.println(al);
					System.out.println(a2);
					System.out.println(a3);
					System.out.println(a4);
				}
				
				
				
			}
			
		});
		
		JButton btnViewCart = new JButton("View Cart");
		GridBagConstraints gbc_btnViewCart = new GridBagConstraints();
		gbc_btnViewCart.gridx = 3;
		gbc_btnViewCart.gridy = 8;
		frame.getContentPane().add(btnViewCart, gbc_btnViewCart);
		frame.setVisible(true);
		btnViewCart.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new cart(al,a2,a3,a4,frame);
			}
			
		});
	}

}
