package assessment1;

	import java.io.File;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	public class FileHandling {

		public static void main(String[] args) throws IOException  {
			
			System.out.println("Applicatuon name is FILE HANDLING");
			System.out.println("----------------------------------");
			System.out.println("Developer by Shaik Ehsan Ahmad\n");

			int n;
			char ch;

			Scanner sc = new Scanner(System.in); 
			//Taking the directory path as the User Input 
			System.out.println("Enter The Path Of File :");
			String path1 =sc.nextLine(); 
			do {
				System.out.println("Choose the options to handle the Files ");
				System.out.println("1. Files and Folders Sort\n2. Add, Delete and Search\n3. Quit\n");
				System.out.println("Choose Your Answer:");
				n=sc.nextInt();	

				switch(n) {
				case 1:
					File fileDir = new File(path1);
					if(fileDir.isDirectory()) {
						List<String> lf = Arrays.asList(fileDir.list());
						System.out.println("Listing Files Unsorted");
						for(String s:lf)  
							System.out.println(s);

						Collections.sort(lf);
						System.out.println("----------------------------------------------------------");
						System.out.println("Sorting files in ascending Order");
						for(String s:lf) 
							System.out.println(s);
					}
					break;


				case 2:
					System.out.println("Thank You for Choosing The 2nd Option");
					System.out.println("Now You Can Perform below Operations  On Your Files");
					do {     
						System.out.println("a. Add File\nb. Delete File\nc. Search File\nd. Return to main menu\ne. Quit\n");
						System.out.println("Choose Your Answer:");
						ch=sc.next().charAt(0);
						switch(ch) {
						case 'a':
							System.out.println("Enter The Adding File Name:");
							String path2=sc.nextLine();
							path2+=sc.nextLine();

							File fileDir1=new File(path1,path2);
							if(fileDir1.createNewFile()) {
								System.out.println("file Created\n");}
							else {
								System.out.println("Already file Exists");}

							break;

						case 'b':
							System.out.println("Enter The Deleting File Name:");
							String path3=sc.nextLine();
							path3+=sc.nextLine();

							File fileDir2=new File(path1,path3);
							if(fileDir2.exists()) {
								fileDir2.delete(); 
								System.out.println("File Is Deleted");}
							else 
								System.out.println("File Not Found");

							break;

						case 'c':
							System.out.println("Enter The Searching File Name:");
							String path4=sc.nextLine();
							path4+=sc.nextLine();

							File fileDir3=new File(path1,path4);
							if(fileDir3.exists()) {
								System.out.println("File Is Exist");
								System.out.println("Path Of The File is :"+fileDir3.getPath());}
							else
								System.out.println("FILE NOT FOUND");

							break;

						case 'd':
							System.out.println("Redirecting to main menu");
						    
							break;
						
						case 'e':
							System.out.println("Thank You.. We Are Quiting this file handling Operations\n");
							System.out.println("End The Program");
							break;
						
						default:
							System.out.println("*****INVALID OPTION*****");
							System.out.println("Please Give Right Option");
						}
						}while(ch!='d' && ch=='d');
					
				break;
				case 3:
					System.out.println("Thank You.. We are Exiting");
					break;
				default:
					System.out.println("*****INVALID OPTION*****");
					System.out.println("Please Give Right Option");
					break;	


				
				}
			}while(n!=3 );
			
				
			    
			sc.close();	

		}}
