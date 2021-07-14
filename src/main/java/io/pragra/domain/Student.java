package io.pragra.domain;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class Student {

private  int age ;
private  String name;
private  int studentID;
private List<Course> courses;
private Instant createDate;// instant is a class that has time



}
