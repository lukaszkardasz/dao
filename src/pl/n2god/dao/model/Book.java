package pl.n2god.dao.model;

/**
 * @author n2god on 23/12/2019
 * @project dao
 */
public class Book {
	private String isbn;
	private String title;
	private String description;

	public Book() {
	}

	public Book(String isbn, String title, String description) {
		this.isbn = isbn;
		this.title = title;
		this.description = description;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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
}
