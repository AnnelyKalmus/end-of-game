package com.example.endofgame.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "CATEGORIES")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Category {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    //please do not use GenerationType.AUTO:
   // @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;

    private String name;

    private LocalDateTime creationTimestamp;

    private LocalDateTime updateTimestamp;


}
