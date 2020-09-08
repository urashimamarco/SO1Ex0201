package View;

import Controller.RedesController;

public class Main {

	public static void main(String[] args) {
	
		RedesController procController = new RedesController();
		String ip = procController.ip();
		System.out.print(ip);
		//System.out.println("");
		
		String process3 = "ipconfig";
		procController.readProcess(process3);
		
		String process4 = "PING  www.google.com.br";
		System.out.println("O tempo médio " + process4 +"  é : ");
		procController.readProcess2(process4);
	}
}
