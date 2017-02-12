package firstLesson;

import java.util.Scanner;
import java.util.*;

public class Init {
	public static String titi;

	public static void main(String[] args) {
		System.out.println("toto");
	}
	
	public String returnTiti(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Veillez saisir un mot de passe");
		String str = sc.nextLine();
		return "Vous avez saisi : "+ str;
		
	}

}
