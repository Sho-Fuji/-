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

public class yougo6 extends JDialog {

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
	public int count = 0;
	private yougo16 y7 = new yougo16();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			yougo6 dialog = new yougo6();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public yougo6() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("社会的責任は？");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("BIZ UDPゴシック", Font.BOLD, 20));
		lblNewLabel.setBounds(34, 10, 319, 50);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(34, 70, 334, 57);
		contentPanel.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		ARadioButton = new JRadioButton("CSR");
		ARadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("CEO");
		BRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("CIO");
		CRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(CRadioButton);
		
		DRadioButton = new JRadioButton("COO");
		DRadioButton.setFont(new Font("UD デジタル 教科書体 N-B", Font.PLAIN, 14));
		panel.add(DRadioButton);
		
		bg = new ButtonGroup();
		bg.add(ARadioButton);
		bg.add(BRadioButton);
		bg.add(CRadioButton);
		bg.add(DRadioButton);
		
		kaisetuLabel = new JLabel(" ");
		kaisetuLabel.setVerticalAlignment(SwingConstants.TOP);
		kaisetuLabel.setBounds(34, 137, 334, 123);
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
							kaisetuLabel.setText("<html>正解です。<br>CSR = Corporate Social Responsibility = 社会的責任<br>CEO = Chief Executive Officer = 最高経営責任者<br>CIO = Chief Information Officer = 最高情報責任者<br>COO = Chief Operations Officer = 最高執行責任者</html>");
							count++;
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「CSR」<br>CSR = Corporate Social Responsibility = 社会的責任<br>CEO = Chief Executive Officer = 最高経営責任者<br>CIO = Chief Information Officer = 最高情報責任者<br>COO = Chief Operations Officer = 最高執行責任者</html>");
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「CSR」<br>CSR = Corporate Social Responsibility = 社会的責任<br>CEO = Chief Executive Officer = 最高経営責任者<br>CIO = Chief Information Officer = 最高情報責任者<br>COO = Chief Operations Officer = 最高執行責任者</html>");
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「CSR」<br>CSR = Corporate Social Responsibility = 社会的責任<br>CEO = Chief Executive Officer = 最高経営責任者<br>CIO = Chief Information Officer = 最高情報責任者<br>COO = Chief Operations Officer = 最高執行責任者</html>");
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
						y7.count = count;
						setVisible(false);
						y7.setVisible(true);
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}