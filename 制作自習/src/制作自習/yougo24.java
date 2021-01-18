package 制作自習;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class yougo24 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton AnswerButton;
	private JButton NextButton;
	private JLabel kaisetuLabel;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JRadioButton ARadioButton;
	private JRadioButton BRadioButton;
	private JRadioButton CRadioButton;
	private JRadioButton DRadioButton;
	private ButtonGroup bg;
	private keigomenu menu = new keigomenu();
	private yougo15 y2 = new yougo15();
	public int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			yougo24 dialog = new yougo24();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public yougo24() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("「ロイヤリティ」の意味は？");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		lblNewLabel.setBounds(34, 10, 319, 50);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(10, 52, 416, 118);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		ARadioButton = new JRadioButton("特別・希少価値");
		ARadioButton.setBounds(0, 6, 273, 25);
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("需要の増加のこと");
		BRadioButton.setBounds(0, 33, 319, 25);
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("ブランド価値・特許");
		CRadioButton.setBounds(0, 60, 319, 25);
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		
		DRadioButton = new JRadioButton("価格競争");
		DRadioButton.setBounds(0, 87, 319, 25);
		DRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(DRadioButton);
		
		bg = new ButtonGroup();
		bg.add(ARadioButton);
		bg.add(BRadioButton);
		bg.add(CRadioButton);
		bg.add(DRadioButton);
		
		kaisetuLabel = new JLabel(" ");
		kaisetuLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 11));
		kaisetuLabel.setVerticalAlignment(SwingConstants.TOP);
		kaisetuLabel.setBounds(10, 175, 334, 80);
		contentPanel.add(kaisetuLabel);
		
		JButton BackButton = new JButton("戻る");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				y2.setVisible(true);
			}
		});
		BackButton.setActionCommand("Cancel");
		BackButton.setBounds(363, 10, 63, 21);
		contentPanel.add(BackButton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				AnswerButton = new JButton("解答");
				AnswerButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(ARadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。<br>ビジネス用語では企業や商品、ビジネスモデルの価値の高さを表し、ロイヤリティの高さは企業の利益につながります。</html>");
							
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。<br>ビジネス用語では企業や商品、ビジネスモデルの価値の高さを表し、ロイヤリティの高さは企業の利益につながります。</html>");
							
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解です。<br>ビジネス用語では企業や商品、ビジネスモデルの価値の高さを表し、ロイヤリティの高さは企業の利益につながります。</html>");
							count++;
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。<br>ビジネス用語では企業や商品、ビジネスモデルの価値の高さを表し、ロイヤリティの高さは企業の利益につながります。</html>");
							
						}			
						ARadioButton.setEnabled(false);
						BRadioButton.setEnabled(false);
						CRadioButton.setEnabled(false);
						DRadioButton.setEnabled(false);
						AnswerButton.setEnabled(false);
						NextButton.setEnabled(true);
					}
				});
				AnswerButton.setActionCommand("OK");
				buttonPane.add(AnswerButton);
				getRootPane().setDefaultButton(AnswerButton);
			}
			{
				NextButton = new JButton("次へ");
				NextButton.setEnabled(false);
				NextButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						y2.count = count;
						setVisible(false);
						y2.setVisible(true);
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}
