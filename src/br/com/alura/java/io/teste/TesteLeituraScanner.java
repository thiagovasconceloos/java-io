package br.com.alura.java.io.teste;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class TesteLeituraScanner {

	public static void main(String[] args) throws Exception  {
		
	  Scanner scanner = new Scanner(new File("contas.csv"));
        
      String linha =  scanner.nextLine();
      System.out.println(linha);
      
      

      while(scanner.hasNextLine()){
              
              linha = scanner.nextLine();
              System.out.println(linha);
              
              Scanner linhaScanner = new Scanner(linha);
              linhaScanner.useLocale(Locale.US);
              
              linhaScanner.useDelimiter(",");
              
              String valor1 = linhaScanner.next();
              int valor2 = linhaScanner.nextInt();
              int valor3 = linhaScanner.nextInt();
              String valor4 = linhaScanner.next();
              double valor5 = linhaScanner.nextDouble();
          
              
              linhaScanner.close();
           
              
      }
	
        
        scanner.close();
	}

}
