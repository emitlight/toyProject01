package toyProject01;

import java.util.Scanner;

public class ContactsProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        int option;
        do {
            System.out.println("1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.println("메뉴를 선택해주세요: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("이름을 입력하세요: ");
                    String name1 = scanner.nextLine();
                    System.out.println("전화번호를 입력하세요: ");
                    String phoneNumber1 = scanner.nextLine();
                    System.out.println("회사명을 입력하세요: ");
                    String company1 = scanner.nextLine();
                    BusinessContact business = new BusinessContact(name1, phoneNumber1, company1);
                    addressBook.addContacts(business);
                    break;
                case 2:
                    System.out.println("이름을 입력하세요: ");
                    String personName = scanner.nextLine();
                    System.out.println("전화번호를 입력하세요: ");
                    String personPhoneNumber = scanner.nextLine();
                    System.out.println("관계를 입력하세요: ");
                    String relationship = scanner.nextLine();
                    PersonalContact personal = new PersonalContact(personName, personPhoneNumber, relationship);
                    addressBook.addContacts(personal);
                    break;
                case 3:
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.println("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    addressBook.searchContacts(searchName);
                    break;
                case 5:
                    break;
            }
        } while (option != 5);
    }
}
