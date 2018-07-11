package reading.sportcode.pl;

import java.util.Scanner;

public class Reading 
{
	public static void main(String[] args)
	{
		int number ;
		Scanner reading = new Scanner(System.in) ;
		System.out.println("Podaj liczbe calkowita a ja wyswietle ja na ekranie");
		number = reading.nextInt() ;
		System.out.println("Twoja liczba calkowita to "+number);
	}
}
