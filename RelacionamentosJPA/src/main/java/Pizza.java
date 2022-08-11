import java.util.ArrayList;
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
public class Pizza {
	@Id
	@GeneratedValue
	long codigo;
	
	private String nome;

	@ManyToMany
	private List<Ingrediente> ingrediente = new ArrayList<>();
	
	public void adicionaIngrediente(Ingrediente i) {
		this.ingrediente.add(i);
	}
}
