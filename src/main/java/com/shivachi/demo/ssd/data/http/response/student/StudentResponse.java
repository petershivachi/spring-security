package com.shivachi.demo.ssd.data.http.response.student;

import com.shivachi.demo.ssd.data.student.StudentData;
import lombok.*;

import java.util.List;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentResponse {
    @Builder.Default
    private StudentData studentData = null;
}
