package br.com.alura.java.io.teste;

import java.io.*;


public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException  {
		
	    //fazendo o input
		InputStream fis = new FileInputStream("lorem.txt");
		// lendo o arquivo
        Reader isr = new InputStreamReader(fis);
        // transformando os bites em caracteres
        BufferedReader br = new BufferedReader(isr);
        
        OutputStream fos = new FileOutputStream("lorem2.txt");
    	Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter (osw);
        
    	
		// variavel linha 
        String linha = br.readLine();
        
        //mostrand cada linha do arquivo
        while(linha != null && !linha.isEmpty()) {
                bw.write(linha);
                bw.newLine();
                bw.flush();
                linha = br.readLine();
        }

       

        br.close();
        bw.close();


	
        
        
	}

}
