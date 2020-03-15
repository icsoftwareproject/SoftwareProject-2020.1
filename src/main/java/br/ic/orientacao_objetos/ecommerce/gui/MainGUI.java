package br.ic.orientacao_objetos.ecommerce.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import br.ic.orientacao_objetos.ecommerce.ShoppingCart;
import br.ic.orientacao_objetos.ecommerce.persistence.FilePersistence;
import br.ic.orientacao_objetos.ecommerce.persistence.JSONPersistence;
import br.ic.orientacao_objetos.ecommerce.persistence.PersistenceSession;
import br.ic.orientacao_objetos.ecommerce.product.Product;
import br.ic.orientacao_objetos.ecommerce.product.Refrigerator;
import br.ic.orientacao_objetos.ecommerce.product.Stove;
import br.ic.orientacao_objetos.ecommerce.product.TV;

public class MainGUI extends JFrame {

	private JButton save;
	private JButton remove;
	private JButton find;
	private ButtonGroup buttonGroup;
	
	public MainGUI() {
		initComponents();
	}

	private void initComponents() {
		setLayout(new BorderLayout());

		buttonGroup = new ButtonGroup();
		JRadioButton fileRadioButton = new JRadioButton("File");
		fileRadioButton.setActionCommand("file");
		JRadioButton jsonRadioButton = new JRadioButton("JSON");
		jsonRadioButton.setActionCommand("json");
		buttonGroup.add(fileRadioButton);
		buttonGroup.add(jsonRadioButton);
		
		JPanel actions = new JPanel();
		
		save = new JButton("Save");
		remove = new JButton("Remove");
		find = new JButton("Find");
		
		actions.add(save);
		actions.add(remove);
		actions.add(find);
		
		add(actions, BorderLayout.SOUTH);
		add(fileRadioButton, BorderLayout.EAST);
		add(jsonRadioButton, BorderLayout.WEST);

		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Product samsungTV = new TV("Samsung", 3999.99, 42);
				Refrigerator consulFridge = new Refrigerator("Consul", 2999.99, 60);
				Stove brastempStove = new Stove("Brastemp", 399.99, 4);
				
				ShoppingCart shoppingCart4 = new ShoppingCart(4);
				shoppingCart4.addProduct(samsungTV);
				shoppingCart4.addProduct(consulFridge);
				shoppingCart4.addProduct(brastempStove);

				PersistenceSession persistence;
				if (buttonGroup.getSelection().getActionCommand().equals("file")) {
				    persistence = new FilePersistence();
				} else {
					persistence = new JSONPersistence();
				}
				persistence.save(shoppingCart4);
			}
		});
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainGUI();
	}
	
}