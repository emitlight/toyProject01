package toyProject01;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    List<Contact> contacts = new ArrayList<>();
    //연락처 추가 메서드: contacts List에 add메서드를 통해 연락처를 추가한다.
    public void addContacts(Contact contact) {
        contacts.add(contact);
        System.out.println("연락처가 추가되었습니다.");
    }
    //연락처 출력 메서드
    public void displayContacts() {
        if(contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact); //toString 메서드 자동 호출
            }
        }
    }
    //연락처 검색 메서드
    public void searchContacts(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if(contact.name.equalsIgnoreCase(name)) {
                found = true;
                System.out.println(contact);
            }
        }
        if(!found) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
