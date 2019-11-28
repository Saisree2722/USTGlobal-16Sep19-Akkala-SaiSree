package com.ustglobal.springcore.config;

import com.ustglobal.springcore.di.Book;

public class BookConfigurationClass
{
	public Book getBook() {
		Book book = new Book();
		book.setAuthor("Maneesha");
		return book;

	}
}
