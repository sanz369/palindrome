package week1.day2;

public class ReversingaString {

	public static void main(String[] args) {
		String name = "raknaS";
		
		char[] nameArray=name.toCharArray();
		for (int i = nameArray.length-1; i >=0 ; i--) {
			System.out.print(nameArray[i]);
		}
		
		
	}

}
