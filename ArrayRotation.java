package javaPractice;
import java.util.*;

public class ArrayRotation {
	public static void rotation(int[] arr, int n, int d){
		for(int i = 0; i < d; i++){
			rotationByOne(arr, n);
		}
	}
	
	public static void rotationByOne(int[] arr, int n){
		int temp = arr[0];
		for(int i = 0; i < n-1; i++){
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n;
		int d;
		n = sc.nextInt();
		System.out.println("enter n");
		d = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter array");
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		rotation(arr, n, d);
		for(int i = 0; i < n; i++){
			System.out.println(arr[i]);
		}
	}

}