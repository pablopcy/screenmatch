package screenmatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {

	public static void main(String[] args) {
		Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
		meuFilme.avalia(9);
		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.avalia(6);
		Filme filmeDoPablo = new Filme("Truque de Mestre", 2009);
		filmeDoPablo.avalia(10);
		Serie lost = new Serie("Lost", 2000);
		
		List<Titulo> lista = new ArrayList<>();
		lista.add(filmeDoPablo);
		lista.add(meuFilme);
		lista.add(outroFilme);
		lista.add(lost);
		
		for(Titulo item : lista) {
			System.out.println(item.getNome());
			if (item instanceof Filme filme && filme.getClassificacao() > 2) {
				System.out.println("Classificação " + filme.getClassificacao());
			}
			
		}
		
		System.out.println("Lista de títulos ordenados");
		Collections.sort(lista);
		System.out.println(lista);
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println("Ordem por ano de lançamento:");
		System.out.println(lista);
		
	}

}
