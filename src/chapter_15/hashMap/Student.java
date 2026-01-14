package chapter_15.hashMap;

public class Student {
  public int sno;
  public String name;

  public Student(int sno, String name) {
    this.sno = sno;
    this.name = name;
  }
  
  @Override
  public String toString() { return "Student [sno=" + sno + ", name=" + name + "]"; }

  @Override
  public int hashCode() { return sno + name.hashCode(); }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student student = (Student) obj;
      return (sno == student.sno) && (name.equals(student.name));
    } return false;
  }

  public int getSno() { return sno; }
  public String getName() { return name; }
  public void setSno(int sno) { this.sno = sno; }
  public void setName(String name) { this.name = name; }
}
