package anhembiMorumbi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		System.out.println("What do you wanna do?");
		
		Scanner sc = new Scanner(System.in);
		
		
		int resp = sc.nextInt();
	do {
		int x = sc.nextInt();
		switch(x){
			case 1:
				System.out.println("Informe nome:");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Informe data");
			try {
				Date data = sdf.parse(sc.next());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				System.out.println("Informe genero");
				sc.nextLine();
				String genero = sc.nextLine();
				System.out.println("Informe nome do diretor");
				String diretor = sc.nextLine();
				System.out.println("Classificação indicativa: ");
				int classificacao = sc.nextInt();
				break;
		}
	} while(resp!=6);
	}

}
