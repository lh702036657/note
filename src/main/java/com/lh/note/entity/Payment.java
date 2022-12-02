package com.lh.note.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :lh
 * @Date: 2022-12-02 17:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    private Integer id;

    private String name;

    private Integer age;

    private String phone;

    private String email;

    private String address;
}
