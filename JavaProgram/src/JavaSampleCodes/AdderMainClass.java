package JavaSampleCodes;

//Overloading

public class AdderMainClass {

	public static void main(String[] args) {
		
		Adder add=new Adder();
		
		add.sum();//1
		
		add.sum(10,10);//2
		
		add.sum(10.5,20);//4
		
		add.sum(20, 30.5);//3
		
		add.sum(10,10, 50);//5
	}

}
