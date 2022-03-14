package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome do arquivo:\n");
		String caminhoArquivo = sc.nextLine();
		
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream(caminhoArquivo);
			os = new FileOutputStream("copia de" + caminhoArquivo);
			byte[] buffer = new byte[1024];
			int length;
			while((length = is.read(buffer)) > 0){
				
			}
		}
		catch(Exception e) {
			System.out.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
		finally {
			is.close();
			os.close();
		}
		
		sc.close();
	}

}
