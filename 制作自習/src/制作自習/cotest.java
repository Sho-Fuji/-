/**
 * 
 */
package 制作自習;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * @author 0H02020 難波聖
 *
 */
public class cotest extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JLabel aaa;
	public keigomenu menu=new keigomenu();
	public int count=0;
	private JButton cancelButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			cotest dialog = new cotest();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public cotest() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			aaa= new JLabel("");
			aaa.setFont(new Font("MS UI Gothic", Font.PLAIN, 43));
			aaa.setBounds(126, 124, 210, 98);
			contentPanel.add(aaa);
		}
		
		JLabel lblNewLabel = new JLabel("あなたの敬語理解度は");
		lblNewLabel.setFont(new Font("MS UI Gothic", Font.PLAIN, 24));
		lblNewLabel.setBounds(58, 26, 255, 46);
		contentPanel.add(lblNewLabel);
		{
			JLabel lblNewLabel_1 = new JLabel("10点中");
			lblNewLabel_1.setFont(new Font("MS UI Gothic", Font.PLAIN, 24));
			lblNewLabel_1.setBounds(68, 82, 137, 46);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("表示");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String A=String.valueOf(count);
						aaa.setText(A+"点です");
						aaa.setForeground(Color.RED);
						cancelButton.setEnabled(true);
						okButton.setEnabled(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("メニューへ");
				cancelButton.setEnabled(false);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
						menu.setVisible(true);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
