package Test;

public class Test {

	public static void main(String[] args) {
		String str = "programming";
		String reverse = "";
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			reverse = c+reverse;
		}

		System.out.println(reverse);
	}

}
