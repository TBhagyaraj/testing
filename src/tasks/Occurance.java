package tasks;

public class Occurance {

	public static void main(String[] args) {
		String str="vyshnavibatchu";
		char ch='v';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
			}
		System.out.println(count);

	}

}
