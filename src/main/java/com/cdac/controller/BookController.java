package com.cdac.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.dto.BookDto;

@RestController
@RequestMapping("api/v1/books")
public class BookController {
	
	@GetMapping
	public ResponseEntity<List<BookDto>> getBooks()
	{
		BookDto bto=BookDto.builder().title("core java").build();
		List<BookDto> blist=new ArrayList<>();
		blist.add(bto);
		
		return ResponseEntity.ok(blist);
		
	}

}
