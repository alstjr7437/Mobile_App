import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class EmpCon extends JFrame {

	Login login = new Login();
	
	private JPanel contentPane;
	private JTextField NameField;
	private JTextField IdField;
	private JTextField AdressField;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpCon frame = new EmpCon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EmpCon () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(700,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("홈");
		btnHome.setBounds(608, 10, 52, 31);
		contentPane.add(btnHome);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 51, 660, 463);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("        \uC131     \uBA85");
		lblName.setBounds(124, 10, 140, 31);
		panel.add(lblName);
		
		JLabel lblId = new JLabel("   입사년도(년/월/일)");
		lblId.setBounds(124, 51, 140, 31);
		panel.add(lblId);
		
		JLabel lblAdress = new JLabel("      부서 및 부서 번호");
		lblAdress.setBounds(124, 92, 140, 31);
		panel.add(lblAdress);
		
		NameField = new JTextField();
		NameField.setToolTipText("");
		NameField.setBounds(260, 10, 379, 31);
		panel.add(NameField);
		NameField.setColumns(10);
		
		IdField = new JTextField();
		IdField.setColumns(10);
		IdField.setBounds(260, 51, 379, 31);
		panel.add(IdField);
		
		AdressField = new JTextField();
		AdressField.setColumns(10);
		AdressField.setBounds(260, 92, 379, 31);
		panel.add(AdressField);
		
		JLabel lblNewLabel = new JLabel("                                      경                     력");
		lblNewLabel.setBounds(22, 151, 395, 31);
		panel.add(lblNewLabel);
		
		JLabel lblRank = new JLabel("    직 원 등 급");
		lblRank.setBounds(556, 151, 97, 31);
		panel.add(lblRank);
		
		textField = new JTextField();
		textField.setBounds(556, 192, 93, 67);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(22, 192, 395, 31);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(22, 241, 395, 31);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(22, 287, 395, 31);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(22, 332, 395, 31);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(22, 373, 395, 31);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(22, 414, 395, 31);
		panel.add(textField_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 97, 113);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPitcure = new JLabel("       사 진");
		lblPitcure.setBounds(0, 0, 85, 103);
		panel_1.add(lblPitcure);
		
		JButton btnPrj1 = new JButton("프로젝트");
		btnPrj1.setBounds(441, 192, 97, 31);
		panel.add(btnPrj1);
		
		JButton btnPrj2 = new JButton("프로젝트");
		btnPrj2.setBounds(441, 241, 97, 31);
		panel.add(btnPrj2);
		
		JButton btnPrj3 = new JButton("프로젝트");
		btnPrj3.setBounds(441, 287, 97, 31);
		panel.add(btnPrj3);
		
		JButton btnPrj4 = new JButton("프로젝트");
		btnPrj4.setBounds(441, 332, 97, 31);
		panel.add(btnPrj4);
		
		JButton btnPrj5 = new JButton("프로젝트");
		btnPrj5.setBounds(441, 373, 97, 31);
		panel.add(btnPrj5);
		
		JButton btnPrj6 = new JButton("프로젝트");
		btnPrj6.setBounds(441, 414, 97, 31);
		panel.add(btnPrj6);
		
		
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
	}
}