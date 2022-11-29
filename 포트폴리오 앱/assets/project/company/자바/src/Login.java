import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;

public class Login extends JFrame{
	//데이터 저장할 곳을 배열로 선언
	static int[] dsnum = new int[100];
	static int[] deno = new int[100];
	static String[] dename = new String[100];
	static String[] dpassword = new String[100];
	static String[] dposition = new String[100];
	static String[] dhiredate = new String[100];
	static String[] dhp = new String[100];
	static String[] deMail = new String[100];
	static String[] did = new String[100];
	static String[] daddress = new String[100];
	static String[] dsalary = new String[100];
	static String[] devaluation = new String[100];
	static int[] dmanager = new int[100];
	static int[] ddno = new int[100];
	static int[] dtno = new int[100];
	
	//처음 선언한 snum을 저장하기 위한 int
    static int numB = 0;
	
    //부서 번호와 팀 번호로 이름을 가져오기
	static String[] ddname = new String[100];
	static String[] dtname = new String[100];
	//이름 기억해두는 변수
	static String gName;
	//사장 화면인지 사원 화면인지 저장해두기
	static int emp;
	
	private JPanel contentPane;
	private JTextField tFid;
	private JPasswordField tFpassword;
	private JLabel labelid;
	private JLabel labelpassword;
	private JButton btntest;
	private JButton btntest_1;

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setSize(250,200);
		setContentPane(contentPane);
		
		//아이디 비밀번호 라벨 필드
		labelid = new JLabel("사원 이름");
		labelid.setBounds(16, 37, 52, 15);
		contentPane.add(labelid);
		labelpassword = new JLabel("비밀번호");
		labelpassword.setBounds(16, 82, 52, 15);
		contentPane.add(labelpassword);
		//아이디 비밀번호 텍스트 필드
		tFid = new JTextField();
		tFid.setBounds(80, 27, 129, 35);
		tFid.setColumns(10);
		contentPane.add(tFid);		
		tFpassword = new JPasswordField();
		tFpassword.setBounds(80, 72, 129, 35);
		contentPane.add(tFpassword);
		
		//로그인 버튼
		JButton btnid = new JButton("로그인");	
		btnid.setBounds(80, 127, 95, 23);
		contentPane.add(btnid);
		
		//데이터베이스 연동
		DataBase.dbConnect();
		try {
        	for(int i = 1; i <= 41; i++) {
        		DataBase.select("select", "employee", "snum", i); //테이블명이 employee인 것들 번호 순으로 차례대로 출력
			while(DataBase.rs.next()) { 	//데이터 값들을 저장하기 위해 돌리는 반복문
				dsnum[i] = DataBase.rs.getInt("snum");		//배열에 데이터들을 저장
				deno[i] = DataBase.rs.getInt("eno");
				dename[i] = DataBase.rs.getString("ename");
				dposition[i] = DataBase.rs.getString("position");
				dhiredate[i] = DataBase.rs.getString("hiredate");
				dhp[i] = DataBase.rs.getString("hp");
				deMail[i] = DataBase.rs.getString("eMail");
				did[i] = DataBase.rs.getString("id");
				daddress[i] = DataBase.rs.getString("address");
				dsalary[i] = DataBase.rs.getString("salary");
				devaluation[i] = DataBase.rs.getString("evaluation");
				dmanager[i] = DataBase.rs.getInt("manager");
				dpassword[i] = DataBase.rs.getString("password");
				ddno[i] = DataBase.rs.getInt("dno");
				dtno[i] = DataBase.rs.getInt("tno");
				//부서 번호에 따른 부서 이름 설정
				if(ddno[i] == 1100) {
					ddname[i] = "인사부";
				} else if(ddno[i] == 2100 ) {
					ddname[i] = "기획부";
				} else if(ddno[i] == 3100) {
					ddname[i] = "재정부";
				}
				//팀 번호에 따른 팀 이름 설정
				if(dtno[i] % 3 == 1) {
					dtname[i] = "1팀";
				} else if(dtno[i] % 3 == 2){
					dtname[i] = "2팀";
				} else if(dtno[i] % 3 == 0) {
					dtname[i] = "3팀";
				} else if(dtno[i] == 0) {
					dtname[i] = "";
				}
			}
        }
		} catch (SQLException e1) {	//연동 실패시 출력
			System.out.println("연동 실패!");
		}


		  
		//로그인 버튼 액션 리스너
		btnid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//id와 pw를 읽어오도록 설정
	            String id;
	            id = tFid.getText();
	            String pw;
	            pw = tFpassword.getText();	
	    
					for(int i = 2; i <= 40; i++) {
		            	 if(id.equals(dename[1]) && pw.equals(dpassword[1])) {			//사장 로그인
								emp = 0;	//사장 화면을 가기 위한 int
								JOptionPane.showMessageDialog(contentPane, "사장 로그인 완료!");
									new Mainp().setVisible(true);						//사장 화면 이동
									setVisible(false);
					            	i += 100;
		            	 }
		            	 else if(id.equals(dename[i]) && pw.equals(dpassword[i])) {	//직원 로그인	나중에 데이터베이스 들고와서 if문으로 돌리면서 이름 확인하기. 
				            	JOptionPane.showMessageDialog(contentPane, "회원 로그인 완료!");
			            	emp = 1;
			            	numB = dsnum[i];
			            	new Maine().setVisible(true);
			            	setVisible(false);
			            	i += 100;
			             } 
//		            	 else if(!id.equals(dename[i]) || !pw.equals(dpassword[i])){	
//			            	 String data = "사용자: " + tFid.getText();			//사용자 비밀번호 틀릴시 출력해줌
//			                 data += ", 비밀번호: " + new String(tFpassword.getPassword());
//			                 JOptionPane.showMessageDialog(contentPane, data + "\n 다시입력하세요!");
//			             	}
					}
	            }
		});

	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

