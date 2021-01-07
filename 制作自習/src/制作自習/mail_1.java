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

public class mail_1 extends JDialog {
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

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			mail_1 dialog = new mail_1();
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
	public mail_1() {
		setBounds(100, 100, 449, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		MessageLabel = new JLabel("");
		MessageLabel.setFont(new Font("游ゴシック", Font.BOLD, 40));
		MessageLabel.setBounds(21, 149, 404, 61);
		contentPanel.add(MessageLabel);
		
		lblNewLabel = new JLabel("メールを使っても良いのはどれか");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		lblNewLabel.setBounds(21, -5, 306, 50);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(12, 32, 351, 127);
		contentPanel.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
		
		bg = new ButtonGroup();
		
		ARadioButton = new JRadioButton("複雑な用件をメールで送る");
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		bg.add(ARadioButton);
		
		BRadioButton = new JRadioButton("社内で大人数に同じ情報を送る");
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		bg.add(BRadioButton);
		
		CRadioButton = new JRadioButton("メールをあまり使わない人にメールで連絡する");
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		bg.add(CRadioButton);
		
		DRadioButton = new JRadioButton("クレーム対応");
		DRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(DRadioButton);
		bg.add(DRadioButton);
		
		kaisetuLabel = new JLabel(" ");
		kaisetuLabel.setHorizontalAlignment(SwingConstants.CENTER);
		kaisetuLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 11));
		kaisetuLabel.setVerticalAlignment(SwingConstants.TOP);
		kaisetuLabel.setBounds(0, 192, 435, 74);
		contentPanel.add(kaisetuLabel);
		
		JButton BackButton = new JButton("戻る");
		BackButton.setBounds(373, 13, 60, 21);
		contentPanel.add(BackButton);
		BackButton.setActionCommand("Cancel");
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				AnswerButton = new JButton("解答");
				AnswerButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(ARadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は社内で大人数に同じ情報を送るが正しいです。<br>メールでの複雑な内容は相手に伝わりにくく、電話など工夫をする必要がある。</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解です。社内で大人数に同じ情報を送るが正しいです。<br>社内で大人数に情報共有をする場合はメールでの一斉送信をしても良いです。</html>");
							MessageLabel.setText("〇 正解");
							MessageLabel.setForeground(Color.RED);
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は社内で大人数に同じ情報を送るが正しいです。<br>メールをあまり使用しない人はメールが届いていることに気づかない可能性があるのでメールより電話の方が良い。</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は社内で大人数に同じ情報を送るが正しいです。<br>苦情や改善要求をしてくる相手にメールでの対応は絶対にしてはいけない。</html>");
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
						
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}
