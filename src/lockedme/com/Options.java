package lockedme.com;

public class Options {
	public static void printWelcomeScreen(String application, String developerName) {
		String companyDetails = String.format("$$ Welcome to %s.com. \n" + "$$This application was developed by %s.\n"
				+ "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n", application, developerName);
		String appF = "You can use this application to :-\n"
				+ "• Retrieve all file names\n"
				+ "• Search, add, or delete files\n"
				+ "\nPlease ensure that the correct filename is provided for searching or deleting\n"+ "\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n";
		System.out.println(companyDetails);

		System.out.println(appF);
	}

	public static void displayMenu() {
		String menu = "\n Select any option number from below and press Enter\n"
				+ "1) Retrieve all files inside\n" + "2) Display menu for File operations\n"
				+ "3) Exit program\n";
		System.out.println(menu);

	}

	public static void displayFileOptions() {
		String fileMenu = "\n Select any option number from below and press Enter\n"
				+ "1) Add a user specified file to the application\n" + "2) Delete a user specified file from the application\n"
				+ "3) Search a user specified file from the application\n" + "4) Show Previous Option\n" + "5) Close the Application\n";

		System.out.println(fileMenu);
	}


}
