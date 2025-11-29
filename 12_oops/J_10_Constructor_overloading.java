//write a java program to create
//a parrameterized constructor to assign volues name, regg. No,
//branch, section, address, phoneno. of student and show constructor overloading

import java.math.BigInteger;
import java.nio.channels.Pipe.SourceChannel;

public class J_10_Constructor_overloading {
    String name;
    double regd_no;
    String branch;
    String seaction;
    int phone_no;
    String addres;

    J_10_Constructor_overloading(String name ,double regd_no,String branch,String seaction,int phone_no,String addres){
        this.name = name;
        this.regd_no = regd_no;
        this.branch = branch ;
        this.addres = addres;
        this.seaction = seaction;
        this.phone_no =phone_no;
    }
    J_10_Constructor_overloading(String name ,double regd_no,String branch,String seaction,int phone_no){
        this.name = name;
        this.regd_no = regd_no;
        this.branch = branch ;
        this.seaction = seaction;
        this.phone_no =phone_no;
    }
    J_10_Constructor_overloading(String name ,double regd_no,String branch){
        this.name = name;
        this.regd_no = regd_no;
        this.branch = branch ;
    }
    J_10_Constructor_overloading(String name ,double regd_no){
        this.name = name;
        this.regd_no = regd_no;
    }
    void details(){
        System.out.println("Name :"+name);
        System.out.println("Regd no : "+regd_no);
        System.out.println("Branch : "+branch);
        System.out.println("Section : "+seaction);
        System.out.println("Phone no. : "+phone_no);
        System.out.println("Addres : "+addres);
    }
    public static void main(String args[]){
        J_10_Constructor_overloading obj1 = new J_10_Constructor_overloading("Riku", 240111078 ,"CSE","B",123456,"Sonepur");
        J_10_Constructor_overloading obj2 = new J_10_Constructor_overloading("Suv", 240111101 ,"CSE","B",123456);
        J_10_Constructor_overloading obj3 = new J_10_Constructor_overloading("Dudoo", 24011181 ,"CSE");
        J_10_Constructor_overloading obj4 = new J_10_Constructor_overloading("Aaduu", 240111028);
        // import java.math.BigInteger;
        // BigInteger num = new BigInteger("123456789012345678901234567890");

        obj1.details();
        obj2.details();
        obj3.details();
        obj4.details();


    }
}
