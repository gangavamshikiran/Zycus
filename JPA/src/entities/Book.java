package entities;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.CascadeType.MERGE;

@Entity
public class Book extends Item{

	

	@Column(length = 15)
	private String isbn;

	@Column(name = "nb_of_pages")
	private Integer nbOfPage;

	@Column(name = "publication_date")
	private LocalDate publicationDate;

	@OneToMany(cascade=ALL)
	private Set<Author> authors;
	
	public Book() {
		super();
	}


	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNbOfPage() {
		return nbOfPage;
	}
	
	public Book(String title, String description, Float unitCost,String isbn, Integer nbOfPage, LocalDate publicationDate, Set<Author> authors) {
		super(title,description,unitCost);
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
		this.authors = authors;
	}

	
	public Book(String isbn, Integer nbOfPage, LocalDate publicationDate, Set<Author> authors) {
		super();
		this.isbn = isbn;
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
		this.authors = authors;
	}
	


	public Book(Integer nbOfPage, LocalDate publicationDate, Set<Author> authors) {
		super();
		this.nbOfPage = nbOfPage;
		this.publicationDate = publicationDate;
		this.authors = authors;
	}

	

	public Set<Author> getAuthors() {
		return authors;
	}


	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}


	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	@Override
	public String toString() {
		return "\n\t Book [isbn=" + isbn + ", nbOfPage=" + nbOfPage + ", publicationDate=" + publicationDate + ", author="
				+ authors + "]";
	}

	

}

