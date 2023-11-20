package Azterketa;

import java.util.ArrayList;
import java.util.Scanner;

public class Azkerketa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int zenbakia = 0;
		int batazbestekoa = 0;
		
		ArrayList<Integer> Zenbakiak = new ArrayList<Integer>();
		
		do {
			
			System.out.println("Sartu nahi dituzun zenbakiak, bukatzeko, 0 sartu"); 			
			zenbakia = sc.nextInt();
			
			if (zenbakia != 0) {
				Zenbakiak.add(zenbakia);
				batazbestekoa = batazbestekoa + zenbakia;
			}

		}	while (zenbakia != 0);
		
		System.out.println("Exekuzioa bukatu da"); 
		System.out.println("Sorturiko zerrenda: " + Zenbakiak); 
		System.out.println("Batabesteakoa: " + batazbestekoa / Zenbakiak.size()); 
	}
}
