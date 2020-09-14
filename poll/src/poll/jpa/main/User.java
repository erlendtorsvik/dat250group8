package poll.jpa.main;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String username;
	private String password;
	
	@OneToMany(mappedBy=...)
	private List<Poll> polls = new ArrayList<>();
	
	@OneToMany(mappedBy...)
	private List<Vote> votes = new ArrayList<>();
}
