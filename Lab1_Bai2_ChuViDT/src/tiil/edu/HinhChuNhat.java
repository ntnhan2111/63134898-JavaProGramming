/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class HinhChuNhat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap chieu dai: ");
		double a = sc.nextDouble();
		
		System.out.print("Nhap chieu rong: ");
		double b = sc.nextDouble();
		
		double ChuVi = (a + b) * 2;
		double DienTich = a * b;
		
		System.out.println("---KET QUA----");
		System.out.println("Chu vi hinh chu nhat: " + ChuVi);
		System.out.println("Dien tich hinh chu nhat: " + DienTich);
		
		sc.close();
	}

}
