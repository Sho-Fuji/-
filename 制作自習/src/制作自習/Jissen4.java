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

public class Jissen4 extends JDialog {
	private final JPanel contentPanel = new JPanel();
	private JButton AnswerButton;
	private JButton NextButton;
	private JLabel kaisetuLabel;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JRadioButton ARadioButton;
	private JRadioButton BRadioButton;
	private JRadioButton CRadioButton;
	private ButtonGroup bg;
	private JLabel MessageLabel;
	private keigomenu menu=new keigomenu();
	private BMS17 w7 = new BMS17();
	public int count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Jissen4 dialog = new Jissen4();
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
	public Jissen4() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		MessageLabel = new JLabel("");
		MessageLabel.setFont(new Font("游ゴシック", Font.BOLD, 36));
		MessageLabel.setBounds(15, 161, 405, 50);
		contentPanel.add(MessageLabel);
		
		lblNewLabel = new JLabel("次の敬語の使い方のうち、誤っているものはどれでしょうか？");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 12));
		lblNewLabel.setBounds(15, -5, 405, 50);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(21, 36, 212, 129);
		contentPanel.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		ARadioButton = new JRadioButton("昼食をいただかれましたか。");
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("昼食を食べられましたか。");
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("昼食を召し上がりましたか。");
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		
		
		
		
		
		bg = new ButtonGroup();
		bg.add(ARadioButton);
		bg.add(BRadioButton);
		bg.add(CRadioButton);
		
		
		
		kaisetuLabel = new JLabel(" ");
		kaisetuLabel.setVerticalAlignment(SwingConstants.TOP);
		kaisetuLabel.setBounds(10, 196, 407, 77);
		contentPanel.add(kaisetuLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				AnswerButton = new JButton("解答");
				AnswerButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(ARadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解です。<br>尊敬語は敬意を表す相手の行動に対してつけられます。「食べる」＋尊敬語の「～される」、または「召し上がる」は尊敬語です。「いただく」は謙譲語です</html>");
							MessageLabel.setText("〇 正解 ");
							MessageLabel.setForeground(Color.RED);
							count+=1;
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。尊敬語は敬意を表す相手の行動に対してつけられます。「食べる」＋尊敬語の「～される」、または「召し上がる」は尊敬語です。「いただく」は謙譲語です</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。尊敬語は敬意を表す相手の行動に対してつけられます。「食べる」＋尊敬語の「～される」、または「召し上がる」は尊敬語です。「いただく」は謙譲語です</html>");
							MessageLabel.setText("× 不正解");
						}
						
						
						ARadioButton.setEnabled(false);
						BRadioButton.setEnabled(false);
						CRadioButton.setEnabled(false);
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
						w7.count=count;
						setVisible(false);
						w7.setVisible(true);
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}
