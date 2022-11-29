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

public class EmpInf2 extends JFrame {

	private JPanel contentPane;
	private JTextField NameField;
	private JTextField IdField;
	private JTextField PhField;
	private JTextField EmailField;
	private JTextField AdressField;
	private JTextField DuringField1;
	private JTextField SchoolField1;
	private JTextField MajorField1;
	private JTextField DuringField2;
	private JTextField SchoolField2;
	private JTextField MajorField2;
	private JTextField DuringField3;
	private JTextField SchoolField3;
	private JTextField MajorField3;
	private JTextField DuringField4;
	private JTextField SchoolField4;
	private JTextField MajorField4;
	private JLabel lblGyungryuck;
	private JLabel lblDays;
	private JLabel lblCompany;
	private JLabel lblDno;
	private JLabel lblSpot;
	private JTextField DaysField1;
	private JTextField CompanyField1;
	private JTextField DnoField1;
	private JTextField SpotField1;
	private JTextField DaysField2;
	private JTextField CompanyField2;
	private JTextField DnoField2;
	private JTextField SpotField2;
	private JLabel lblLanguages;
	private JLabel lblLang;
	private JLabel lblToeic;
	private JLabel lblToefl;
	private JTextField ToeflField;
	private JTextField ToeicField;
	private JLabel lblJapanese;
	private JLabel lblChinaese;
	private JTextField ChinaeseField;
	private JTextField JapaneseField;
	private JLabel lblCert;
	private JLabel lblCertDay;
	private JLabel lblCertName;
	private JLabel lblCertAgency;
	private JTextField CertAgencyField1;
	private JTextField CertName1;
	private JTextField CertDayField1;
	private JTextField CertAgencyField2;
	private JTextField CertName2;
	private JTextField CertDayField2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmpInf2 frame = new EmpInf2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public EmpInf2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("홈");
		btnHome.setBounds(720, 10, 52, 31);
		contentPane.add(btnHome);
		
		JPanel panel = new JPanel();
		panel.setBounds(30, 62, 720, 670);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblInjuck = new JLabel("                                                                                       인 적 사 항");
		lblInjuck.setBackground(SystemColor.activeCaption);
		lblInjuck.setToolTipText("");
		lblInjuck.setFont(new Font("굴림", Font.BOLD, 12));
		lblInjuck.setBounds(0, 0, 720, 20);
		panel.add(lblInjuck);
		
		JLabel lblName = new JLabel("      성 명");
		lblName.setBounds(0, 31, 90, 20);
		panel.add(lblName);
		
		JLabel lblId = new JLabel("      주 민 등 록 번 호");
		lblId.setBounds(0, 61, 127, 20);
		panel.add(lblId);
		
		JLabel lblPh = new JLabel("      전 화 번 호");
		lblPh.setBounds(0, 91, 90, 20);
		panel.add(lblPh);
		
		JLabel lblEmail = new JLabel("      E-mail");
		lblEmail.setBounds(0, 121, 90, 20);
		panel.add(lblEmail);
		
		JLabel lblAdress = new JLabel("      주 소");
		lblAdress.setBounds(0, 152, 90, 20);
		panel.add(lblAdress);
		
		NameField = new JTextField();
		NameField.setText("\uAC15 \uC9C0 \uC6D0");
		NameField.setBounds(122, 31, 586, 21);
		panel.add(NameField);
		NameField.setColumns(10);
		
		IdField = new JTextField();
		IdField.setText("770402-3549865");
		IdField.setColumns(10);
		IdField.setBounds(122, 61, 586, 21);
		panel.add(IdField);
		
		PhField = new JTextField();
		PhField.setText("329-3101");
		PhField.setColumns(10);
		PhField.setBounds(122, 91, 586, 21);
		panel.add(PhField);
		
		EmailField = new JTextField();
		EmailField.setText("jiwon22@dit.com");
		EmailField.setColumns(10);
		EmailField.setBounds(122, 121, 586, 21);
		panel.add(EmailField);
		
		AdressField = new JTextField();
		AdressField.setText("\uBD80\uC0B0 \uBD80\uC0B0\uC9C4\uAD6C \uBD80\uC8041\uB3D9");
		AdressField.setColumns(10);
		AdressField.setBounds(122, 152, 586, 21);
		panel.add(AdressField);
		
		JLabel lblHawkryuck = new JLabel("                                                                                       학 력 사 항");
		lblHawkryuck.setToolTipText("");
		lblHawkryuck.setFont(new Font("굴림", Font.BOLD, 12));
		lblHawkryuck.setBackground(SystemColor.inactiveCaption);
		lblHawkryuck.setBounds(0, 183, 720, 20);
		panel.add(lblHawkryuck);
		
		JLabel lblDuring = new JLabel("            기 간(년, 월)");
		lblDuring.setBounds(10, 213, 150, 20);
		panel.add(lblDuring);
		
		JLabel lblSchool = new JLabel("                           학 교 명(학 위)");
		lblSchool.setBounds(159, 213, 330, 20);
		panel.add(lblSchool);
		
		JLabel lblMajor = new JLabel("                   전 공(학 과)");
		lblMajor.setBounds(489, 213, 219, 20);
		panel.add(lblMajor);
		
		DuringField1 = new JTextField();
		DuringField1.setText("2000\uB144");
		DuringField1.setBounds(12, 234, 148, 21);
		panel.add(DuringField1);
		DuringField1.setColumns(10);
		
		SchoolField1 = new JTextField();
		SchoolField1.setText("\uB3D9\uCC9C\uACE0\uB4F1\uD559\uAD50");
		SchoolField1.setColumns(10);
		SchoolField1.setBounds(159, 234, 330, 21);
		panel.add(SchoolField1);
		
		MajorField1 = new JTextField();
		MajorField1.setText("\uC790\uC5F0\uACC4");
		MajorField1.setColumns(10);
		MajorField1.setBounds(489, 234, 219, 21);
		panel.add(MajorField1);
		
		DuringField2 = new JTextField();
		DuringField2.setText("2005\uB144 2\uC6D4 18\uC77C");
		DuringField2.setColumns(10);
		DuringField2.setBounds(12, 265, 148, 21);
		panel.add(DuringField2);
		
		SchoolField2 = new JTextField();
		SchoolField2.setText("\uC11C\uC6B8\uB300\uD559\uAD50");
		SchoolField2.setColumns(10);
		SchoolField2.setBounds(159, 265, 330, 21);
		panel.add(SchoolField2);
		
		MajorField2 = new JTextField();
		MajorField2.setText("\uC2DC\uAC01\uB514\uC790\uC778\uD559\uACFC");
		MajorField2.setColumns(10);
		MajorField2.setBounds(489, 265, 219, 21);
		panel.add(MajorField2);
		
		DuringField3 = new JTextField();
		DuringField3.setColumns(10);
		DuringField3.setBounds(12, 301, 148, 21);
		panel.add(DuringField3);
		
		SchoolField3 = new JTextField();
		SchoolField3.setColumns(10);
		SchoolField3.setBounds(159, 301, 330, 21);
		panel.add(SchoolField3);
		
		MajorField3 = new JTextField();
		MajorField3.setColumns(10);
		MajorField3.setBounds(489, 301, 219, 21);
		panel.add(MajorField3);
		
		DuringField4 = new JTextField();
		DuringField4.setColumns(10);
		DuringField4.setBounds(12, 332, 148, 21);
		panel.add(DuringField4);
		
		SchoolField4 = new JTextField();
		SchoolField4.setColumns(10);
		SchoolField4.setBounds(159, 332, 330, 21);
		panel.add(SchoolField4);
		
		MajorField4 = new JTextField();
		MajorField4.setColumns(10);
		MajorField4.setBounds(489, 332, 219, 21);
		panel.add(MajorField4);
		
		lblGyungryuck = new JLabel("                                                                                       경 력 사 항");
		lblGyungryuck.setToolTipText("");
		lblGyungryuck.setFont(new Font("굴림", Font.BOLD, 12));
		lblGyungryuck.setBackground(SystemColor.inactiveCaption);
		lblGyungryuck.setBounds(0, 374, 720, 20);
		panel.add(lblGyungryuck);
		
		lblDays = new JLabel("            기 간(년, 월)");
		lblDays.setBounds(10, 396, 150, 20);
		panel.add(lblDays);
		
		lblCompany = new JLabel("                           회 사 명");
		lblCompany.setBounds(159, 396, 230, 20);
		panel.add(lblCompany);
		
		lblDno = new JLabel("              부 서");
		lblDno.setBounds(391, 396, 150, 20);
		panel.add(lblDno);
		
		lblSpot = new JLabel("               직 위");
		lblSpot.setBounds(542, 396, 150, 20);
		panel.add(lblSpot);
		
		DaysField1 = new JTextField();
		DaysField1.setColumns(10);
		DaysField1.setBounds(12, 421, 148, 21);
		panel.add(DaysField1);
		
		CompanyField1 = new JTextField();
		CompanyField1.setColumns(10);
		CompanyField1.setBounds(159, 421, 234, 21);
		panel.add(CompanyField1);
		
		DnoField1 = new JTextField();
		DnoField1.setColumns(10);
		DnoField1.setBounds(391, 421, 150, 21);
		panel.add(DnoField1);
		
		SpotField1 = new JTextField();
		SpotField1.setColumns(10);
		SpotField1.setBounds(540, 421, 168, 21);
		panel.add(SpotField1);
		
		DaysField2 = new JTextField();
		DaysField2.setColumns(10);
		DaysField2.setBounds(12, 455, 148, 21);
		panel.add(DaysField2);
		
		CompanyField2 = new JTextField();
		CompanyField2.setColumns(10);
		CompanyField2.setBounds(159, 455, 234, 21);
		panel.add(CompanyField2);
		
		DnoField2 = new JTextField();
		DnoField2.setColumns(10);
		DnoField2.setBounds(391, 455, 150, 21);
		panel.add(DnoField2);
		
		SpotField2 = new JTextField();
		SpotField2.setColumns(10);
		SpotField2.setBounds(540, 455, 168, 21);
		panel.add(SpotField2);
		
		lblLanguages = new JLabel("                                                                                     어 학 능 력");
		lblLanguages.setToolTipText("");
		lblLanguages.setFont(new Font("굴림", Font.BOLD, 12));
		lblLanguages.setBackground(SystemColor.inactiveCaption);
		lblLanguages.setBounds(0, 486, 720, 20);
		panel.add(lblLanguages);
		
		lblLang = new JLabel("              어 학");
		lblLang.setBounds(0, 516, 160, 50);
		panel.add(lblLang);
		
		lblToeic = new JLabel("    TOEIC");
		lblToeic.setBounds(159, 516, 111, 25);
		panel.add(lblToeic);
		
		lblToefl = new JLabel("    TOEFL");
		lblToefl.setBounds(159, 541, 111, 25);
		panel.add(lblToefl);
		
		ToeflField = new JTextField();
		ToeflField.setText("                      점");
		ToeflField.setBounds(273, 541, 116, 25);
		panel.add(ToeflField);
		ToeflField.setColumns(10);
		
		ToeicField = new JTextField();
		ToeicField.setText("                   800\uC810");
		ToeicField.setColumns(10);
		ToeicField.setBounds(273, 516, 116, 25);
		panel.add(ToeicField);
		
		lblJapanese = new JLabel("    일 본 어");
		lblJapanese.setBounds(391, 516, 111, 25);
		panel.add(lblJapanese);
		
		lblChinaese = new JLabel("    중 국 어");
		lblChinaese.setBounds(391, 541, 111, 25);
		panel.add(lblChinaese);
		
		ChinaeseField = new JTextField();
		ChinaeseField.setText("                      급");
		ChinaeseField.setColumns(10);
		ChinaeseField.setBounds(505, 541, 116, 25);
		panel.add(ChinaeseField);
		
		JapaneseField = new JTextField();
		JapaneseField.setText("                      급");
		JapaneseField.setColumns(10);
		JapaneseField.setBounds(505, 516, 116, 25);
		panel.add(JapaneseField);
		
		lblCert = new JLabel("                                                                                     자 격 증");
		lblCert.setToolTipText("");
		lblCert.setFont(new Font("굴림", Font.BOLD, 12));
		lblCert.setBackground(SystemColor.inactiveCaption);
		lblCert.setBounds(0, 577, 720, 20);
		panel.add(lblCert);
		
		lblCertDay = new JLabel("            취 득 연 월 일");
		lblCertDay.setBounds(10, 606, 150, 20);
		panel.add(lblCertDay);
		
		lblCertName = new JLabel("                           자 격 사 항");
		lblCertName.setBounds(159, 606, 330, 20);
		panel.add(lblCertName);
		
		lblCertAgency = new JLabel("                   발 행 기 관 ");
		lblCertAgency.setBounds(489, 606, 219, 20);
		panel.add(lblCertAgency);
		
		CertAgencyField1 = new JTextField();
		CertAgencyField1.setColumns(10);
		CertAgencyField1.setBounds(489, 625, 219, 21);
		panel.add(CertAgencyField1);
		
		CertName1 = new JTextField();
		CertName1.setColumns(10);
		CertName1.setBounds(159, 625, 330, 21);
		panel.add(CertName1);
		
		CertDayField1 = new JTextField();
		CertDayField1.setColumns(10);
		CertDayField1.setBounds(12, 625, 148, 21);
		panel.add(CertDayField1);
		
		CertAgencyField2 = new JTextField();
		CertAgencyField2.setColumns(10);
		CertAgencyField2.setBounds(489, 649, 219, 21);
		panel.add(CertAgencyField2);
		
		CertName2 = new JTextField();
		CertName2.setColumns(10);
		CertName2.setBounds(159, 649, 330, 21);
		panel.add(CertName2);
		
		CertDayField2 = new JTextField();
		CertDayField2.setColumns(10);
		CertDayField2.setBounds(12, 649, 148, 21);
		panel.add(CertDayField2);
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}
}