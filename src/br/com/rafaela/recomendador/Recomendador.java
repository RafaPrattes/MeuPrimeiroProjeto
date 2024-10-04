package br.com.rafaela.recomendador;
import  java.util.ArrayList;
import java.util.List;
import br.com.rafaela.livroFilme.LivroFilme;

public class Recomendador {
	private List<LivroFilme> catalogo;
	
	public Recomendador() {
		catalogo = new ArrayList<>();
		//Livros
		 	catalogo.add(new LivroFilme("O Senhor dos Anéis", "Fantasia", "livro"));
	        catalogo.add(new LivroFilme("O Hobbit", "Fantasia", "livro"));
	        catalogo.add(new LivroFilme("Orgulho e Preconceito", "Romance", "livro"));
	        catalogo.add(new LivroFilme("Dom Quixote", "Aventura", "livro"));
	        catalogo.add(new LivroFilme("1984", "Ficção Científica", "livro"));
	        catalogo.add(new LivroFilme("Crime e Castigo", "Drama", "livro"));
	        catalogo.add(new LivroFilme("O Apanhador no Campo de Centeio", "Ficção", "livro"));
	        catalogo.add(new LivroFilme("Moby Dick", "Aventura", "livro"));
	        catalogo.add(new LivroFilme("Guerra e Paz", "Histórico", "livro"));
	        catalogo.add(new LivroFilme("A Revolução dos Bichos", "Fábula", "livro"));
	        catalogo.add(new LivroFilme("O Grande Gatsby", "Romance", "livro"));
	        catalogo.add(new LivroFilme("Os Miseráveis", "Histórico", "livro"));
	        catalogo.add(new LivroFilme("Jane Eyre", "Romance", "livro"));
	        catalogo.add(new LivroFilme("O Morro dos Ventos Uivantes", "Romance", "livro"));
	        catalogo.add(new LivroFilme("O Diário de Anne Frank", "Biografia", "livro"));
	        catalogo.add(new LivroFilme("A Metamorfose", "Ficção", "livro"));
	        catalogo.add(new LivroFilme("O Alquimista", "Filosofia", "livro"));
	        catalogo.add(new LivroFilme("O Pequeno Príncipe", "Infantil", "livro"));
	        catalogo.add(new LivroFilme("Harry Potter e a Pedra Filosofal", "Fantasia", "livro"));
	        catalogo.add(new LivroFilme("As Crônicas de Nárnia", "Fantasia", "livro"));
	        catalogo.add(new LivroFilme("Drácula", "Terror", "livro"));
	        catalogo.add(new LivroFilme("Frankenstein", "Terror", "livro"));
	        catalogo.add(new LivroFilme("O Médico e o Monstro", "Terror", "livro"));
	        catalogo.add(new LivroFilme("O Nome da Rosa", "Suspense", "livro"));
	        catalogo.add(new LivroFilme("O Conde de Monte Cristo", "Aventura", "livro"));
	        catalogo.add(new LivroFilme("A Divina Comédia", "Épico", "livro"));
	        catalogo.add(new LivroFilme("O Retrato de Dorian Gray", "Fantasia", "livro"));
	        catalogo.add(new LivroFilme("Fahrenheit 451", "Ficção Científica", "livro"));
	        catalogo.add(new LivroFilme("Admirável Mundo Novo", "Distopia", "livro"));
	        catalogo.add(new LivroFilme("O Sol é para Todos", "Drama", "livro"));
	        catalogo.add(new LivroFilme("Vinte Mil Léguas Submarinas", "Aventura", "livro"));
	        catalogo.add(new LivroFilme("A Ilha do Tesouro", "Aventura", "livro"));
	        catalogo.add(new LivroFilme("O Lobo das Estepes", "Filosófico", "livro"));
	        catalogo.add(new LivroFilme("O Código Da Vinci", "Suspense", "livro"));
	        catalogo.add(new LivroFilme("Percy Jackson e o Ladrão de Raios", "Fantasia", "livro"));
	        catalogo.add(new LivroFilme("A Menina que Roubava Livros", "Histórico", "livro"));
	        catalogo.add(new LivroFilme("Jogos Vorazes", "Distopia", "livro"));
	        catalogo.add(new LivroFilme("A Bússola de Ouro", "Fantasia", "livro"));
	        catalogo.add(new LivroFilme("A Casa dos Espíritos", "Ficção", "livro"));
	        catalogo.add(new LivroFilme("A Caverna", "Filosofia", "livro"));
	        catalogo.add(new LivroFilme("A Hora da Estrela", "Drama", "livro"));
	        catalogo.add(new LivroFilme("Ensaio sobre a Cegueira", "Filosofia", "livro"));
	        catalogo.add(new LivroFilme("O Senhor das Moscas", "Ficção", "livro"));
	        catalogo.add(new LivroFilme("O Jardim Secreto", "Infantil", "livro"));
	        catalogo.add(new LivroFilme("Memórias Póstumas de Brás Cubas", "Ficção", "livro"));
	        catalogo.add(new LivroFilme("Macunaíma", "Ficção", "livro"));
	        catalogo.add(new LivroFilme("O Alienista", "Ficção", "livro"));
	        catalogo.add(new LivroFilme("Grande Sertão: Veredas", "Ficção", "livro"));

	     //Filmes
	        catalogo.add(new LivroFilme("O Poderoso Chefão", "Crime", "filme"));
	        catalogo.add(new LivroFilme("Pulp Fiction", "Crime", "filme"));
	        catalogo.add(new LivroFilme("A Lista de Schindler", "Histórico", "filme"));
	        catalogo.add(new LivroFilme("O Senhor dos Anéis: O Retorno do Rei", "Fantasia", "filme"));
	        catalogo.add(new LivroFilme("Star Wars: O Império Contra-Ataca", "Ficção Científica", "filme"));
	        catalogo.add(new LivroFilme("Forrest Gump", "Drama", "filme"));
	        catalogo.add(new LivroFilme("Clube da Luta", "Drama", "filme"));
	        catalogo.add(new LivroFilme("A Origem", "Ficção Científica", "filme"));
	        catalogo.add(new LivroFilme("Matrix", "Ficção Científica", "filme"));
	        catalogo.add(new LivroFilme("Os Bons Companheiros", "Crime", "filme"));
	        catalogo.add(new LivroFilme("Gladiador", "Ação", "filme"));
	        catalogo.add(new LivroFilme("Vingadores: Ultimato", "Ação", "filme"));
	        catalogo.add(new LivroFilme("Jurassic Park", "Aventura", "filme"));
	        catalogo.add(new LivroFilme("E.T. O Extraterrestre", "Ficção Científica", "filme"));
	        catalogo.add(new LivroFilme("Cidadão Kane", "Drama", "filme"));
	        catalogo.add(new LivroFilme("O Cavaleiro das Trevas", "Ação", "filme"));
	        catalogo.add(new LivroFilme("Titanic", "Romance", "filme"));
	        catalogo.add(new LivroFilme("O Silêncio dos Inocentes", "Suspense", "filme"));
	        catalogo.add(new LivroFilme("Interstellar", "Ficção Científica", "filme"));
	        catalogo.add(new LivroFilme("O Resgate do Soldado Ryan", "Guerra", "filme"));
	        catalogo.add(new LivroFilme("Django Livre", "Faroeste", "filme"));
	        catalogo.add(new LivroFilme("Coringa", "Drama", "filme"));
	        catalogo.add(new LivroFilme("Parasita", "Drama", "filme"));
	        catalogo.add(new LivroFilme("O Grande Truque", "Drama", "filme"));
	        catalogo.add(new LivroFilme("Brilho Eterno de uma Mente sem Lembranças", "Romance", "filme"));
	        catalogo.add(new LivroFilme("A Vida é Bela", "Comédia", "filme"));
	        catalogo.add(new LivroFilme("Bastardos Inglórios", "Guerra", "filme"));
	        catalogo.add(new LivroFilme("O Iluminado", "Terror", "filme"));
	        catalogo.add(new LivroFilme("Blade Runner 2049", "Ficção Científica", "filme"));
	        catalogo.add(new LivroFilme("La La Land", "Musical", "filme"));
	        catalogo.add(new LivroFilme("O Pianista", "Guerra", "filme"));
	        catalogo.add(new LivroFilme("Cisne Negro", "Suspense", "filme"));
	        catalogo.add(new LivroFilme("Her", "Romance", "filme"));
	        catalogo.add(new LivroFilme("O Lobo de Wall Street", "Drama", "filme"));
	        catalogo.add(new LivroFilme("Whiplash", "Drama", "filme"));
	        catalogo.add(new LivroFilme("Rocky", "Esporte", "filme"));
	        catalogo.add(new LivroFilme("O Sexto Sentido", "Suspense", "filme"));
	        catalogo.add(new LivroFilme("Os Infiltrados", "Crime", "filme"));
	        catalogo.add(new LivroFilme("Um Sonho de Liberdade", "Drama", "filme"));
	        catalogo.add(new LivroFilme("Se Beber, Não Case", "Comédia", "filme"));
	        catalogo.add(new LivroFilme("O Senhor dos Anéis: A Sociedade do Anel", "Fantasia", "filme"));
	        catalogo.add(new LivroFilme("V de Vingança", "Ação", "filme"));
	        catalogo.add(new LivroFilme("Até o Último Homem", "Guerra", "filme"));
	        catalogo.add(new LivroFilme("Shrek", "Animação", "filme"));
	        catalogo.add(new LivroFilme("Toy Story", "Animação", "filme"));
	    }

	    public List<LivroFilme> getCatalogo() {
	        return catalogo;
	}
	    public List<LivroFilme> recomendar(String genero, String tipo) {
	        List<LivroFilme> recomendacoes = new ArrayList<>();
	        
	        for (LivroFilme item : catalogo) {
	            if (item.getGenero().equalsIgnoreCase(genero) && item.getTipo().equalsIgnoreCase(tipo)) {
	                recomendacoes.add(item);
	            }
	        }
	        return recomendacoes;
	    }
}
