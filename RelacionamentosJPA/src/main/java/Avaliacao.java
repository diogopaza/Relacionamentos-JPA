import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Avaliacao {
	@Id
	@GeneratedValue
	private long id;
	
	private String disciplina;
	
	@OneToOne
	private Aluno aluno;

}
