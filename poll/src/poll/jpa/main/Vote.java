package poll.jpa.main;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data

public class Vote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	@ManyToOne
	private Poll poll;
	
	@ManyToOne 
	private User user;
}
