/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class LapPhuong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		
		double thetich = a * a * a;
		
		System.out.println("The tich khoi lap phuong la: " + thetich);
		
		sc.close();

	}

}
