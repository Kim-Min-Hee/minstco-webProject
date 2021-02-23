package controller.member;


public interface MemberDAO {

    public String getTime();

    public void insertMember(MemberVO memberVO);

    public MemberVO readMember (String id) throws Exception;

    public MemberVO readWithPW (String id, String password) throws Exception;

}
