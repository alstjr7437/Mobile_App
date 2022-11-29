import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class ProjectNew extends JFrame {

	Login login = new Login();
	
	private JPanel contentPane;
	private JTextField tFName;
	private JTextField tfEf;
	private JLabel lbCon;
	private JTextField tFCon;
	private JLabel lbDno;
	private JTextField tFDno;
	private JLabel lbDate;
	private JTextField tFDate;
	private JLabel lbTeam;
	private JTextField tFTeam;
	private JLabel lbHu;
	private JTextField tFHu_1;
	private JTextField tFHu_2;
	private JTextField tFHu_3;
	private JTextField tFHu_4;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectNew frame = new ProjectNew();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ProjectNew() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("È¨");
		btnHome.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnHome.setBounds(785, 10, 66, 47);
		contentPane.add(btnHome);
		
		JLabel lbName = new JLabel("ÇÁ·ÎÁ§Æ® ¸í");
		lbName.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lbName.setBounds(12, 10, 191, 69);
		contentPane.add(lbName);
		
		tFName = new JTextField();
		tFName.setBounds(10, 63, 362, 56);
		contentPane.add(tFName);
		tFName.setColumns(10);

		lbDate = new JLabel("³¯Â¥");
		lbDate.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		lbDate.setBounds(456, 23, 98, 47);
		contentPane.add(lbDate);
		
		tFDate = new JTextField();
		tFDate.setColumns(10);
		tFDate.setBounds(456, 65, 228, 32);
		contentPane.add(tFDate);
		
		JLabel lbEf = new JLabel("±â´ëÈ¿°ú");
		lbEf.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lbEf.setBounds(10, 129, 167, 47);
		contentPane.add(lbEf);
		
		tfEf = new JTextField();
		tfEf.setBounds(10, 177, 841, 134);
		contentPane.add(tfEf);
		tfEf.setColumns(10);
		
		lbCon = new JLabel("¼¼ºÎ³»¿ë");
		lbCon.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lbCon.setBounds(10, 321, 167, 47);
		contentPane.add(lbCon);
		
		tFCon = new JTextField();
		tFCon.setColumns(10);
		tFCon.setBounds(10, 369, 841, 206);
		contentPane.add(tFCon);
		
		lbDno = new JLabel("ºÎ¼­");
		lbDno.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lbDno.setBounds(60, 585, 73, 47);
		contentPane.add(lbDno);
		
		tFDno = new JTextField();
		tFDno.setColumns(10);
		tFDno.setBounds(138, 593, 123, 31);
		contentPane.add(tFDno);
		
		lbTeam = new JLabel(" ÆÀ");
		lbTeam.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lbTeam.setBounds(60, 675, 73, 47);
		contentPane.add(lbTeam);
		
		tFTeam = new JTextField();
		tFTeam.setColumns(10);
		tFTeam.setBounds(138, 683, 123, 31);
		contentPane.add(tFTeam);
		
		lbHu = new JLabel("ÆÀ¿ø");
		lbHu.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		lbHu.setBounds(344, 585, 73, 47);
		contentPane.add(lbHu);
		
		tFHu_1 = new JTextField();
		tFHu_1.setColumns(10);
		tFHu_1.setBounds(422, 593, 123, 31);
		contentPane.add(tFHu_1);
		
		tFHu_2 = new JTextField();
		tFHu_2.setColumns(10);
		tFHu_2.setBounds(422, 631, 123, 31);
		contentPane.add(tFHu_2);
		
		tFHu_3 = new JTextField();
		tFHu_3.setColumns(10);
		tFHu_3.setBounds(422, 675, 123, 31);
		contentPane.add(tFHu_3);
		
		tFHu_4 = new JTextField();
		tFHu_4.setColumns(10);
		tFHu_4.setBounds(422, 716, 123, 31);
		contentPane.add(tFHu_4);
		
		JButton btnSave = new JButton("ÀúÀå");
		btnSave.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		btnSave.setBounds(687, 631, 134, 88);
		contentPane.add(btnSave);
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}
