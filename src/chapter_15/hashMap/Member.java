package chapter_15.hashMap;

public record Member(int memberId, String memberName) {
  @Override
  public String toString() { return memberId + " : " + memberName; }
}
