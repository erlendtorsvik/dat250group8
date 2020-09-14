package poll.jpa.main;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data

public class Poll {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String title;
	// private timespamp created_at; 
	// private timespamp finishes_at;
	private boolean is_private;
	private int green;
	private int red; 
	

}
