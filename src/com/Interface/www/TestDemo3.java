package com.Interface.www;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-08-09
 * Time:11:25
 **/
class Student implements Comparable<Student> {
    public String name;
    public int age;
    public int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        return -1;
    }
}
public class TestDemo3 {
    public static void main(String[] args) {
        Student student1 = new Student("雯雯",18,90);
        Student student2 = new Student("穆穆",23,78);
        Student student3 = new Student("西西",21,99);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
