/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.entity;

import lombok.*;

/**
 *
 * @author Huyen
 */
@NoArgsConstructor //constructor ko tham số
@AllArgsConstructor //constructor có full tham số
@Builder //tạo constructor tùy ý
@Data //Getter, setter, equal....
public class Category { 
    private String id; 
    private String name; 
} 
