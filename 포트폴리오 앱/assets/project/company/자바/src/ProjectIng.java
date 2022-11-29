import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;

public class ProjectIng extends JFrame {

	private JPanel contentPane;
	
	Login login = new Login();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectIng frame = new ProjectIng();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ProjectIng() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel labelDno_1 = new JLabel("ÁøÇàÁß ÇÁ·ÎÁ§Æ®");
		labelDno_1.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		labelDno_1.setBounds(25, 20, 382, 64);
		contentPane.add(labelDno_1);
		
		JButton btnSelect = new JButton("¼±ÅÃ");
		btnSelect.setBounds(642, 10, 68, 31);
		contentPane.add(btnSelect);
		
		JButton btnHome = new JButton("È¨");
		btnHome.setBounds(722, 10, 52, 31);
		contentPane.add(btnHome);
		
		JLabel labelDno = new JLabel("ÀÎ»çºÎ(3ÆÀ) :");
		labelDno.setBounds(12, 104, 219, 53);
		contentPane.add(labelDno);
		labelDno.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		
		JButton btnCon = new JButton("2022³âµµ »ç¿ø °èÈ¹");
		btnCon.setBounds(233, 109, 332, 51);
		contentPane.add(btnCon);
		btnCon.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		
		
		JLabel labelpercent = new JLabel(" 70% ");
		labelpercent.setBounds(570, 110, 107, 47);
		contentPane.add(labelpercent);
		labelpercent.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		
		JButton btnFinish = new JButton("¿Ï·á");
		btnFinish.setBounds(679, 110, 66, 50);
		contentPane.add(btnFinish);
		btnFinish.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		
		JLabel labelDno_2 = new JLabel("±âÈ¹ºÎ(1ÆÀ) :");
		labelDno_2.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		labelDno_2.setBounds(12, 184, 219, 53);
		contentPane.add(labelDno_2);
		
		JButton btnCon1 = new JButton("ºÎ»ê½Ã ÄÝ¶óº¸ Æ÷½ºÅÍ Á¦ÀÛ");
		btnCon1.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnCon1.setBounds(233, 189, 332, 51);
		contentPane.add(btnCon1);
		
		JLabel labelpercent_1 = new JLabel(" 40% ");
		labelpercent_1.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		labelpercent_1.setBounds(570, 190, 107, 47);
		contentPane.add(labelpercent_1);
		
		JButton btnFinish_1 = new JButton("¿Ï·á");
		btnFinish_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnFinish_1.setBounds(679, 190, 66, 50);
		contentPane.add(btnFinish_1);
		
		JLabel labelDno_2_1 = new JLabel("ÀçÁ¤ºÎ(1ÆÀ) :");
		labelDno_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		labelDno_2_1.setBounds(12, 269, 219, 53);
		contentPane.add(labelDno_2_1);
		
		JButton btnCon2 = new JButton("2021³âµµ ¿¬¸» ¼º°ú±Ý");
		btnCon2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnCon2.setBounds(233, 274, 332, 51);
		contentPane.add(btnCon2);
		
		JLabel labelpercent_1_1 = new JLabel(" 70% ");
		labelpercent_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		labelpercent_1_1.setBounds(570, 275, 107, 47);
		contentPane.add(labelpercent_1_1);
		
		JButton btnFinish_1_1 = new JButton("¿Ï·á");
		btnFinish_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnFinish_1_1.setBounds(679, 275, 66, 50);
		contentPane.add(btnFinish_1_1);
		
		JLabel labelDno_2_2 = new JLabel("ÀçÁ¤ºÎ(3ÆÀ) :");
		labelDno_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		labelDno_2_2.setBounds(12, 350, 219, 53);
		contentPane.add(labelDno_2_2);
		
		JButton btnCon3 = new JButton("2022³âµµ ¿¬ºÀ ÇùÀÇ");
		btnCon3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnCon3.setBounds(233, 355, 332, 51);
		contentPane.add(btnCon3);
		
		JLabel labelpercent_1_2 = new JLabel(" 30% ");
		labelpercent_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		labelpercent_1_2.setBounds(570, 356, 107, 47);
		contentPane.add(labelpercent_1_2);
		
		JButton btnFinish_1_2 = new JButton("¿Ï·á");
		btnFinish_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnFinish_1_2.setBounds(679, 356, 66, 50);
		contentPane.add(btnFinish_1_2);
		
		JLabel labelDno_2_3 = new JLabel("±âÈ¹ºÎ(2ÆÀ) :");
		labelDno_2_3.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		labelDno_2_3.setBounds(12, 434, 219, 53);
		contentPane.add(labelDno_2_3);
		
		JButton btnCon4 = new JButton("2022³âµµ È¸»ç ÀÏÁ¤");
		btnCon4.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		btnCon4.setBounds(233, 439, 332, 51);
		contentPane.add(btnCon4);
		
		JLabel labelpercent_1_3 = new JLabel(" 50% ");
		labelpercent_1_3.setFont(new Font("±¼¸²", Font.PLAIN, 40));
		labelpercent_1_3.setBounds(570, 440, 107, 47);
		contentPane.add(labelpercent_1_3);
		
		JButton btnFinish_1_3 = new JButton("¿Ï·á");
		btnFinish_1_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		btnFinish_1_3.setBounds(679, 440, 66, 50);
		contentPane.add(btnFinish_1_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 82, 762, 433);
		contentPane.add(scrollPane);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(757, 82, 17, 433);
		contentPane.add(scrollBar);
		
		btnCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectCon().setVisible(true);
			}
		});
		
		btnCon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectCon().setVisible(true);
			}
		});
		
		btnCon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectCon().setVisible(true);
			}
		});
		
		btnCon3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectCon().setVisible(true);
			}
		});
		
		btnCon4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectCon().setVisible(true);
			}
		});

		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(login.emp == 0) {
					new Mainp().setVisible(true);
				} else {
					new Maine().setVisible(true);
				}
				setVisible(false);
			}
		});
		
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectSelect().setVisible(true);
				setVisible(false);
			}
		});
		

	}
}
