class Smart_phone {
	String company_name;
	String model_name;
	// public Smart_phone(String company,String model){
	// company_name= company;
	// model_name = model;
	// }

	public void print() {
		System.out.println("Company Name : " + company_name);
		System.out.println("Model Name : " + model_name);
	}
}

class J_30_phone {
	public static void main(String args[]) {
		// Smart_phone s1 = new Smart_phone("Motorla","moto g_45");
		Smart_phone s1 = new Smart_phone();
		s1.company_name = "Motorla";
		s1.model_name = "moto g_45";
		s1.print();

		// Smart_phone s2 = new Smart_phone("xiomi","Redmi 12");
		Smart_phone s2 = new Smart_phone();
		s2.company_name = "xiomi";
		s2.model_name = "Redmi 12";
		s2.print();

		// Smart_phone s3 = new Smart_phone("Oppo","Oppo A7");
		Smart_phone s3 = new Smart_phone();
		s3.company_name = "Oppo";
		s3.model_name = "Oppo A7";
		s3.print();

		// Smart_phone s4 = new Smart_phone("Samsung","S ultra");
		Smart_phone s4 = new Smart_phone();
		s4.company_name = "Samsung";
		s4.model_name = "S ultra";
		s4.print();

		// Smart_phone s5 = new Smart_phone("Nothing","Nothing a1");
		Smart_phone s5 = new Smart_phone();
		s5.company_name = "Nothing";
		s5.model_name = "Nothing a1";
		s5.print();

	}
}