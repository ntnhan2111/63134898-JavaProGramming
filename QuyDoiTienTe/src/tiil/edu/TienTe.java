/**
 * 
 */
package tiil.edu;

import java.util.Scanner;

/**
 * 
 */
public class TienTe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Chon loai tien can doi (1 hoac 2): ");
		int choice = sc.nextInt();
		
		System.out.print("Chon so tien can doi: ");
		double amount = sc.nextDouble();
		
		double vnd;
		
		switch(choice) {
		case 1:
            vnd = amount * 23500;
            System.out.println(amount + " USD = " + vnd + " VND");
            break;
        case 2:
            vnd = amount * 27000;
            System.out.println(amount + " EUR = " + vnd + " VND");
            break;
        default:
            System.out.println("Lựa chọn không hợp lệ!");
		}
		
		sc.close();

	}

}
