/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class SinhVien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Nhap ho va ten sinh vien: ");
		String HoTen = sc.nextLine();
		
		System.out.print("Nhap diem trung binh: ");
		double DiemTB = sc.nextDouble();
		
		
		System.out.println("----THONG TIN SINH VIEN-------");
		System.out.println("Ho va ten: "+HoTen);
		System.out.println("Diem trung binh: "+DiemTB);
		
		sc.close();

	}

}
