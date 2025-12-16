import java.util.*;

public class J_06_column_shift{
	public static void main(String args[]){
		int a[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("Before shifting (Original matrix): ");
		
		for(int i= 0; i<3; i++){
			for(int j= 0; j<3; j++){
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		int temp;
		
		for(int i= 0; i<3; i++){
			
				temp = a[i][0];
				a[i][0] = a[i][2];
				a[i][2] = temp;
		
		}
		
		System.out.println("After shifting : ");
		
		for(int i= 0; i<3; i++){
			for(int j= 0; j<3; j++){
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
			
		
	}
}