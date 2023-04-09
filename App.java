package week5HW;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AstreriskLogger astreriskLogger = new AstreriskLogger()
;
		System.out.println("AsteriskLogger:");
		astreriskLogger.log("Hello");
		astreriskLogger.log("Ash Ketchum");
		
		
		SpacedLogger spacedLogger = new SpacedLogger();
		System.out.println("\nSpacedLogger");
		spacedLogger.log("Hello");
		spacedLogger.log("Pikachu");
	}

}
