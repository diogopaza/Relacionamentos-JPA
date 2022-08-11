import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Aluno {

	@Id
	@GeneratedValue
	private long codigo;
	
	private String nome;
	
	@OneToOne(mappedBy="aluno")
	Avaliacao avaliacao;
	
	
	
	
}
