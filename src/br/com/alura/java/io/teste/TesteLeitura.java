package br.com.alura.java.io.teste;

import java.io.*;


public class TesteLeitura {

	public static void main(String[] args) throws IOException  {
		//lendo o arquivo 
		FileReader fr = new FileReader("lorem.txt");
		// convertendo em caracteres.
        BufferedReader br = new BufferedReader(fr);
        
        String linha = br.readLine();

        while(linha != null) {
                System.out.println(linha);
                linha = br.readLine();
        }

        System.out.println(linha);

        br.close();
      


	
        
        
	}

}
