package entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="getAll",query="select a from Author a"),
	@NamedQuery(name="getByName",query="select a from Author a where a.firstName= :name"),
//	@NamedQuery(name="",query=""),
//	@NamedQuery(name="",query=""),
	
})
public class Author {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "first_name", length = 50)
	private String firstName;
	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(length = 5000)
	private String bio;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

	
	
	public Author() {
		super();
	}

	public Author(Long id, String firstName, String lastName, String bio, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateOfBirth = dateOfBirth;
	}

	public Author(String firstName, String lastName, String bio, LocalDate dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.dateOfBirth = dateOfBirth;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "\n\t Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", bio=" + bio
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	
	
}
