package chapter_14.hashSet;

public class SoldeskMain_03 {
  public static void main(String[] args) {
    // SoldeskMember의 객체(멤버)가 저장될 수 있는 HashSet이 생성됨
    SoldeskManager_03 manager = new SoldeskManager_03();

    // 회원가입할 때 필요한 정보를 저장
    manager.addMember(new SoldeskMember_03(1001, "홍길동"));
    manager.addMember(new SoldeskMember_03(1002, "고길동"));
    manager.addMember(new SoldeskMember_03(1003, "이길동"));
    manager.addMember(new SoldeskMember_03(1004, "박길동"));

    System.out.println();
    
    manager.showAllMember();

    manager.addMember(new SoldeskMember_03(1003, "이길동"));

    manager.showAllMember();
  }
}
