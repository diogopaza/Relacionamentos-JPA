import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;

public class Listar {
	public static void main(String[] args) {
		EntityManager manager = ConexaoBanco.getEntityManager();
		// BigDecimal tipoEvento = new BigDecimal(4);
		/*
		 * List<Evento> eventos = manager.createQuery("from Evento" , Evento.class)
		 * .getResultList(); for(Evento evento : eventos) {
		 * System.out.println("Evento == " + evento.getNome() + "Categoria == " +
		 * evento.getCategoria().getDescricao()); }
		 */

		// Categoria categoria = manager.find(Categoria.class, 1L);
		/*
		 * List<Categoria> categorias =
		 * manager.createQuery("from Categoria").getResultList(); for(Categoria
		 * categoria : categorias) { System.out.println("Descrição: " +
		 * categoria.getDescricao() + "----- Eventos"); for(Evento evento :
		 * categoria.getEventos()) { System.out.println(evento.getNome()); } }
		 * 
		 * 
		 * 
		 * //System.out.println("Lista de eventos por categoria " +
		 * categoria.getDescricao()); /*for (Evento evento : categoria.getEventos()) {
		 * System.out.println("A categoria " + categoria.getDescricao() +
		 * " Possui o evento " + evento.getNome()); }
		 */
		Categoria c = manager.find(Categoria.class, 1L);
		List<Evento> eventos = c.getEventos();
		for (Evento evento : eventos) {
			System.out.println("Evento: " + evento.getNome());
		}

	}

}
