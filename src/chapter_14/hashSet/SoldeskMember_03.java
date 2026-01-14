package chapter_14.hashSet;

public class SoldeskMember_03 {
  private int memberId;
  private String memberName;

  public SoldeskMember_03() {}
  public SoldeskMember_03(int memberId, String memberName) {
    this.memberId = memberId;
    this.memberName = memberName;
  }

  public int getMemberId() { return memberId; }
  public void setMemberId(int memberId) { this.memberId = memberId; }

  public String getMemberName() { return memberName; }
  public void setMemberName(String memberName) { this.memberName = memberName; }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
  public boolean equals(Object obj) {
    if (obj instanceof SoldeskMember_03) {
      SoldeskMember_03 member = (SoldeskMember_03) obj;
      return this.memberId == member.memberId;
    } return false;
  }
}
