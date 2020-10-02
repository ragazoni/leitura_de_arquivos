 package leitura_de_arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LeituraDeArquivos {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<>();
		
		String tarefa;
		int i = 0;
		
		while (true) {
			System.out.println("Tarefa " + i + ":");
			tarefa = scanner.nextLine();
			
			if ("x".equals(tarefa)) {
				break;
			}
			
			linhas.add(tarefa);
			i++;
		}
		
		escrevaArquivo("C:/files/lista-de-tarefas.xls", linhas);
		
		scanner.close();
		
		System.out.println("...fim de arquivo");

	}
	
	static void escrevaArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}
}
