import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CriaPizza {
	public static void main(String[] args) {
		{
			EntityManager manager = ConexaoBanco.getEntityManager();
			EntityTransaction tx = manager.getTransaction();
			tx.begin();
			
			Ingrediente mussarela = new Ingrediente();
			mussarela.setNomeIngrediente("mussarela");
			Ingrediente tomate = new Ingrediente();
			tomate.setNomeIngrediente("Tomate");
			Ingrediente presunto = new Ingrediente();
			presunto.setNomeIngrediente("presunto");
			Ingrediente ovo = new Ingrediente();
			ovo.setNomeIngrediente("ovo");			
			manager.persist(ovo);
			manager.persist(presunto);
			manager.persist(tomate);
			manager.persist(mussarela);
			
			Pizza napolitana = new Pizza();
			napolitana.setNome("napolitana");
			napolitana.adicionaIngrediente(mussarela);			
			napolitana.adicionaIngrediente(tomate);
			napolitana.adicionaIngrediente(presunto);			
			
			Pizza portuguesa = new Pizza();
			portuguesa.setNome("portuguesa");
			portuguesa.adicionaIngrediente(mussarela);
			portuguesa.adicionaIngrediente(ovo);
			portuguesa.adicionaIngrediente(presunto);	
			
			manager.persist(portuguesa);
			manager.persist(napolitana);			
			
			tx.commit();
			ConexaoBanco.close();
			
		}
	}
	
}
