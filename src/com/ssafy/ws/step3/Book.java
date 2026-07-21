package com.ssafy.ws.step3;
import java.util.StringBuilder;
/**
 * 도서 정보를 나타내는 클래스
 */
public class Book {
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String desc;

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
		StringBuilde sb = new StringBuilder();
		sb.append("isbn: ").append(isbn).append("\n");
		sb.append("title: ").append(title).append("\n");
		sb.append("author: ").append(author).append("\n");
		sb.append("publisher: ").append(publisher).append("\n");
		sb.append("price: ").append(price).append("\n");
		sb.append("desc: ").append(desc);

		return st.toString();
	}

	//코드를 작성하세요.
}

