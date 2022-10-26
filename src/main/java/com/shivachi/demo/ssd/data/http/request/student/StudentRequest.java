package com.shivachi.demo.ssd.data.http.request.student;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentRequest implements Serializable {
    @Builder.Default
    private String message = HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase();
}
