import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CriaAvaliacoes {
	public static void main(String[] args) {
		EntityManager manager = ConexaoBanco.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Diogo");
		manager.persist(aluno1);
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Beto");
		manager.persist(aluno2);
		Aluno aluno3 = new Aluno();
		aluno3.setNome("João");
		manager.persist(aluno3);		
		
		Avaliacao avaliacao1 = new Avaliacao();
		avaliacao1.setAluno(aluno1);
		avaliacao1.setDisciplina("Portugues");
		
		Avaliacao avaliacao2 = new Avaliacao();
		avaliacao2.setAluno(aluno2);
		avaliacao2.setDisciplina("Inglês");
		
		Avaliacao avaliacao3 = new Avaliacao();
		avaliacao3.setAluno(aluno3);
		avaliacao3.setDisciplina("Espanhol");
		/*
		Avaliacao avaliacao4 = new Avaliacao();
		avaliacao4.setAluno(aluno1);
		avaliacao4.setDisciplina("Matematica");*/
		
		manager.persist(avaliacao1);
		manager.persist(avaliacao2);
		manager.persist(avaliacao3);
		//manager.persist(avaliacao4);
		tx.commit();
		ConexaoBanco.close();
		
		
	}
	

}
