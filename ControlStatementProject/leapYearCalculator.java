package ControlStatementProject;
import java.util.Scanner;

public class leapYearCalculator {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// Variable
		int month, day = 0, year;
		String keterangan;
		
		System.out.println("\t----------------------------------------");
		System.out.println("\t|         leap Year Calculator         |");
		System.out.println("\t----------------------------------------");
		System.out.print("\n\tMasukkan bulan (1-12) : ");
		month = in.nextInt();
		System.out.print("\tMasukkan tahun (1980-2099) : ");
		year = in.nextInt();
		
		switch(month){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				day = 31;
				break;
			case 4: case 6: case 9: case 11:
				day = 30;
				break;
			case 2:
				day = (year%4 == 0 && year%100 != 0 || year%400 == 0)? 29:28;
				break;
			default:
				System.out.println("Invalid input");
				System.exit(0);
		}
		keterangan = (day%2 == 0)? "genap":"ganjil";
		System.out.println("\n");
		System.out.println("\t----------------------------------------");
		System.out.println("\t|                 Hasil                |");
		System.out.println("\t----------------------------------------");
		System.out.println("\n\tPada tahun " + year + " bulan " + month);
		System.out.println("\tMemiliki " + day + " jumlah hari");
		System.out.println("\tMerupakan bulan " + keterangan);
		in.close();
	}
}
