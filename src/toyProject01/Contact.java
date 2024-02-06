package toyProject01;

public class Contact {
    //필드는 private으로 설정
    String name;
    String phoneNumber;
    //생성자로 부모 클래스에 이름과 연락처 받아오기
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "이름: " + name + ", 전화번호: " + phoneNumber;
    }
}