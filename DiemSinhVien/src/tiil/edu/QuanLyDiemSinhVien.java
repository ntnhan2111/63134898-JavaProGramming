/**
 * 
 */
package tiil.edu;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 
 */
public class QuanLyDiemSinhVien {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Double> DanhSachDiem = new ArrayList<>();
		
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print("Nhap diem sinh vien " + (i + 1) + ": ");
			double diem = sc.nextDouble();
			DanhSachDiem.add(diem);
		}
		
		System.out.println("\n Danh sach diem: ");
		DanhSachDiem.forEach(d -> System.out.print(d + " "));
		
		double TrungBinh = DanhSachDiem.stream().mapToDouble(Double::doubleValue).average().orElse(0);
		double CaoNhat = DanhSachDiem.stream().mapToDouble(Double::doubleValue).max().orElse(0);
		double ThapNhat = DanhSachDiem.stream().mapToDouble(Double::doubleValue).min().orElse(0);
		List<Double> SapXepTang = DanhSachDiem.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Diem trung binh " + TrungBinh);
		System.out.println("Diem cao nhat " + CaoNhat);
		System.out.println("Diem thap nhat " + ThapNhat);
		System.out.println("\n Danh sach diem tang dan ");
		SapXepTang.forEach(d -> System.out.print(d + " "));
		sc.close();

	}

}
