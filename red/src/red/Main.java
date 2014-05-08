package red;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame= new JFrame("Red de Ordenamiento");
		frame.setSize(900,500);	
		JPanel panel= new JPanel();
		JButton btn1=new JButton("Construye tu red de ordenamiento");
		JLabel label2= new JLabel("                               ");//esta etiqueta en blanco se le pasa al panel  
		//JButton btn2=new JButton();				// WEST para q no funcione como un boton
		JButton btn3=new JButton();
		JButton btn4=new JButton();
		//JButton btn5=new JButton();
		BorderLayout bl= new BorderLayout();
		panel.setLayout(bl);
		panel.add(btn1, BorderLayout.NORTH);
		btn4.setBounds(30,100,30,30); 	// este metodo ubica el btn4 en la posision x=30 y=100 de tama�o 30x30
		btn4.setBackground(Color.pink);
		//panel.add(btn2, BorderLayout.SOUTH);
		panel.add(btn3, BorderLayout.CENTER);
		panel.add(label2, BorderLayout.WEST);
		//panel.add(btn5, BorderLayout.EAST);
		JCheckBox box1=new JCheckBox("< a >");
		box1.setBounds(20,380,70,70);
		JButton boton = new java1430("");
		boton.setBounds(30,150,30,30);
	    boton.setBackground( Color.yellow );
	    // Se incorpora a la ventana
	    frame.getContentPane().add( boton );
	    frame.add(box1);
		frame.add(btn4);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
