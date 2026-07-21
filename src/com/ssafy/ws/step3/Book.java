package com.ssafy.ws.step3;
import java.util.*;
/**
 * 도서 정보를 나타내는 클래스
 */
public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;

	public Book(){}
	public Book(String isbn, String title, String author, String publisher, int price, String desc){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}

	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(isbn).append("\t");
		sb.append(title).append("\t");
		sb.append(author).append("\t");
		sb.append(publisher).append("\t");
		sb.append(price).append("\t");
		sb.append(desc);

		return sb.toString();
	}
}

