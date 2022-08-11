import java.util.List;

import javax.persistence.EntityManager;

public class ListaPizza {
	public static void main(String[] args) {
		EntityManager manager = ConexaoBanco.getEntityManager();
		Ingrediente ingrediente = manager.find(Ingrediente.class, 2L);
		System.out.println("INGREDIENTE:" + ingrediente.getNomeIngrediente());

		for (Pizza pizza : ingrediente.getPizza()) {
			System.out.println("Pizza: " + pizza.getNome());
		}
		
		Pizza pizza = manager.find(Pizza.class, 5L);
		for (Ingrediente ingredienteNaPizza : pizza.getIngrediente()) {
			System.out.println(ingredienteNaPizza.getNomeIngrediente());
		}

	}
}
