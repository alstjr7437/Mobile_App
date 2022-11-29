import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class Company extends JFrame {

	private JPanel contentPane;
	Login login = new Login();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Company frame = new Company();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Company() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(300,350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("홈");
		btnHome.setBounds(164, 10, 52, 31);
		contentPane.add(btnHome);
		
		JButton btnProject = new JButton("새 프로젝트");
		btnProject.setFont(new Font("굴림", Font.PLAIN, 20));
		btnProject.setBounds(32, 67, 184, 49);
		contentPane.add(btnProject);
		
		JButton btnEmp = new JButton("직원 채용");
		btnEmp.setFont(new Font("굴림", Font.PLAIN, 20));
		btnEmp.setBounds(32, 146, 184, 49);
		contentPane.add(btnEmp);
		
		JButton btnDno = new JButton("부서 개편");
		btnDno.setFont(new Font("굴림", Font.PLAIN, 20));
		btnDno.setBounds(32, 228, 184, 49);
		contentPane.add(btnDno);
		
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
		
		btnProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new ProjectNew().setVisible(true);
				}
		});
		
		btnEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new EmpInf().setVisible(true);
				}
		});
		
		btnDno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new DnoReo().setVisible(true);
				}
		});
	}

}
