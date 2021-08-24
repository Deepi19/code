package day09;

public class Array_Optional_Arg {
	
	public void bookTickets(String fName,String mName,String ...kids) {
		System.out.println("Father Name is : "+fName);
		System.out.println("Mother Name is : "+mName);
		if(kids.length==0) {
			System.out.println("No kids for couples!!!");
		}else {
			for(String kid:kids) {
				System.out.println("Kid Name is : "+kid);
			}
		}
	}
	

	public static void main(String[] args) {
		Array_Optional_Arg obj = new Array_Optional_Arg();
		obj.bookTickets("Mathan","Jaya");
		obj.bookTickets("Chandrasekaran","Selvarani","Ramesh","Mathan","Radi");
	}

}
