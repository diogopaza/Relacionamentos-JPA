import javax.persistence.EntityManager;

public class TestaAvaliacao {
	public static void main(String[] args) {
		EntityManager manager = ConexaoBanco.getEntityManager();
		/*Avaliacao a = manager.find(Avaliacao.class, 5L);
		Aluno aluno = a.getAluno();
		System.out.println("O aluno �: " + aluno.getNome());*/
		
		Aluno aluno = manager.find(Aluno.class, 2L);
		Avaliacao a = aluno.getAvaliacao();
		System.out.println("A avalia��o �: " + a.getAluno().getNome());
	}
}
