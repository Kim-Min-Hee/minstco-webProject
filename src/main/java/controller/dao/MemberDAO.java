package controller.dao;

import controller.vo.MemberVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {

    private static MemberDAO instance;
    private MemberDAO getInstance;
    public static MemberDAO getInstance(){
        if(instance == null)
            instance = new MemberDAO();
            return instance;

    }
    private Connection connection;
    private static String driver = "org.mariadb.jdbc.Driver";
    private static String USER_ID = "min";
    private static String USER_PASSWORD = "hee";
    private MemberDAO(){
        try {
            Class.forName(driver);
            connection= DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/minstcodb",USER_ID,USER_PASSWORD);
            if(connection != null) {
                System.out.println("DB접속 성공!!!!");
            }
        }catch(ClassNotFoundException e) {
            System.out.println("오류발생: "+e);
            System.out.println("오류!!!!");
        }catch(SQLException e) {
            e.printStackTrace();
            System.out.println("DB 접속 실패");
        }

    }
    public void memberInsert(MemberVO memberVO) {
        String sql="insert into information (user_id,user_password,user_name) values (?,?,?)";
        PreparedStatement pstmt = null;

        try {
            pstmt= connection.prepareStatement(sql.toString());
            System.out.println("MemberDAO get User_ID : "+memberVO.getId());
            pstmt.setString(1, memberVO.getId());
            pstmt.setString(2, memberVO.getPassword());
            pstmt.setString(3, memberVO.getName());
            pstmt.setString(4,memberVO.getPhoneNumber());
            pstmt.executeUpdate();
        }catch(SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt != null && !pstmt.isClosed())
                    pstmt.close();
            }catch(SQLException e) {
                e.printStackTrace();
            }
        }
    }


}
