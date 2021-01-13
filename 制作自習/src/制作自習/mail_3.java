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

public class mail_3 extends JDialog {
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
	private BMS15 w5 = new BMS15();
	public int count=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			mail_3 dialog = new mail_3();
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
	public mail_3() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("ビジネスメールで添付ファイルなどを送る際、誤っているものは？ ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 14));
		lblNewLabel.setBounds(10, -5, 445, 50);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(0, 33, 436, 127);
		contentPanel.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		ARadioButton = new JRadioButton("添付ファイルだけを送る");
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("添付ファイルにパスワードを設定し、別でパスワードを連絡する");
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("大容量の添付ファイルは、圧縮して送る");
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		
		DRadioButton = new JRadioButton("大容量の添付ファイルは、ファイル転送サービスを利用して送る");
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
		kaisetuLabel.setBounds(21, 200, 386, 61);
		contentPanel.add(kaisetuLabel);
		
		MessageLabel = new JLabel("");
		MessageLabel.setFont(new Font("游ゴシック", Font.BOLD, 40));
		MessageLabel.setBounds(21, 161, 334, 61);
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
							kaisetuLabel.setText("<html>正解です。添付ファイルだけを送るのは相手に失礼です。一言付け加えるほうが良いです。</html>");
							MessageLabel.setText("〇 正解");
							MessageLabel.setForeground(Color.RED);
							count+=1;
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。添付ファイルにパスワードを設定し、別でパスワードを連絡することは良いですが、問題は誤っているものなのでここでは不正解です。</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。添付ファイルを圧縮して送ることで容量を小さくすることができ良いですが、問題は誤っているものなのでここでは不正解です。</html>");
							MessageLabel.setText("× 不正解");
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。ファイル転送サービスを利用して送ることは良いですが、問題は誤っているものなのでここでは不正解です。</html>");
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
						w5.count=count;
						setVisible(false);
						w5.setVisible(true);
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}
