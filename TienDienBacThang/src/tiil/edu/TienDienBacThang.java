/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class TienDienBacThang {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so dien thieu thu(kWh) : ");
		int kWh = sc.nextInt();
		
		double tienDien = tinhTienDien(kWh);
		
		System.out.printf("Tien dien phai tra: %,.0f VND%n", tienDien);
		
		

	}
	
	public static double tinhTienDien(int kWh) {
		double tien = 0;
		
		if(kWh <= 50) {
			tien = kWh * 1678;
		}else if(kWh <= 100) {
			tien = 50 * 1678 + (kWh - 50) * 1734;
		}else if(kWh <= 200) {
			tien = 50 * 1678 + 50 * 1734 + (kWh - 100) * 2014;
		}else if(kWh <= 300) {
			tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (kWh - 200) * 2536;
		}else if(kWh <= 400) {
			tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + (kWh - 300) * 2834;
		}else {
			tien = 50 * 1678 + 50 * 1734 + 100 * 2014 + 100 * 2536 + 100 * 2834 + (kWh - 400) * 2927;
		}
		return tien;
	}

}
