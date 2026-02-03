/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class GiaiPTBac1 {

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
		
		if(a == 0) {
			if(b == 0) {
				System.out.println("Phuong trinh vo nghiem");
			}
			else {
				System.out.println("Phuong trinh vo so nghiem");
			}
		}else {
			double x = -b / a;
			System.out.println("Phuong trinh co nghiem: " + x);
		}
		
		sc.close();
	}

}
