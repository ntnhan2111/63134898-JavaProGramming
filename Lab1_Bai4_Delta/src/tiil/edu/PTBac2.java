/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class PTBac2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap a: ");
		double a = sc.nextDouble();
		
		System.out.print("Nhap b: ");
		double b = sc.nextDouble();
		
		System.out.print("Nhap c: ");
		double c = sc.nextDouble();
		
		double delta = b * b - 4 * a * c;
		
		if(delta > 0) {
			double CanDelta = Math.sqrt(delta);
			
			System.out.println("Can bac hai cua delta la  " + CanDelta);
		}else {
			System.out.println("Khong co can bac hai cua delta la so am");
		}
		
		sc.close();

	}

}
