/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class TienLuong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so gio lam: ");
		double hours = sc.nextDouble();
		
		System.out.print("Nhap luong: ");
		double rate = sc.nextDouble();
		
		double salary;
		
		if(hours <= 40) {
			salary = hours * rate;
		}else {
			double overtimeHours = hours - 40;
			salary = (40 * rate) + (overtimeHours * rate * 1.5);
		}
		
		System.out.println("Tong luong nhan vien la " + salary);
		
		sc.close();

	}

}
