package poll.jpa.main;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data

public class Vote {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private Poll polls; 
	
}
