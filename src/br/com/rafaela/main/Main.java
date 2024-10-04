package br.com.rafaela.main;

import java.util.List;
import java.util.Scanner;
import br.com.rafaela.livroFilme.LivroFilme;
import br.com.rafaela.recomendador.Recomendador;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Recomendador recomendador = new Recomendador();

	        System.out.println("Qual gênero você prefere? ");
	        String genero = scanner.nextLine();
	        System.out.println("Você prefere livro ou filme?");
	        String tipo = scanner.nextLine();

	        List<LivroFilme> recomendacoes = recomendador.recomendar(genero, tipo);
	        System.out.println("Recomendações:" );
	        
	        for (LivroFilme item : recomendacoes) {
	            System.out.println("- " + item.getTitulo());
	        }
	        scanner.close();
	}
}
