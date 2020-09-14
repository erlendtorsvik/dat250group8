package poll.jpa.main;
import javax.persistence.*;

public class PollDAO {
	
	@PersistenceContext
	EntityManager em;
	
	void create(Poll poll) {
		em.persist(poll);
	}
	
	Optional<Poll> find(int id) {
		return em.find(Poll.class, id);
	}
	
	void save(Poll poll) {
		em.save(poll);
	}
	
	void update(Poll poll) {
		em.merge(poll);
	}
}
