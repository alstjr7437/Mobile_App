import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class ProjectSelect extends JFrame {

	Login login = new Login();
	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectSelect frame = new ProjectSelect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ProjectSelect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(200,200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane); 
		
		JButton btnHome = new JButton("홈");
		btnHome.setBounds(122, 10, 52, 31);
		contentPane.add(btnHome);
		
		JButton btnIng = new JButton("진행 프로젝트");
		btnIng.setBounds(10, 51, 164, 39);
		contentPane.add(btnIng);
		
		JButton btnEd = new JButton("과거 프로젝트");
		btnEd.setBounds(10, 114, 164, 39);
		contentPane.add(btnEd);
		
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
		
		btnIng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectIng().setVisible(true);
				setVisible(false);
			}
		});
		
		btnEd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProjectEd().setVisible(true);
				setVisible(false);
			}
		});
	}
}
