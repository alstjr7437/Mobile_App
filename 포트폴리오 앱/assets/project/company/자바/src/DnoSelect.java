import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;

public class DnoSelect extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DnoSelect frame = new DnoSelect();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public DnoSelect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(300,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("»®");
		btnHome.setBounds(208, 10, 66, 45);
		contentPane.add(btnHome);
		
		JLabel lblname = new JLabel("∫Œº≠ º±≈√");
		lblname.setToolTipText("");
		lblname.setFont(new Font("±º∏≤", Font.PLAIN, 30));
		lblname.setBounds(26, 10, 159, 45);
		contentPane.add(lblname);
		
		JButton btnHuman = new JButton("¿ŒªÁ∫Œ");
		btnHuman.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnHuman.setBounds(30, 81, 204, 46);
		contentPane.add(btnHuman);
		
		JButton btnPlanning = new JButton("±‚»π∫Œ");
		btnPlanning.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnPlanning.setBounds(30, 137, 204, 49);
		contentPane.add(btnPlanning);
		
		JButton btnMinistry = new JButton("¿Á¡§∫Œ");
		btnMinistry.setFont(new Font("±º∏≤", Font.PLAIN, 20));
		btnMinistry.setBounds(30, 196, 204, 46);
		contentPane.add(btnMinistry);
		

		
		btnHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DnoCon().setVisible(true);
				setVisible(false);
			}
		});		
		
		btnPlanning.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DnoCon2().setVisible(true);
				setVisible(false);
			}
		});		
		
		btnMinistry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DnoCon3().setVisible(true);
				setVisible(false);
			}
		});		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Mainp().setVisible(true);
				setVisible(false);
			}
		});
		
	}
}