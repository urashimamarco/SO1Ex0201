package Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
		
		public RedesController(){
			super();
		}
		
		//Retorne o SO em exec na maq.
		public String ip(){
			String os = System.getProperty("os.name");
			return "O sistema atual é:  " + os;
		}
		
		public void readProcess(String process3){
			try {
				Process p = Runtime.getRuntime().exec(process3);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null){
					if(linha.contains("IPv4"))
					{
						System.out.println(" ");
						System.out.println("Endereço IPv4:");
						System.out.println(linha);
						System.out.println(" ");
					}
					linha = buffer.readLine();
				}	
							
				}catch (IOException e) {
				e.printStackTrace();
				}
	 	}
		
		public void readProcess2(String process4){
			try {
				Process p = Runtime.getRuntime().exec(process4);
				InputStream fluxo = p.getInputStream();
				InputStreamReader leitor = new InputStreamReader(fluxo);
				BufferedReader buffer = new BufferedReader(leitor);
				String linha = buffer.readLine();
				while (linha != null){
					if (linha.contains("M‚dia"))
					{
						System.out.println("Tempo médio: "+ linha);
					}
					linha = buffer.readLine();
				}	
				}catch (IOException e) {
				e.printStackTrace();
				}
	 	}
	}

