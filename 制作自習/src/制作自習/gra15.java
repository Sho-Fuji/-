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

public class gra15 extends JDialog {

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
	private gra16 n8 = new gra16();
	public int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			gra15 dialog = new gra15();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public gra15() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("「あげる」の謙譲語は？？");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		lblNewLabel.setBounds(34, 10, 319, 50);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(73, 70, 353, 57);
		contentPanel.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		ARadioButton = new JRadioButton("贈る");
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("あげます");
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("差し上げる");
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		
		DRadioButton = new JRadioButton("あげさせて");
		DRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(DRadioButton);
		
		bg = new ButtonGroup();
		bg.add(ARadioButton);
		bg.add(BRadioButton);
		bg.add(CRadioButton);
		bg.add(DRadioButton);
		
		kaisetuLabel = new JLabel(" ");
		kaisetuLabel.setVerticalAlignment(SwingConstants.TOP);
		kaisetuLabel.setBounds(44, 177, 358, 83);
		contentPanel.add(kaisetuLabel);
		
		JButton BackButton = new JButton("戻る");
		BackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				menu.setVisible(true);
			}
		});
		BackButton.setActionCommand("Cancel");
		BackButton.setBounds(363, 10, 63, 21);
		contentPanel.add(BackButton);
		
		MessageLabel = new JLabel("");
		MessageLabel.setFont(new Font("游ゴシック", Font.BOLD, 40));
		MessageLabel.setBounds(34, 137, 334, 57);
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
							kaisetuLabel.setText("<html>不正解です。正解は「差し上げる」である。<br>「ご存じ」は”お客様”を表す尊敬語であり、「存じる」は”私”を表す謙譲語であるため不適切</html>");  						
							MessageLabel.setText("× 不正解");
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「差し上げる」である。<br>「ご存じ」は”お客様”を表す尊敬語であり、「存じる」は”私”を表す謙譲語であるため不適切</html>");  	
							MessageLabel.setText("× 不正解");
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解です。<br>「ご存じ」は”お客様”を表す尊敬語であり、「存じる」は”私”を表す謙譲語であるため不適切</html>"); 
							MessageLabel.setText("〇 正解");
							MessageLabel.setForeground(Color.RED);
							count+=1;
							
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「差し上げる」である。<br>「ご存じ」は”お客様”を表す尊敬語であり、「存じる」は”私”を表す謙譲語であるため不適切</html>");  	
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
				AnswerButton.setActionCommand("OK");
				buttonPane.add(AnswerButton);
				getRootPane().setDefaultButton(AnswerButton);
			}
			{
				NextButton = new JButton("次へ");
				NextButton.setEnabled(false);
				NextButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						n8.count=count;
						setVisible(false);
						n8.setVisible(true);
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}
