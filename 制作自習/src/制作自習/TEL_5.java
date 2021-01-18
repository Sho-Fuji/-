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

public class TEL_5 extends JDialog {
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
	private JLabel MessageLabel;
	private keigomenu menu=new keigomenu();
	private BMS12 n5 = new BMS12();
	public int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			TEL_5 dialog = new TEL_5();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @return 
	 */
	public TEL_5() {
		setBounds(100, 100, 517, 325);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("<html>電話のかけ方で名指し人を依頼する際に<br>誤っているものを選べ<html>");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		lblNewLabel.setBounds(21, -5, 405, 50);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(10, 46, 488, 127);
		contentPanel.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		ARadioButton = new JRadioButton("「○○様をお願いできますでしょうか」");
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("「恐れ入りますが、○○様をお願いできますでしょうか」");
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("「お忙しいところ恐れ入りますが、○○様をお願いできますでしょうか」");
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		
		DRadioButton = new JRadioButton("「申し訳ございませんが、○○様をお願いできますでしょうか」");
		DRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(DRadioButton);
		
		bg = new ButtonGroup();
		bg.add(ARadioButton);
		bg.add(BRadioButton);
		bg.add(CRadioButton);
		bg.add(DRadioButton);
		
		kaisetuLabel = new JLabel(" ");
		kaisetuLabel.setVerticalAlignment(SwingConstants.TOP);
		kaisetuLabel.setBounds(31, 222, 533, 50);
		contentPanel.add(kaisetuLabel);
		
		MessageLabel = new JLabel("");
		MessageLabel.setFont(new Font("游ゴシック", Font.BOLD, 40));
		MessageLabel.setBounds(21, 173, 334, 61);
		contentPanel.add(MessageLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				AnswerButton = new JButton("解答");
				AnswerButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(ARadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解です。「○○様をお願いできますでしょうか」という依頼の仕方は間違いです。</html>");
							MessageLabel.setText("〇 正解");
							MessageLabel.setForeground(Color.RED);
							count+=1;
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「○○様をお願いできますでしょうか」が正解です。</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「○○様をお願いできますでしょうか」が正解です。</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「○○様をお願いできますでしょうか」が正解です。</html>");
							MessageLabel.setText("× 不正解");
						}			
						ARadioButton.setEnabled(false);
						BRadioButton.setEnabled(false);
						CRadioButton.setEnabled(false);
						DRadioButton.setEnabled(false);
						AnswerButton.setEnabled(false);
						NextButton.setEnabled(true);
					}
				});
				
				JButton BackButton = new JButton("戻る");
				BackButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						menu.setVisible(true);
					}
				});
				buttonPane.add(BackButton);
				BackButton.setActionCommand("Cancel");
				AnswerButton.setActionCommand("OK");
				buttonPane.add(AnswerButton);
				getRootPane().setDefaultButton(AnswerButton);
			}
			{
				NextButton = new JButton("次へ");
				NextButton.setEnabled(false);
				NextButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						n5.count=count;
						setVisible(false);
						n5.setVisible(true);
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}
