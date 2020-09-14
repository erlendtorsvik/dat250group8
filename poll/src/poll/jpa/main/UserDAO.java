package poll.jpa.main;
import javax.persistence.*;

public class UserDAO {
	
	@PersistenceContext
	EntityManager em;
	
	void create(User user) {
		em.persist(user);
	}
	
	Optional<User> find(int id) {
		return em.find(User.class, id);
	}
	
	void save(User user) {
		em.save(user);
	}
	
	void update(User user) {
		em.merge(user);
	}
	
	void delete(User user) {
		// This probably won't work unless we use cascade something
		// Does em.delete even exist?
		em.delete(user);
	}
	
	
}
