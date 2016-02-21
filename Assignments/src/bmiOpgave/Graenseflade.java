package bmiOpgave;

public class Graenseflade {

	public static void main(String [ ] args)
	{
		Data d = new Data();
		Funktionalitet f = new Funktionalitet(d);
		System.out.println(f.getNavn("234567-8901"));
		System.out.println(f.getBMI("2345627-8901"));
		System.out.println(f.getNavn("456789-0123"));
		System.out.println(f.getTextualBMI("456789-0123"));
		System.out.println(f.getNavn("123456-7890"));
		System.out.println(f.getBMI("123456-7890"));
	}

}
