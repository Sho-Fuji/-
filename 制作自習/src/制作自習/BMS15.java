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

public class BMS15 extends JDialog {

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
	private Jissen4 w6 = new Jissen4();
	public int count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			BMS15 dialog = new BMS15();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public BMS15() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("<html>手紙において会社の繁栄を祝う挨拶として間違っているものはどれ</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 15));
		lblNewLabel.setBounds(34, 10, 319, 57);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(34, 70, 334, 57);
		contentPanel.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		ARadioButton = new JRadioButton("ご隆盛");
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("ご発展");
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("ご清栄");
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		
		DRadioButton = new JRadioButton("ご清祥");
		DRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(DRadioButton);
		
		bg = new ButtonGroup();
		bg.add(ARadioButton);
		bg.add(BRadioButton);
		bg.add(CRadioButton);
		bg.add(DRadioButton);
		
		kaisetuLabel = new JLabel(" ");
		kaisetuLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 15));
		kaisetuLabel.setVerticalAlignment(SwingConstants.TOP);
		kaisetuLabel.setBounds(34, 180, 334, 80);
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
							kaisetuLabel.setText("<html>正解は「ご清祥」<br>「ご清祥」は相手の健康を祝う挨拶であり、他には「ご健勝」などがある</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解は「ご清祥」<br>「ご清祥」は相手の健康を祝う挨拶であり、他には「ご健勝」などがある</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解は「ご清祥」<br>「ご清祥」は相手の健康を祝う挨拶であり、他には「ご健勝」などがある</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>「ご清祥」は相手の健康を祝う挨拶であり、他には「ご健勝」などがある</html>");
							MessageLabel.setText("〇 正解");
							MessageLabel.setForeground(Color.RED);
							count+=1;
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
						w6.count=count;
						setVisible(false);
						w6.setVisible(true);
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}