package pantallas.pantallas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;

import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import java.awt.SystemColor;
import java.awt.Component;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.CompoundBorder;
import javax.swing.ImageIcon;

public class PlantillaPantallas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelGeneral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlantillaPantallas frame = new PlantillaPantallas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlantillaPantallas() {
		
		/// USAMOS FLAT LAF PARA CUSTOMIZAR LOS COMPONENTES DE SWING JAVA
		FlatMaterialLighterIJTheme.setup();
		try {
		    UIManager.setLookAndFeel( new FlatMaterialLighterIJTheme() );
		} catch( Exception ex ) {
		    System.err.println( "Failed to initialize LaF" );
		}
		UIManager.put( "Button.arc", 100 );
		UIManager.put( "Component.arc", 100 );
		UIManager.put( "ProgressBar.arc", 100 );
		UIManager.put( "TextComponent.arc", 100 );
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 513);
		panelGeneral = new JPanel();
		panelGeneral.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelGeneral);
		panelGeneral.setLayout(null);
		
		JPanel panelMenuLateral = new JPanel();
		panelMenuLateral.setBackground(new Color(13, 71, 161));
		panelMenuLateral.setBounds(0, 0, 177, 476);
		panelGeneral.add(panelMenuLateral);
		panelMenuLateral.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("CERRAJERIA");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(44, 35, 133, 39);
		panelMenuLateral.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LAS HERAS");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(44, 63, 133, 31);
		panelMenuLateral.add(lblNewLabel_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(21, 101, 168));
		panel_3.setBounds(0, 137, 177, 273);
		panelMenuLateral.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("  INICIO");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBounds(0, 10, 177, 45);
		panel_3.add(btnNewButton);
		btnNewButton.setIconTextGap(10);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(null);
		btnNewButton.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(21, 101, 168));
		
		JButton btnNewButton_1 = new JButton("  MARCAS");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setIcon(null);
		btnNewButton_1.setIconTextGap(10);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(21, 101, 168));
		btnNewButton_1.setBounds(0, 59, 177, 45);
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("  TIPOS DE PRODUCTO");
		btnNewButton_1_1.setFocusPainted(false);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1.setIcon(null);
		btnNewButton_1_1.setIconTextGap(10);
		btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(new Color(21, 101, 168));
		btnNewButton_1_1.setBounds(0, 108, 177, 45);
		panel_3.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("  PRODUCTOS");
		btnNewButton_1_1_1.setFocusPainted(false);
		btnNewButton_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1_1_1.setIcon(null);
		btnNewButton_1_1_1.setIconTextGap(10);
		btnNewButton_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
		btnNewButton_1_1_1.setBorderPainted(false);
		btnNewButton_1_1_1.setBorder(null);
		btnNewButton_1_1_1.setBackground(new Color(21, 101, 168));
		btnNewButton_1_1_1.setBounds(0, 157, 177, 45);
		panel_3.add(btnNewButton_1_1_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(0, 56, 177, 2);
		panel_3.add(separator_2);
		separator_2.setForeground(new Color(255, 255, 255));
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(0, 105, 177, 2);
		panel_3.add(separator_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(0, 8, 177, 2);
		panel_3.add(separator_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(0, 154, 177, 2);
		panel_3.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(0, 203, 177, 2);
		panel_3.add(separator_5);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 104, 124, 8);
		panelMenuLateral.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Gabriel Quinteros\\Desktop\\GitHub\\Proyectos para Portfolio\\Cerrajeria-Java-MySQL-Hibernate\\src\\main\\resources\\imagenes\\Logo 2_prev_ui.png"));
		lblNewLabel_1.setBackground(new Color(13,73,123));
		lblNewLabel_1.setForeground(new Color(13, 73, 123));
		lblNewLabel_1.setBounds(10, 40, 44, 44);
		panelMenuLateral.add(lblNewLabel_1);
		
		JPanel panelTituloVentana = new JPanel();
		panelTituloVentana.setBackground(new Color(25,118,210));
		panelTituloVentana.setBounds(178, 26, 581, 60);
		panelGeneral.add(panelTituloVentana);
		panelTituloVentana.setLayout(null);
		
		JLabel titleFunc = new JLabel("FUNCIONALIDAD");
		titleFunc.setForeground(SystemColor.text);
		titleFunc.setBounds(10, 10, 561, 40);
		panelTituloVentana.add(titleFunc);
		titleFunc.setFont(new Font("Tahoma", Font.BOLD, 26));
		titleFunc.putClientProperty( "FlatLaf.styleClass", "h1" );
		
		
		JPanel panelPaddingBot = new JPanel();
		panelPaddingBot.setBounds(178, 87, 581, 27);
		panelGeneral.add(panelPaddingBot);
		
		JPanel panelPaddingTop = new JPanel();
		panelPaddingTop.setBounds(178, 0, 581, 27);
		panelGeneral.add(panelPaddingTop);
		panelPaddingTop.setLayout(null);
		
		JLabel labFechaActual = new JLabel("fecha");
		labFechaActual.setBounds(309, 0, 272, 27);
		panelPaddingTop.add(labFechaActual);
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", Locale.forLanguageTag("es"));
		String formattedDate = fechaActual.format(formatter);	
		labFechaActual.setText("Hoy es "+formattedDate);
		labFechaActual.putClientProperty( "FlatLaf.style", "font: $h4.font" );
		
		JPanel panelUtilidad = new JPanel();
		panelUtilidad.setBounds(178, 112, 581, 364);
		panelGeneral.add(panelUtilidad);
	}
}
