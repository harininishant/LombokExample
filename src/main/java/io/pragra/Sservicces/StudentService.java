package io.pragra.Sservicces;

import io.pragra.domain.Student;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@ToString
public class StudentService {
    private List<Student> stu=new ArrayList<Student>();

    public boolean createStudent(Student S){
        return stu.add(S);
    }

    public Optional<Student>  findStudentByID(int studentID){

    return stu.stream().filter(s -> s.getStudentID() == studentID).findAny();

    }
     public void deleteStudent(int studentID){
         Optional<Student> any = stu.stream().filter(s -> s.getStudentID() == studentID).findAny();
         any.ifPresent(stu::remove);


}}
