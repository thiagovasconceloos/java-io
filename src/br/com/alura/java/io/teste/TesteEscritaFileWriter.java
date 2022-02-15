package br.com.alura.java.io.teste;

import java.io.*;


public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException  {
		//lendo o arquivo 
//		OutputStream fos = new FileOutputStream("lorem2.txt");
//	
//        Writer osw = new OutputStreamWriter(fos);
//        
//        BufferedWriter bw = new BufferedWriter (osw);
//        
		
		BufferedWriter bw = new BufferedWriter (new FileWriter("lorem2.txt"));
		
		
        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod \r\n"
        		+ "");
        bw.newLine();
        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");



      
       bw.close();
        
	}

}
