package chapter_15.hashMap;

import java.util.Comparator;
import java.util.HashMap;

public class MemberHashMap implements Comparator<Member> {
  private HashMap<Integer, String> hashMap;

  MemberHashMap() { hashMap = new HashMap<Integer, String>(); }

  void addMember(Member member) { hashMap.put(member.memberId(), member.memberName()); } 

  void removeMember(int memberId) {
    if (hashMap.containsKey(memberId)) {
      String memberName = hashMap.remove(memberId);
      System.out.println(memberId + " : " + memberName + " 학생의 정보가 삭제되었습니다.\n");
    } else System.out.println(memberId + "번 학생은 존재하지 않습니다.\n");
  }

  void showAllMember() {
    System.out.println("====== 학생 정보 ======");

    for (Integer memberId : hashMap.keySet()) System.out.println(memberId + " : " + hashMap.get(memberId));
  }

  @Override
  public int compare(Member o1, Member o2) { return Integer.compare(o1.memberId(), o2.memberId()); }


}
