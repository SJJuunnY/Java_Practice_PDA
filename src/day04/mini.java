package day04;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class mini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DAO users = new DAO();
        while(true){
            try {
                System.out.println("1:회원가입 / 2:로그인 / 3: 회원정보 수정 / 4 : 탈퇴 / 0 : 종료");
                int option = scanner.nextInt();
                if (option == 1) {
                    System.out.println("가입하실 아이디와 비밀번호, 이름을(띄어쓰기로 구분하여)입력해");
                    String id = scanner.next();
                    String pw = scanner.next();
                    String name = scanner.next();
                    User tempUser = new User(id, pw, name);
                    users.signup(tempUser);
                    System.out.println(name + "님 가입을 환영합니다~ㅋ");
                } else if (option == 2) {
                    System.out.println("로그인을 위해 아이디와 password를 input하세요");
                    String id = scanner.next();
                    String pw = scanner.next();

                    if (users.login(id, pw))
                        System.out.println(id + "님 로그인 됐어욤~");
                    else
                        System.out.println("로그인 실패");
                } else if (option == 3) { // 업데이트
                    if (!users.isLogin()) {
                        System.out.println("로그인이 안되어 있습니다~");
                    } else {
                        System.out.println(users.getCurrentUser() + "님의 정보를 변경합니다");
                        System.out.println("변경하실 pw를 입력하세요!");
                        String pw = scanner.next();
                        users.updateUser(pw);
                    }

                } else if (option == 4) { // 탈퇴
                    if (!users.isLogin())
                        System.out.println("로그인이 안되어 있습니다~");
                    else
                        users.deleteUser();
                } else if (option == 0) {
                    System.out.println("ㅃo");
                    break;
                } else {
                    System.out.println("다시 입력하세요");
                }
            }catch (InputMismatchException e){
                System.out.println(e);
                System.out.println("에러 수고");
                scanner.next();
            }
        }

    }
}

interface userDB{ //Create , Read, Update, Delete
    boolean isLogin();
    void signup(User user);
    boolean login(String id, String pw);
    void updateUser(String pw);
    void deleteUser();
}
class DAO implements userDB{
    Map<String, User> m = new HashMap<>();
    String currentUser = "";

    String getCurrentUser(){
        return currentUser;
    }
    public boolean isLogin(){
        return !currentUser.isEmpty();
    }
    public void signup(User user){
        System.out.println(user);
        m.put(user.getId(), user);
    }
    public boolean login(String id, String pw){
        if(m.containsKey(id) && m.get(id).checkPw(pw)){
            currentUser = id;
            return true;
        }else{
            return false;
        }
    }

    public void updateUser(String pw){

        User tempUser = m.get(currentUser);

        System.out.println(tempUser.getPw());

        tempUser.setPw(pw);
        m.put(currentUser,tempUser);

        System.out.println(m.get(currentUser).getPw());
    }
    public void deleteUser(){
        m.remove(currentUser);
    }

    public void getAllUsers(){
        for(Map.Entry<String, User> entry : m.entrySet()){
            System.out.println(entry.getValue().getId());
        }
    }
}

class User{
    private String id;
    private String pw;
    private String name;

    public User(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public String getId(){
        return this.id;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public boolean checkPw(String pw){
        return this.pw.equals(pw);
    }
}
