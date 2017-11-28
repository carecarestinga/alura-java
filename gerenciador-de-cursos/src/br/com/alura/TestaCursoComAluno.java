package br.com.alura;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as cole��es da Java", "Paullo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criado uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com cole��es", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		

	}

}
