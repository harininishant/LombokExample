package io.pragra.Sservicces;

import io.pragra.domain.Course;
import io.pragra.domain.Student;

import java.awt.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Run {

    public static void main(String[] args) {
        StudentService ser = new StudentService();


        Student G = Student.builder().studentID(2).name("abc").build();
        ser.createStudent(G);

       Student H=Student.builder().studentID(3).name("rty").age(20).courses(Arrays.asList(Course.builder().coursename("Java").createDate(Instant.now()).build(), Course.builder().coursename("QA").build())).build();
        ser.createStudent(H);
        System.out.println(ser);
        Course java = Course.builder().coursename("java").createDate(Instant.now()).build();
        Course java1 = Course.builder().coursename("java1").createDate(Instant.now()).build();
        ser.createStudent(Student.builder().name("Rutika").courses(Arrays.asList(java,java1)).build());
        System.out.println(ser);
        System.out.println(java);

        System.out.println("Flattening the courses");
        Stream.of(H).flatMap(s -> s.getCourses().stream()).forEach(System.out::print);
        System.out.println();//  getting from courses class


        List<Student> listofstudents=Arrays.asList(G,G,H);// objects

        System.out.println("LIST");
        System.out.println(listofstudents);

        Set<Student> studentSet=new HashSet<>();
        studentSet.add(G);
        studentSet.add(G);
        studentSet.add(H);
        System.out.println("SET");
        System.out.println(studentSet);




    }

}
