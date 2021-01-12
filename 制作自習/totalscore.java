package 制作自習;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class totalscore extends JDialog {

	private final JPanel contentPanel = new JPanel();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			totalscore dialog = new totalscore();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public totalscore() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel DispLabel = new JLabel("10");
			DispLabel.setForeground(Color.RED);
			DispLabel.setHorizontalAlignment(SwingConstants.CENTER);
			DispLabel.setFont(new Font("Impact", Font.PLAIN, 99));
			DispLabel.setBounds(62, 28, 237, 168);
			contentPanel.add(DispLabel);
			DispLabel.setText("1");
		}
		
		JLabel DIspLabel2 = new JLabel("点");
		DIspLabel2.setForeground(Color.RED);
		DIspLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		DIspLabel2.setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
		DIspLabel2.setBounds(217, 119, 82, 77);
		contentPanel.add(DIspLabel2);
		{
			JLabel lblNewLabel = new JLabel("/ 10");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Impact", Font.PLAIN, 55));
			lblNewLabel.setBounds(273, 132, 121, 77);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("あなたの得点は");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 30));
			lblNewLabel_1.setBounds(10, 10, 213, 41);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton DispLabel = new JButton("メニュー画面に戻る");
				DispLabel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
	
					}
				});
				DispLabel.setActionCommand("OK");
				buttonPane.add(DispLabel);
				getRootPane().setDefaultButton(DispLabel);
			}
			{
				JButton cancelButton = new JButton("終了");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
