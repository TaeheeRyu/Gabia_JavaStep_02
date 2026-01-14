package chapter_15.treeMap;

import java.util.TreeMap;

public class TreeMapEmployeeMain_03 {
  public static void main(String[] args) {
    TreeMap<Integer, Employee_03> employeeMap = new TreeMap<Integer, Employee_03>();
    
    employeeMap.put(1003, new Employee_03("Alice", 30));
    employeeMap.put(1001, new Employee_03("Bob", 25));
    employeeMap.put(1002, new Employee_03("Charlie", 28));
    employeeMap.put(1004, new Employee_03("David", 35));

    System.out.println("=== 직원 정보 출력(사번순 정렬) ===");
    for (Integer empId : employeeMap.keySet()) System.out.println("사번: " + empId + ", 정보: " + employeeMap.get(empId));

    // 특정 직원 조회
    int selectedEmpId = 1002;
    
    System.out.println("\n=== 사번 " + selectedEmpId + " 직원 정보 조회 ===");
    System.out.println("사번: " + selectedEmpId + ", 정보: " + employeeMap.get(selectedEmpId));
  }
}
