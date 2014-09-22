package idv.hsiehpinghan.web.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Book {
	private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public static List<Book> genBooks() {
		List<Book> books = new ArrayList<>();

		for (int i = 0; i < 3; ++i) {
			Book book = new Book();
			book.setId(Long.valueOf(i));
			book.setTitle("title_" + i);
			book.setDescription("description_" + i);
			book.setPrice(BigDecimal.valueOf(i));

			books.add(book);
		}

		return books;
	}
	
	public static Book genBook() {
		Book book = new Book();
		book.setId(Long.valueOf(99));
		book.setTitle("title_99");
		book.setDescription("description_99");
		book.setPrice(BigDecimal.valueOf(99));
		return book;
	}
}
