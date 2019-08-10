package com.minseo.resttodo.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor  //기본 생성자
@Builder
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
public class Todo {
    private Integer id;
    private String name;
    private String desc;
    private Status status =Status.READY;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


}
