package week5HW;

public class SpacedLogger {

	
	public void log(String str) {
		String spaced = " ";
		for (int i = 0; i < str.length(); i++) {
			spaced += str.charAt(i) + " ";
		}
		System.out.println(spaced);
	}

	public void error(String str) {
		String spaced = " ";
		for(int i = 0; i < str.length(); i++) {
			spaced += str.charAt(i) + " ";
		}
		System.out.println("Error: " + spaced);
	}
}