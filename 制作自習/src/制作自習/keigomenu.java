package 制作自習;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dialog.ModalityType;


/**
 * 
 */

/**
 * @author 0H02020 難波聖
 *
 */
public class keigomenu extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private ImageIcon Img = new ImageIcon("data\\背景.png");
	public boolean okFlag;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			keigomenu dialog = new keigomenu();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public keigomenu() {
		random1 R=new random1();
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel DispLabel = new JLabel("ゲームモード");
		DispLabel.setFont(new Font("HG行書体", Font.PLAIN, 30));
		DispLabel.setForeground(Color.RED);
		DispLabel.setHorizontalAlignment(SwingConstants.CENTER);
		DispLabel.setBounds(109, 10, 215, 45);
		contentPanel.add(DispLabel);
		
		JButton Button1 = new JButton("文法編");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				R.RM1();
				setVisible(false);
			}
		});
		Button1.setBounds(156, 65, 127, 51);
		contentPanel.add(Button1);
		
		JButton Button2 = new JButton("実践編");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				R.RM2();
				setVisible(false);
			}
		});
		Button2.setBounds(156, 138, 127, 51);
		contentPanel.add(Button2);
		
		
					
		JButton CancelButton = new JButton("戻る");
		CancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				okFlag=true;
				setVisible(false);
			}
		});
		CancelButton.setBounds(136, 210, 68, 35);
		contentPanel.add(CancelButton);
			
		JButton EndButton = new JButton("終了");
		EndButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		EndButton.setBounds(230, 210, 68, 35);
		contentPanel.add(EndButton);
		
		JLabel PicLabel = new JLabel(Img);
		PicLabel.setBounds(0, 0, 436, 277);
		contentPanel.add(PicLabel);
		
		
		
		
	}
}
