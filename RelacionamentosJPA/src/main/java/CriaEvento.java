import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class CriaEvento {
	public static void main(String[] args) {
		EntityManager manager = ConexaoBanco.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		Categoria festaReligiosa = new Categoria();
		festaReligiosa.setDescricao("Festareligiosa");

		Categoria pagode = new Categoria();
		pagode.setDescricao("Pagode");
		

		manager.persist(festaReligiosa);
		manager.persist(pagode);

		Evento eventoA = new Evento();
		eventoA.setNome("Festa Igreja Santo Antonio");
		eventoA.setCategoria(festaReligiosa);

		Evento eventoB = new Evento();
		eventoB.setNome("Festa Igreja Maria Luiza");
		eventoB.setCategoria(festaReligiosa);

		Evento eventoC = new Evento();
		eventoC.setNome("Pagode na quebrada");
		eventoC.setCategoria(pagode);

		manager.persist(eventoA);
		manager.persist(eventoB);
		manager.persist(eventoC);
		tx.commit();
		ConexaoBanco.close();

	}

}
