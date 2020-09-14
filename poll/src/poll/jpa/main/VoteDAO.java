package poll.jpa.main;
import javax.persistence.*;

public class VoteDAO {
	
	@PersistenceContext
	EntityManager em;
	
	void create(Vote vote) {
		em.persist(vote);
	}
	
	Optional<Vote> find(int id) {
		return em.find(Vote.class, id);
	}
	
	void save(Vote vote) {
		em.save(vote);
	}
	
	//void update(Vote vote) {
	//	em.merge(user);
	//}
}
