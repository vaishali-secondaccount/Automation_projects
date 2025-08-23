package Comparable_comparator;

import java.util.*;


class Student implements Comparable<Student> {
    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int compareTo(Student s) {// sorting id
        return id - s.id;
//  public int compareTo(Student s) {
//  return this.name.compareTo(s.name);// for comparing String(Sorting String)
//       
    }
    public String toString() {
        return id + " " + name;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
            list.add(new Student(9, "Amit"));
            list.add(new Student(0, "Bharat"));
            list.add(new  Student(2, "Chetak"));
        

        Collections.sort(list);  // Uses Comparable

        for(Student s:list)
        {
        	System.out.println(s);
        }
    }
}
