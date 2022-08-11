import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.*;

@Entity
@Getter
@Setter
public class Evento {
	@Id
	@GeneratedValue
	private long codigo; 	
	
	private String nome;
	
	@ManyToOne	
	private Categoria categoria;
	
	
	

}
