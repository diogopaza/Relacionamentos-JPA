import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Categoria {
	@Id
	@GeneratedValue
	private long codigo; 
	
	private String descricao;
	
	@OneToMany(mappedBy="categoria")
	private List<Evento> eventos;

}
