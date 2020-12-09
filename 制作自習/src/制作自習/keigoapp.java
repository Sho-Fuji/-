package 制作自習;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 */

/**
 * @author 0H02020 難波聖
 *
 */
public class keigoapp extends JFrame {

	private JPanel contentPane;
	private keigomenu menu=new keigomenu();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					keigoapp frame = new keigoapp();
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
	public keigoapp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel DIspLabel = new JLabel("語の学び舎");
		DIspLabel.setBounds(79, 45, 347, 57);
		DIspLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DIspLabel.setFont(new Font("HG行書体", Font.PLAIN, 39));
		contentPane.add(DIspLabel);
		
		JLabel DispLabel1 = new JLabel("敬");
		DispLabel1.setBounds(22, 13, 151, 77);
		DispLabel1.setForeground(Color.RED);
		DispLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		DispLabel1.setFont(new Font("HG行書体", Font.PLAIN, 99));
		contentPane.add(DispLabel1);
		
		JButton StartButton = new JButton("START");
		StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				menu.setVisible(true);
				setVisible(menu.okFlag);
			}
		});
		StartButton.setBounds(142, 150, 151, 41);
		StartButton.setFont(new Font("Gill Sans Ultra Bold Condensed", Font.PLAIN, 25));
		contentPane.add(StartButton);
		
		JButton EndButton = new JButton("終了");
		EndButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		EndButton.setBounds(142, 201, 151, 41);
		EndButton.setFont(new Font("Dialog", Font.BOLD, 25));
		contentPane.add(EndButton);
		
		
	
	}

}
