package chapter15;

public class compareStr {

	public static void main(String[] args) {
		compareStr sample = new compareStr();
		sample.checkCompare();
	}
	
	public void checkCompare() {
		String text = "Check value";
		String text2 = "Check value";
		
		if(text == text2) {
			System.out.println("text == text2 result is same");
		} else {
			System.out.println("text == text2 result is different");
		}
		
		if(text.equals("Check value")) {
			System.out.println("text.equals(text2) result is same");
		}
		
		String text3 = "check value";
		if(text.equalsIgnoreCase(text3)) {
			System.out.println("text.equalsIgnoreCase(text3) result is same");
		}
	}

}
