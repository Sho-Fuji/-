package 制作自習;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Panel;

public class 制作実習 extends JFrame {

	private JPanel contentPane;
	private ImageIcon Img = new ImageIcon("C:\\Java\\kadai\\背景.png");
	private JLabel DispLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					制作実習 frame = new 制作実習();
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
	public 制作実習() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton btnNewButton = new JButton("\u6587\u6CD5\u7DE8");
		btnNewButton.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		btnNewButton.setBounds(100, 94, 236, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u5B9F\u8DF5\u7DE8");
		btnNewButton_1.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		btnNewButton_1.setBounds(100, 142, 236, 27);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("\u5FA9\u7FD2\u7DE8");
		btnNewButton_1_1.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(100, 189, 236, 27);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("\u623B\u308B");
		btnNewButton_1_1_1.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		btnNewButton_1_1_1.setBounds(100, 226, 93, 27);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("\u7D42\u4E86");
		btnNewButton_1_1_1_1.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		btnNewButton_1_1_1_1.setBounds(242, 226, 93, 27);
		contentPane.add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel = new JLabel("\u30B2\u30FC\u30E0\u30E2\u30FC\u30C9");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("HGP行書体", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 10, 338, 70);
		contentPane.add(lblNewLabel);
		
		
		DispLabel = new JLabel("");
		DispLabel = new JLabel(Img);
		DispLabel.setBounds(0, 0, 448, 274);
		contentPane.add(DispLabel);
	}
}
