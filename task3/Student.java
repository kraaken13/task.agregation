package com.tasks.task3;

public class Student {
    public String studentName;
    public int group;
    public int[] evaluation = new int[5];

    public Student(String studentName, int group, int[] evaluation) {
        this.studentName = studentName;
        this.group = group;
        this.evaluation = evaluation;
    }

    public static void showBest(Student[] listStudents) {
        for (Student student : listStudents) {
            int flag = 0;
            for (int a : student.evaluation) {
                if (a < 9 || a > 10) {
                    flag++;
                }
            }
            if (flag == 0)
                System.out.println(student.studentName + "  " + student.group);
        }
    }
}
