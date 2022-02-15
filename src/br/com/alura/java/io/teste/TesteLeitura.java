package br.com.alura.java.io.teste;

import java.io.*;


public class TesteLeitura {

	public static void main(String[] args) throws IOException  {
		
	    //fazendo o input
		InputStream fis = new FileInputStream("lorem.txt");
		// lendo o arquivo
        Reader isr = new InputStreamReader(fis);
        // transformando os bites em caracteres
        BufferedReader br = new BufferedReader(isr);
        
		
		// variavel linha 
        String linha = br.readLine();
        
        
     

        System.out.println(linha);

        br.close();
      


	
        
        
	}

}
