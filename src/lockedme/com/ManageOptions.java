package lockedme.com;


import java.util.List;
import java.util.Scanner;

public class ManageOptions {
	public static void ManageWelcomeScreenInput() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Options.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					Operations.displayAllFiles("main");
					break;
				case 2:
					ManageOptions.ManageFileOptions();
					break;
				case 3:
					System.out.println("Program exited");
					running = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				ManageWelcomeScreenInput();
			} 
		} while (running == true);
	}
	
	public static void ManageFileOptions() {
		boolean running = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				Options.displayFileOptions();
				Operations.createMainFolderIfNotPresent("main");
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					
					System.out.println("Enter the name of the file to be added");
					String fileToAdd = sc.next();
					
					Operations.createFile(fileToAdd, sc);
					
					break;
				case 2:
					
					System.out.println("Enter the name of the file to be deleted");
					String fileToDelete = sc.next();
					
					Operations.createMainFolderIfNotPresent("main");
					List<String> filesToDelete = Operations.displayFileLocations(fileToDelete, "main");
					
					String deletionPrompt = "\nSelect index of which file to delete?"
							+ "\n(Enter 0 if you want to delete all elements)";
					System.out.println(deletionPrompt);
				
					int idx = sc.nextInt();
					
					if (idx != 0) {
						Operations.deleteFileRecursively(filesToDelete.get(idx - 1));
					} else {
						
					
						for (String path : filesToDelete) {
							Operations.deleteFileRecursively(path);
						}
					}
					

					break;
				case 3:
					System.out.println("Enter the name of the file to be searched");
					String fileName = sc.next();
					
					Operations.createMainFolderIfNotPresent("main");
					Operations.displayFileLocations(fileName, "main");

					
					break;
				case 4:
				
					return;
				case 5:
			
					System.out.println("Program exited.");
					running = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				ManageFileOptions();
			}
		} while (running == true);
	}
}
