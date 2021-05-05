package com.example.LogisticDemo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ListItemDto {
    public ListItemDto(Long id2, String name) {
		// TODO Auto-generated constructor stub
	}
	private Long id;
    private String value;
}
