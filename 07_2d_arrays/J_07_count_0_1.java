import java.util.*;

public class J_07_count_0_1{
	public static void main(String args[]){
		int a[][] = {
				{0,1,0},
				{0,0,0},
				{0,1,1}
		};
		
		int count_0 = 0;
		int count_1 = 0;
		
		for(int i= 0; i<3; i++){
			for(int j= 0; j<3; j++){
				if(a[i][j] == 0){
					count_0 ++;
				}
				else 
				{
					count_1 ++;
				}
			}
		}
		
		for(int i= 0; i<3; i++){
			for(int j= 0; j<3; j++){
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("Total number of 'zero' in the matrix is : " + count_0);
		System.out.println("Total number of 'one' in the matrix is : " + count_1);
	}
}