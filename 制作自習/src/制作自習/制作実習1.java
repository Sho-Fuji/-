package êßçÏé©èK;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class êßçÏé¿èK1 extends JFrame {

	private JPanel contentPane;
	private ImageIcon Img = new ImageIcon("C:\\Java\\kadai\\îwåi.png");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					êßçÏé¿èK1 frame = new êßçÏé¿èK1();
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
	public êßçÏé¿èK1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel DIspLabel = new JLabel("\u8A9E\u306E\u5B66\u3073\u820E\r\n");
		DIspLabel.setBounds(79, 45, 347, 57);
		DIspLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DIspLabel.setFont(new Font("HGçsèëëÃ", Font.PLAIN, 39));
		contentPane.add(DIspLabel);
		
		JLabel DispLabel1 = new JLabel("\u656C");
		DispLabel1.setBounds(22, 13, 151, 77);
		DispLabel1.setForeground(Color.RED);
		DispLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		DispLabel1.setFont(new Font("HGçsèëëÃ", Font.PLAIN, 99));
		contentPane.add(DispLabel1);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.setBounds(142, 150, 151, 41);
		btnNewButton.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u7D42\u4E86");
		btnNewButton_1.setBounds(142, 201, 151, 41);
		btnNewButton_1.setFont(new Font("HGçsèëëÃ", Font.BOLD, 25));
		contentPane.add(btnNewButton_1);
		
		JLabel DispLabel2 = new JLabel("");
	}
}
