package entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-demo");

		EntityManager em = factory.createEntityManager();
		
//		Author author = new Author("Vishal", "Shah", "Visal's bio", LocalDate.of(1999, 12, 12));
//		Author author1 = new Author("Akash", "Khandelia", "Akash's bio", LocalDate.of(1998, 5, 7));
//		Set<Author> authors = new HashSet<>();
//		authors.add(author);
//		authors.add(author1);
//		
		
//		Book book = new Book("Book1","Book 1's description",150.0f,"abc",100, LocalDate.of(2010, 1, 1), authors);
//		em.getTransaction().begin();
//		
//		
//		em.persist(book);
//		
//		
//		em.getTransaction().commit();
		
//		Query query = em.createQuery("select a from Author a",Author.class);
//		List<Author> list= query.getResultList();
//		
//		for(Author author: list) {
//			System.out.println(author);
//		}
		
		
		Query query = em.createNamedQuery("getByName",Author.class);
		query.setParameter("name", "Vishal");
		List<Author> allAuthors = query.getResultList();
		System.out.println(allAuthors);
		
		
		
		
	}
}
