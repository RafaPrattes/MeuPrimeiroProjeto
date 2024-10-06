package br.com.rafaela.main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import br.com.rafaela.livroFilme.LivroFilme;
import br.com.rafaela.recomendador.Recomendador;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recomendador recomendador = new Recomendador();

        // Lista de gêneros e tipos válidos
        List<String> generosValidos = Arrays.asList("ação", "comédia", "romance", "ficção científica", "fantasia", "drama", "aventura", "terror", "suspense", "biografia", "filosofia", "histórico", "infantil", "distopia");
        List<String> tiposValidos = Arrays.asList("livros", "livro", "filmes", "filme");

        String genero;
        String tipo;
        List<LivroFilme> recomendacoes;

        // Loop para garantir que o usuário forneça entradas válidas
        while (true) {
            // Validação do gênero
            while (true) {
                System.out.println("Qual gênero você prefere? ");
                genero = scanner.nextLine().toLowerCase();  // Converte a entrada para minúsculo
                if (generosValidos.contains(genero)) {
                    break;  // Se o gênero for válido, sai do loop
                } else {
                    System.out.println("Gênero inválido. Tente novamente.");
                }
            }

            // Validação do tipo
            while (true) {
                System.out.println("Você prefere livros ou filmes?");
                tipo = scanner.nextLine().toLowerCase();  // Converte a entrada para minúsculo
                if (tiposValidos.contains(tipo)) {
                    break;  // Se o tipo for válido, sai do loop
                } else {
                    System.out.println("Tipo inválido. Tente novamente.");
                }
            }

            // Buscar recomendações com base nas entradas do usuário
            recomendacoes = recomendador.recomendar(genero, tipo);

            // Se não houver recomendações, informar e pedir nova entrada
            if (recomendacoes.isEmpty()) {
                System.out.println("Nenhuma recomendação encontrada para esse gênero e tipo. Por favor, tente novamente.");
            } else {
                // Se houver recomendações, sair do loop
                break;
            }
        }

        // Exibir as recomendações encontradas
        System.out.println("Recomendações:");
        for (LivroFilme item : recomendacoes) {
            System.out.println("- " + item.getTitulo());
        }
        
        scanner.close();
    }
}
