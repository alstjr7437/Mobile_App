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

public class EmpCon2 extends JFrame {

	Login login = new Login();

	private JPanel contentPane;
	private JTextField NameField;
	private JTextField IdField;
	private JTextField AdressField;
	private JTextField txtA;
	private JTextField textField_1;
	private JTextField txtPc;
	private JTextField txtPc_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpCon2 frame = new EmpCon2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EmpCon2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(700,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("홈");
		btnHome.setBounds(606, 10, 52, 31);
		contentPane.add(btnHome);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 51, 646, 463);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("             성 명");
		lblName.setBounds(124, 10, 140, 31);
		panel.add(lblName);
		
		JLabel lblId = new JLabel("   입사년도(년/월/일)");
		lblId.setBounds(124, 51, 140, 31);
		panel.add(lblId);
		
		JLabel lblAdress = new JLabel("      부서 및 부서 번호");
		lblAdress.setBounds(124, 92, 140, 31);
		panel.add(lblAdress);
		
		NameField = new JTextField();
		NameField.setText("강지원");
		NameField.setToolTipText("");
		NameField.setBounds(260, 10, 246, 31);
		panel.add(NameField);
		NameField.setColumns(10);
		
		IdField = new JTextField();
		IdField.setText("2002/01/24");
		IdField.setColumns(10);
		IdField.setBounds(260, 51, 246, 31);
		panel.add(IdField);
		
		AdressField = new JTextField();
		AdressField.setText("재정부 / 329-3101");
		AdressField.setColumns(10);
		AdressField.setBounds(260, 92, 246, 31);
		panel.add(AdressField);
		
		JLabel lblNewLabel = new JLabel("             \uACBD          \uB825");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(22, 151, 350, 31);
		panel.add(lblNewLabel);
		
		JLabel lblRank = new JLabel("    \uC9C1 \uC6D0 \uD3C9 \uAC00");
		lblRank.setBounds(527, 10, 97, 31);
		panel.add(lblRank);
		
		txtA = new JTextField();
		txtA.setFont(new Font("굴림", Font.PLAIN, 30));
		txtA.setText("   A");
		txtA.setBounds(533, 56, 91, 67);
		panel.add(txtA);
		txtA.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("재정 프로젝트 (2009/01/01 ~ 2009/02/01)");
		textField_1.setBounds(22, 192, 442, 31);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		txtPc = new JTextField();
		txtPc.setText("2015년 자회사 PC 업그레이드(2015/02/01 ~ 2015/03/31)");
		txtPc.setColumns(10);
		txtPc.setBounds(22, 241, 442, 31);
		panel.add(txtPc);
		
		txtPc_1 = new JTextField();
		txtPc_1.setText("2018년 자회사 PC 업그레이드(2018/12/10 ~ 2018/12/31)");
		txtPc_1.setColumns(10);
		txtPc_1.setBounds(22, 287, 442, 31);
		panel.add(txtPc_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(22, 332, 442, 31);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(22, 373, 442, 31);
		panel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(22, 414, 442, 31);
		panel.add(textField_6);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 97, 113);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPitcure = new JLabel("       사 진");
		lblPitcure.setBounds(0, 0, 85, 103);
		panel_1.add(lblPitcure);
		
		JButton btnPrj1 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnPrj1.setBounds(495, 192, 97, 31);
		panel.add(btnPrj1);
		
		JButton btnPrj2 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj2.setFont(new Font("굴림", Font.PLAIN, 15));
		btnPrj2.setBounds(495, 241, 97, 31);
		panel.add(btnPrj2);
		
		JButton btnPrj3 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj3.setFont(new Font("굴림", Font.PLAIN, 15));
		btnPrj3.setBounds(495, 287, 97, 31);
		panel.add(btnPrj3);
		
		JButton btnPrj4 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj4.setFont(new Font("굴림", Font.PLAIN, 15));
		btnPrj4.setBounds(495, 332, 97, 31);
		panel.add(btnPrj4);
		
		JButton btnPrj5 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj5.setFont(new Font("굴림", Font.PLAIN, 15));
		btnPrj5.setBounds(495, 373, 97, 31);
		panel.add(btnPrj5);
		
		JButton btnPrj6 = new JButton("\uC138\uBD80\uB0B4\uC6A9");
		btnPrj6.setFont(new Font("굴림", Font.PLAIN, 15));
		btnPrj6.setBounds(495, 414, 97, 31);
		panel.add(btnPrj6);
		
		JButton btnInf = new JButton("\uAC1C\uC778\uC815\uBCF4");
		btnInf.setFont(new Font("굴림", Font.PLAIN, 15));
		btnInf.setBounds(529, 133, 95, 30);
		panel.add(btnInf);
		
		btnInf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new EmpInf2().setVisible(true);
			}
		});
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}
