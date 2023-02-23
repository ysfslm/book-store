package com.yit.bookstore.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Table
@Data
@Getter
@Setter
@Builder
@Entity(name = "bookOrder")
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String username;
    @Column
    @ElementCollection
    private List<Integer> bookIdList;

    private Double totalPrice;

    private LocalDate orderDate;

}
