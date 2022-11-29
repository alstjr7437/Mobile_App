import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Emp extends JFrame {

	private JPanel contentPane;
	
	Login login = new Login();
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Emp frame = new Emp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Emp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900,700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnHome = new JButton("È¨");
		btnHome.setBounds(799, 10, 52, 31);
		contentPane.add(btnHome);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(89, 51, 762, 520);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		table.setRowHeight(table.getRowHeight() + 5);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{Login.dposition[1], Login.dename[1], Login.ddname[1], Login.dtname[1], Login.dhiredate[1], Login.dhp[1], Login.deMail[1]},
				{Login.dposition[2], Login.dename[2], Login.ddname[2], Login.dtname[2], Login.dhiredate[2], Login.dhp[2], Login.deMail[2]},
				{Login.dposition[3], Login.dename[3], Login.ddname[3], Login.dtname[3], Login.dhiredate[3], Login.dhp[3], Login.deMail[3]},
				{Login.dposition[4], Login.dename[4], Login.ddname[4], Login.dtname[4], Login.dhiredate[4], Login.dhp[4], Login.deMail[4]},
				{Login.dposition[5], Login.dename[5], Login.ddname[5], Login.dtname[5], Login.dhiredate[5], Login.dhp[5], Login.deMail[5]},
				{Login.dposition[6], Login.dename[6], Login.ddname[6], Login.dtname[6], Login.dhiredate[6], Login.dhp[6], Login.deMail[6]},
				{Login.dposition[7], Login.dename[7], Login.ddname[7], Login.dtname[7], Login.dhiredate[7], Login.dhp[7], Login.deMail[7]},
				{Login.dposition[8], Login.dename[8], Login.ddname[8], Login.dtname[8], Login.dhiredate[8], Login.dhp[8], Login.deMail[8]},
				{Login.dposition[9], Login.dename[9], Login.ddname[9], Login.dtname[9], Login.dhiredate[9], Login.dhp[9], Login.deMail[9]},
				{Login.dposition[10], Login.dename[10], Login.ddname[10], Login.dtname[10], Login.dhiredate[10], Login.dhp[10], Login.deMail[10]},
				{Login.dposition[11], Login.dename[11], Login.ddname[11], Login.dtname[11], Login.dhiredate[11], Login.dhp[11], Login.deMail[11]},
				{Login.dposition[12], Login.dename[12], Login.ddname[12], Login.dtname[12], Login.dhiredate[12], Login.dhp[12], Login.deMail[12]},
				{Login.dposition[13], Login.dename[13], Login.ddname[13], Login.dtname[13], Login.dhiredate[13], Login.dhp[13], Login.deMail[13]},
				{Login.dposition[14], Login.dename[14], Login.ddname[14], Login.dtname[14], Login.dhiredate[14], Login.dhp[14], Login.deMail[14]},
				{Login.dposition[15], Login.dename[15], Login.ddname[15], Login.dtname[15], Login.dhiredate[15], Login.dhp[15], Login.deMail[15]},
				{Login.dposition[16], Login.dename[16], Login.ddname[16], Login.dtname[16], Login.dhiredate[16], Login.dhp[16], Login.deMail[16]},
				{Login.dposition[17], Login.dename[17], Login.ddname[17], Login.dtname[17], Login.dhiredate[17], Login.dhp[17], Login.deMail[17]},
				{Login.dposition[18], Login.dename[18], Login.ddname[18], Login.dtname[18], Login.dhiredate[18], Login.dhp[18], Login.deMail[18]},
				{Login.dposition[19], Login.dename[19], Login.ddname[19], Login.dtname[19], Login.dhiredate[19], Login.dhp[19], Login.deMail[19]},
				{Login.dposition[20], Login.dename[20], Login.ddname[20], Login.dtname[20], Login.dhiredate[20], Login.dhp[20], Login.deMail[20]},
				{Login.dposition[21], Login.dename[21], Login.ddname[21], Login.dtname[21], Login.dhiredate[21], Login.dhp[21], Login.deMail[21]},
				{Login.dposition[22], Login.dename[22], Login.ddname[22], Login.dtname[22], Login.dhiredate[22], Login.dhp[22], Login.deMail[22]},
				{Login.dposition[23], Login.dename[23], Login.ddname[23], Login.dtname[23], Login.dhiredate[23], Login.dhp[23], Login.deMail[23]},
				{Login.dposition[24], Login.dename[24], Login.ddname[24], Login.dtname[24], Login.dhiredate[24], Login.dhp[24], Login.deMail[24]},
				{Login.dposition[25], Login.dename[25], Login.ddname[25], Login.dtname[25], Login.dhiredate[25], Login.dhp[25], Login.deMail[25]},
				{Login.dposition[26], Login.dename[26], Login.ddname[26], Login.dtname[26], Login.dhiredate[26], Login.dhp[26], Login.deMail[26]},
				{Login.dposition[27], Login.dename[27], Login.ddname[27], Login.dtname[27], Login.dhiredate[27], Login.dhp[27], Login.deMail[27]},
				{Login.dposition[28], Login.dename[28], Login.ddname[28], Login.dtname[28], Login.dhiredate[28], Login.dhp[28], Login.deMail[28]},
				{Login.dposition[29], Login.dename[29], Login.ddname[29], Login.dtname[29], Login.dhiredate[29], Login.dhp[29], Login.deMail[29]},
				{Login.dposition[30], Login.dename[30], Login.ddname[30], Login.dtname[30], Login.dhiredate[30], Login.dhp[30], Login.deMail[30]},
				{Login.dposition[31], Login.dename[31], Login.ddname[31], Login.dtname[31], Login.dhiredate[31], Login.dhp[31], Login.deMail[31]},
				{Login.dposition[32], Login.dename[32], Login.ddname[32], Login.dtname[32], Login.dhiredate[32], Login.dhp[32], Login.deMail[32]},
				{Login.dposition[33], Login.dename[33], Login.ddname[33], Login.dtname[33], Login.dhiredate[33], Login.dhp[33], Login.deMail[33]},
				{Login.dposition[34], Login.dename[34], Login.ddname[34], Login.dtname[34], Login.dhiredate[34], Login.dhp[34], Login.deMail[34]},
				{Login.dposition[35], Login.dename[35], Login.ddname[35], Login.dtname[35], Login.dhiredate[35], Login.dhp[35], Login.deMail[35]},
				{Login.dposition[36], Login.dename[36], Login.ddname[36], Login.dtname[36], Login.dhiredate[36], Login.dhp[36], Login.deMail[36]},
				{Login.dposition[37], Login.dename[37], Login.ddname[37], Login.dtname[37], Login.dhiredate[37], Login.dhp[37], Login.deMail[37]},
				{Login.dposition[38], Login.dename[38], Login.ddname[38], Login.dtname[38], Login.dhiredate[38], Login.dhp[38], Login.deMail[38]},
				{Login.dposition[39], Login.dename[39], Login.ddname[39], Login.dtname[39], Login.dhiredate[39], Login.dhp[39], Login.deMail[39]},
				{Login.dposition[40], Login.dename[40], Login.ddname[40], Login.dtname[40], Login.dhiredate[40], Login.dhp[40], Login.deMail[40]},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC9C1\uCC45", "\uC774\uB984", "\uBD80\uC11C", "\uD300", "\uC785\uC0AC\uC77C", "\uC804\uD654", "\uC774\uBA54\uC77C"
			}
		));
		
		JButton btnCon = new JButton("Á¤º¸");
		btnCon.setFont(new Font("±¼¸²", Font.PLAIN, 10));
		btnCon.setBounds(26, 157, 65, 23);
		contentPane.add(btnCon);
		table.getColumnModel().getColumn(4).setPreferredWidth(95);
		table.getColumnModel().getColumn(6).setPreferredWidth(150);
		
		btnCon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new EmpCon2().setVisible(true);
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
	}
}
