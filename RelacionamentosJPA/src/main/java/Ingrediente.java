import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ingrediente {
	@Id
	@GeneratedValue
	private long id;
	
	private String nomeIngrediente;
	
	@ManyToMany(mappedBy="ingrediente")
	List<Pizza> pizza;
	
}
