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

public class yougo14 extends JDialog {

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
	private keigomenu menu=new keigomenu();
	private yougo18 y2 = new yougo18();
	public int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			yougo14 dialog = new yougo14();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public yougo14() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("<html>PPM分析(Product Portfolio Management)の中で<br>市場成長率が低く、市場占有率が低いのは？</html>");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 10));
		lblNewLabel.setBounds(34, 10, 319, 62);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(34, 70, 334, 57);
		contentPanel.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		ARadioButton = new JRadioButton("花形");
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("金の生る木");
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("問題児");
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		
		DRadioButton = new JRadioButton("負け犬");
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
		kaisetuLabel.setBounds(34, 137, 381, 123);
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
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				AnswerButton = new JButton("解答");
				AnswerButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(ARadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「負け犬」<br>花形＝投資が必要だが収益が安定している製品、投資を継続するべき。<br>金の生る木＝少ない投資で収益を生み出す製品、過度な投資は抑制するべき。<br>問題児＝投資で将来成長が見込める製品、投資で花形に育成するべき。<br>負け犬＝将来性が低く収益も少ない、撤退を検討するべき。</html>");
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「負け犬」<br>花形＝投資が必要だが収益が安定している製品、投資を継続するべき。<br>金の生る木＝少ない投資で収益を生み出す製品、過度な投資は抑制するべき。<br>問題児＝投資で将来成長が見込める製品、投資で花形に育成するべき。<br>負け犬＝将来性が低く収益も少ない、撤退を検討するべき。</html>");
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「負け犬」<br>花形＝投資が必要だが収益が安定している製品、投資を継続するべき。<br>金の生る木＝少ない投資で収益を生み出す製品、過度な投資は抑制するべき。<br>問題児＝投資で将来成長が見込める製品、投資で花形に育成するべき。<br>負け犬＝将来性が低く収益も少ない、撤退を検討するべき。</html>");
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解です。<br>花形＝投資が必要だが収益が安定している製品、投資を継続するべき。<br>金の生る木＝少ない投資で収益を生み出す製品、過度な投資は抑制するべき。<br>問題児＝投資で将来成長が見込める製品、投資で花形に育成するべき。<br>負け犬＝将来性が低く収益も少ない、撤退を検討するべき。</html>");
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
						y2.count=count;
						y2.setVisible(true);
						setVisible(false);
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}	