package com.yit.bookstore.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class BookOrderRequest {

    private List<Integer> bookIdList;
    private String username;

}
