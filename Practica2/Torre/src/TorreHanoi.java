
import java.awt.Graphics;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import java.awt.Color;


public class TorreHanoi extends JFrame {


	private static final long serialVersionUID = 1L;
	JPanel contentPane;
	static JButton D;
	static JButton B;
	static JButton C;
	static JButton E;
	static JButton F;
	static JButton G;
	JComboBox<Object> Opciones;
	static JButton A;
	static JButton H;

	public TorreHanoi(Graphics g) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 550);
		contentPane =  new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		A = new JButton(" ");
		A.setBackground(new Color(0, 0, 205));
		A.setBounds(100, 100, 120, 25);
		
		B = new JButton(" ");
		B.setBackground(new Color(0, 255, 255));
		
		C = new JButton(" ");
		C.setBackground(new Color(0, 255, 0));
		
		D = new JButton(" ");
		D.setBackground(new Color(255, 0, 0));
		
		E = new JButton(" ");
		E.setBackground(new Color(255, 0, 255));
		
		F = new JButton(" ");
		F.setBackground(new Color(0, 0, 128));
		
		G = new JButton(" ");
		G.setBackground(new Color(0, 128, 128));
		
	    H = new JButton(" ");
	    H.setForeground(Color.BLUE);
	    H.setBackground(new Color(128, 128, 0));
	    
	    
	    
		
		Opciones = new JComboBox<Object>();

		
		JLabel lblCantidadDeDiscos = new JLabel("Cantidad de discos");
		lblCantidadDeDiscos.setBackground(Color.BLUE);
		
		JButton baseA = new JButton("BASE 1");
		baseA.setBounds(100, 150, 120, 25);
		
		JButton baseB = new JButton("BASE 2");
		baseB.setBounds(300, 150, 120, 25);
		
		JButton baseC = new JButton("BASE 3");
		baseC.setBounds(300, 150, 120, 25);
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCantidadDeDiscos, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(Opciones, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(A, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
									.addGap(45))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(baseA, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
									.addGap(40)))
							.addComponent(baseB, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(baseC, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
							.addGap(40))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(42)
							.addComponent(B, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(53)
							.addComponent(C, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(62)
							.addComponent(D, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(74)
							.addComponent(E, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(84)
							.addComponent(F, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(94)
							.addComponent(G, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
					.addGap(13))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(102)
					.addComponent(H, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(556, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCantidadDeDiscos)
						.addComponent(Opciones, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(178)
					.addComponent(H)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(G)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(F)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(E)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(D)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(C)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(B)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(A)
					
					
					
					
					.addGap(4)
					.addGap(40))
		);
		contentPane.setLayout(gl_contentPane);
	}

	
	
	

}
