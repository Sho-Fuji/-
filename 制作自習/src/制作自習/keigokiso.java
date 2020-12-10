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

public class keigokiso extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton backButton;
	private JButton NextButton;
	private JLabel kaisetuLabel;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JRadioButton ARadioButton;
	private JRadioButton BRadioButton;
	private JRadioButton CRadioButton;
	private JRadioButton DRadioButton;
	private ButtonGroup bg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			keigokiso dialog = new keigokiso();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public keigokiso() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Q1. 「言う」の丁寧語は？");
		lblNewLabel.setBounds(34, 10, 227, 50);
		contentPanel.add(lblNewLabel);
		
		panel = new JPanel();
		panel.setBounds(34, 70, 334, 57);
		contentPanel.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		ARadioButton = new JRadioButton("おしゃっる");
		ARadioButton.setSelected(true);
		panel.add(ARadioButton);
		
		BRadioButton = new JRadioButton("申す");
		panel.add(BRadioButton);
		
		CRadioButton = new JRadioButton("言います");
		panel.add(CRadioButton);
		
		DRadioButton = new JRadioButton("申し上げる");
		panel.add(DRadioButton);
		
		bg = new ButtonGroup();
		bg.add(ARadioButton);
		bg.add(BRadioButton);
		bg.add(CRadioButton);
		bg.add(DRadioButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(324, 144, -225, 66);
		contentPanel.add(lblNewLabel_1);
		
		kaisetuLabel = new JLabel(" ");
		kaisetuLabel.setBounds(34, 148, 334, 74);
		contentPanel.add(kaisetuLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				backButton = new JButton("戻る");
				backButton.setActionCommand("OK");
				buttonPane.add(backButton);
				getRootPane().setDefaultButton(backButton);
			}
			{
				NextButton = new JButton("回答");
				NextButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(ARadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「言います」<br>「おっしゃる」は尊敬語であり、「申す、申し上げる」は謙譲語である。</html>");
						}
						else if(BRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「言います」<br>「おっしゃる」は尊敬語であり、「申す、申し上げる」は謙譲語である。</html>");
						}
						else if(CRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>正解です。<br>「おっしゃる」は尊敬語であり、「申す、申し上げる」は謙譲語である。</html>");
						}
						else if(DRadioButton.isSelected()) {
							kaisetuLabel.setText("<html>不正解です。正解は「言います」<br>「おっしゃる」は尊敬語であり、「申す、申し上げる」は謙譲語である。</html>");
						}
					}
				});
				NextButton.setActionCommand("Cancel");
				buttonPane.add(NextButton);
			}
		}
	}
}
