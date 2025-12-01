import java.io.*;

class BPUT{
	BPUT(){
		System.out.println("This is BPUT");
	}
}

class GCEK extends BPUT{
	GCEK(){
		System.out.println("This is GCEK");
	}
}

class CSE extends GCEK{
	CSE(){
		System.out.println("CSE Branch");
	}
}

class ETC extends GCEK{
	ETC(){
		System.out.println("ETC Branch");
	}
}

class EE extends GCEK{
	EE(){
		System.out.println("EE Branch");
	}
}

class ME extends GCEK{
	ME(){
		System.out.println("ME Branch");
	}
}

class C extends CSE{
	C(){
		System.out.println("Subject is C");
	}
}

class Java extends CSE{
	Java(){
		System.out.println("Subject is Java");
	}
}

class DSP extends ETC{
	DSP(){
		System.out.println("Subject is DSP");
	}
}

class Acc extends ETC{
	Acc(){
		System.out.println("Subject is Acc");
	}
}

class BEE extends EE{
	BEE(){
		System.out.println("Subject is BEE");
	}
}

class EM extends ME{
	EM(){
		System.out.println("Subject is EM");
	}
}

public class J_25_college_inheritance{
	public static void main(String[] args){
		C c=new C();
		System.out.println();
		Java j=new Java();
		System.out.println();
		DSP d=new DSP();
		System.out.println();
		Acc a=new Acc();
		System.out.println();
		BEE bee=new BEE();
		System.out.println();
		EM e=new EM();
	}
}