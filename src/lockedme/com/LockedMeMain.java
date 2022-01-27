package lockedme.com;

public class LockedMeMain {

	public static void main(String[] args) {
		
		Operations.createMainFolderIfNotPresent("main");
		Options.printWelcomeScreen("LockedMe", "Anupreet Kaur");
		ManageOptions.ManageWelcomeScreenInput();
	}

}
