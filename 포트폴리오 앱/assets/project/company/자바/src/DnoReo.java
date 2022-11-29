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

public class DnoReo extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DnoReo frame = new DnoReo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DnoReo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(400,500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("»®");
		btnHome.setBounds(309, 36, 52, 31);
		contentPane.add(btnHome);
		
		JLabel lblReo_1 = new JLabel("∫Œº≠∞≥∆Ì");
		lblReo_1.setFont(new Font("±º∏≤", Font.PLAIN, 50));
		lblReo_1.setBounds(48, 23, 217, 58);
		contentPane.add(lblReo_1);
		
		JButton btninsa = new JButton("¿ŒªÁ∫Œ");
		btninsa.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		btninsa.setBounds(34, 113, 251, 85);
		contentPane.add(btninsa);
		
		JButton btngihwak = new JButton("±‚»π∫Œ");
		btngihwak.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		btngihwak.setBounds(34, 223, 251, 85);
		contentPane.add(btngihwak);
		
		JButton btnjaejung = new JButton("¿Á¡§∫Œ");
		btnjaejung.setFont(new Font("±º∏≤", Font.PLAIN, 40));
		btnjaejung.setBounds(34, 328, 251, 85);
		contentPane.add(btnjaejung);
		
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		btninsa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reo1().setVisible(true);
				setVisible(false);
			}
		});
		
		btngihwak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reo2().setVisible(true);
				setVisible(false);
			}
		});
		
		btnjaejung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reo3().setVisible(true);
				setVisible(false);
			}
		});
	}
}
