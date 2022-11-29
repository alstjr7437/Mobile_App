import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;

public class DataBase {
	

	static String driver, url;
	static Connection conn;
	static Statement stmt, pstmt;
	static ResultSet rs;
	static String tmpstr;
	static long count = 0;
	static int b = 0;
	static int set;
	
	//데이터베이스 연결
	public static void dbConnect() {
    	driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    	try{
    		Class.forName("com.mysql.jdbc.Driver");
    		System.out.println("드라이버 검색 성공!");        
    	}catch(ClassNotFoundException e){
    		System.err.println("error = " + e);
    	}
    	
        url = "jdbc:odbc:company";		//데이터베이스 이름
        conn = null;
        stmt = null;
        rs = null;
        String url = "jdbc:mysql://localhost/company?useUnicode=yes&characterEncoding=UTF8";
        String sql1 = "Select * From employee";
        //테이블 4개 들고오기
        
		try {
            conn = DriverManager.getConnection(url,"root","apmsetup");	//아이디와 패스워드로 연결
            stmt = conn.createStatement( );		//실행객체 만들기
            rs = stmt.executeQuery(sql1);		//customer테이블에서 모든 객체 찾아오기.
            System.out.println("데이터베이스 연결 성공!");            
        }
        catch(Exception e) {
            System.out.println("데이터베이스 연결 실패!");
        }
	}

	//쿼리 order와 sql	
	//select로 선택해서 출력하도록 하기
	static void select(String order, String table, String filed, int num) throws SQLException{	
		if(order == "select") {
			String test1 = "select * from ";  
			String test2 = " where ";
			String test3 = " = ";
			rs = stmt.executeQuery(test1 + table + test2 + filed + test3 + num);
			if(table == "employee") {
				b = 1;
			} else if (table == "department") {
				b = 2;
			} else if (table == "team") {
				b = 3;
			} else {
				b = 4;
			}
		}
	}

	//디스커넥트 연결 해제하기
	static void dbDis(){
		try {
			if (conn != null)	//conn객체가 null이 아니면
				conn.close();	//conn 끊어라
			if (stmt != null)	//실행객체가 null이 아니면
				stmt.close();	//실행객체 끊어라
			System.out.println("데이터베이스 연결 해제!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}


	public static void main(String[] args) throws SQLException  {
		dbConnect();
		if(b == 1) {	//table에 따른 출력 길이
			set = 15;
		} else if (b == 2) {
			set = 4;
		} else if (b == 3) {
			set = 5;
		} else if (b == 4) {
			set = 6;
		}
		//선택 table명 / 검색
		select("select", "employee", "snum", 3);
		if(rs.next()) {
			for(int i = 1; i <= set; i++) {
				System.out.printf("  ");
				System.out.print(rs.getString(i));
			}
			System.out.println();
		}
		
		dbDis();
	}
}
