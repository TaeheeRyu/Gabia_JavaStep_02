package chapter_14.hashSet;

import java.util.Set;
import java.util.HashSet;

public class SoldeskManager_03 {
  // HashSet 공간을 이용해서 멤버정보를 관리
  private Set<SoldeskMember_03> members;
  public SoldeskManager_03() { members = new HashSet<SoldeskMember_03>(); }

  void addMember(SoldeskMember_03 member) {
    if(members.add(member)) System.out.println(member.getMemberName() + "님 회원가입 완료");
    else System.out.println("이미 등록된 회원: " + member.getMemberName());
  }

  void showAllMember() {
    System.out.println("---- 전체 회원 정보 출력 ----");

    for(SoldeskMember_03 member : members)
      System.out.println("회원 아이디: " + member.getMemberId() + "  |  회원 이름: " + member.getMemberName());
  }
}
