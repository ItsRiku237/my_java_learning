class J_28_diff_exception{
	public static void main(String args[]){
		
		int[] arr = {10,20,30};
		
		System.out.println("Program Start !!");
		try {
			System.out.println("arr[5] = "+ arr[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic error occured !!");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of range !!");
		}
		finally{
			System.out.println("This block always execute.");
		}
		System.out.println("Program End !!");
	}
}