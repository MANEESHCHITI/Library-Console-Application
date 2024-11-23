import java.util.*;
class Project
{			
			Scanner s=new Scanner(System.in);
			
			int enter1;
			int enter2;
			int indiBook;
			String username="MANEESH";
			String password="RAO";
			String confirmPassword;
			String newUsername;
			String newPassword;
			

			 String RESET="\u001B[40m";
			 String RED="\u001B[41m";
			 String GREEN="\u001B[42m";
			 String YELLOW="\u001B[43m";
			 String BLUE="\u001B[44m";
			 String CYAN="\u001B[46m";
			 String WHITE="\u001B[47m";
			 
			 
			 String PURPLE="\u001B[35m";
			 String YELLOW1="\u001B[33m";
             String RESET1="\u001B[30m";
			 String WHITE1="\u001B[37m";
			 
			 			 
	public void welcomePage()
	{
		
		System.out.println(GREEN+"                                          WELCOME TO B43 LIBRARY                                                                   "+RESET);
		System.out.println(BLUE+"  1) SignUp  ");
		System.out.println("  2) Login  "+RESET);
		credentials();
		
		
		System.out.println(GREEN+"                                                                Select Which Book You Wanted To Borrow ?                                     "+RESET);
		System.out.println();
	
		individualItem();
	}
	
	public void credentials()
	{
		System.out.print("Enter: ");
		int loginSignupValue=s.nextInt();
		switch(loginSignupValue)
		{
			case 1:
			{
				signUp();
			}break;
			case 2:
			{
				login();
			}break;
			default:
			{
				System.out.println(RED+"INVALID"+RESET);
				System.out.println("");
			credentials();
			}break;
		}
		
	
	
	
		//Next three lines execute end of the code.
		
	
	}
	public void signUp()
	{
		System.out.print(PURPLE+"Create Username: "+WHITE1);
		username=s.next();
		System.out.println();
		System.out.print(PURPLE+"Create New Password: "+WHITE1);
		password=s.next();
		System.out.println();
		System.out.print(PURPLE+"Confirm new password: "+WHITE1);
		confirmPassword=s.next();
	signUpCheck();
	}
	public void signUpCheck()
	{
		if(password.equals(confirmPassword))
		{
			System.out.println(GREEN+"Account Created"+RESET);
		login();
		}
		else
		{
			System.out.println(RED+"MisMatch confirm password"+RESET);
			System.out.println("");
		signUp();
		}
	}
	
	public void login()
	{
		System.out.print(PURPLE+"Enter username: "+WHITE1);
		newUsername=s.next();
		System.out.println();
		System.out.print(PURPLE+"Enter password: "+WHITE1);
		newPassword=s.next();
		if(username.equals(newUsername))
		{
			if(password.equals(newPassword))
			{
				System.out.println(GREEN+"SUCCESSFULL LOGIN"+RESET);
				System.out.println();
			libraryItems();
			
			}
			else
			{
				System.out.println(RED+"Mismatch Credentials"+RESET);
				System.out.println();
			login();
				
			}
			
		}
		else
		{
			System.out.println(RED+"Mismatch Credentials"+RESET);
			System.out.println();
		login();
		}
		
		
	}
	
	public void libraryItems()
	{
		System.out.print(BLUE+"1) Subject Books"+RESET);
		System.out.println("         PRESS>>>>>>>>>>1");
		System.out.print(BLUE+"2) Journals"+RESET);
		System.out.println("              PRESS>>>>>>>>>>2");
		System.out.println(GREEN+"                                           Select one                                                       "+RESET);
	selectLibrarayItems();
	}
	public void selectLibrarayItems()
	{
		System.out.print("Enter: ");
		enter1=s.nextInt();
		switch(enter1)
		{
			case 1:
			{
				selectYear();
			}break;
			case 2:
			{
				selectYear();
			}break;
			default:
			{
				System.out.println(RED+"INVALID"+RESET);
				System.out.println("");
			selectLibrarayItems();
			}break;
		}
	}
	public void selectYear()
	{	System.out.println(GREEN+"                                          Select Year Of Published                                            "+RESET);
		System.out.println(CYAN+"1) 2017");
		System.out.println("2) 2018");
		System.out.println("3) 2019");
		System.out.println("4) 2020");
		System.out.println("5) 2021"+RESET);
	 selectValue();
	}
	public void selectValue()
	{
		switch(enter1)
		{
			case 1:
			{
				System.out.print("Enter: ");
				enter2=s.nextInt();
				subjectBooks();
			}
			break;
			case 2:
			{
				System.out.print("Enter: ");
				enter2=s.nextInt();
				journals();
			}
			break;
			default:
			{
				System.out.println("code crash");
			}break;
			
		}

	}
	public void subjectBooks()
	{ 
		
		switch(enter2)
		{
			case 1:																	
			{
				System.out.println(BLUE+"1) The Hate U Give");
				System.out.println("2) Little Fires Everywhere");
				System.out.println("3) Pachinko");
				System.out.println("4) Turtles All the Way Down");
				System.out.println("5) A Court of Wings and Ruin"+RESET);
																				
			}
			break;
			case 2:
			{
				System.out.println(BLUE+"1) Circe");
				System.out.println("2) An American Marriage");
				System.out.println("3) Educated");
				System.out.println("4) Asymmetry");
				System.out.println("5) Becoming"+RESET);
				}break;
			case 3:
			{
				System.out.println(BLUE+"1) The Dutch House");
				System.out.println("2) The Wicked King");
				System.out.println("3) The Queen of Nothing");
				System.out.println("4) Talking to Strangers");
				System.out.println("5) The Giver of Stars"+RESET);
			}break;
			case 4:
			{
				System.out.println(BLUE+"1) The Vanishing Half");
				System.out.println("2) Untamed");
				System.out.println("3)  Midnight Library");
				System.out.println("4) Beach Read");
				System.out.println("5) The Death of Vivek Oji"+RESET);
			}break;
			case 5:
			{
				System.out.println(BLUE+"1) Klara and the Sun");
				System.out.println("2) The Four Winds");
				System.out.println("3) Cloud Cuckoo Land");
				System.out.println("4) Crying in H Mart");
				System.out.println("5) Malibu Rising"+RESET);
			}break;
			default:
				{
					System.out.println(RED+"INVALID"+RESET);
					System.out.println("");
				selectValue();
				}break;
		}
	}
	public void journals()
	{
		switch(enter2)
		{
			case 1:
			{
				System.out.println(BLUE+"1) South and West by Joan Didion");
				System.out.println("2) We Were Eight Years in Power by Ta-Nehisi Coates");
				System.out.println("3) Abandon Me by Melissa Febos");
				System.out.println("4) The River of Consciousness by Oliver Sacks");
				System.out.println("5) Blind Spot by Teju Cole"+RESET);
			}break;
			case 2:
			{
				System.out.println(BLUE+"1) Science of The Total Environment");
				System.out.println("2) Nature Medicine");
				System.out.println("3) Proceedings of the National Academy of Sciences");
				System.out.println("4) Angewandte Chemie International Edition");
				System.out.println("5) Chemical Reviews"+RESET);
			}break;
			case 3:
			{
				System.out.println(BLUE+"1) International Conference on Machine Learning");
				System.out.println("2) Chemical Society Reviews");
				System.out.println("3) Nucleic Acids Research");
				System.out.println("4) European Conference on Computer Vision");
				System.out.println("5) Advanced Energy Materials"+RESET);
			}break;
			case 4:
			{
				System.out.println(BLUE+"1) Journal of the American Chemical Society");
				System.out.println("2) Advanced Functional Materials");
				System.out.println("3) Renewable and Sustainable Energy Reviews");
				System.out.println("4) ACS Nano");
				System.out.println("5) BMJ"+RESET);
			}break;
			case 5:
			{
				System.out.println(BLUE+"1) Physical Review Letters");
				System.out.println("2) Journal of Clinical Oncology");
				System.out.println("3) Science Advances");
				System.out.println("4) Frontiers in Immunology");
				System.out.println("5) The Lancet Oncology"+RESET);
			}break;
			default:
			{
				System.out.println(RED+"INVALID"+RESET);
				System.out.println("");
			selectValue();
			}break;

		}
	}
	public void individualItem()
	{
		
		System.out.print("Enter: ");
		indiBook=s.nextInt();
	error();
	}
	public void error()
	{
		switch(indiBook)
		{
			case 1:
			{
				end();
			}break;
			case 2:
			{
				end();
			}break;
			case 3:
			{
				end();
			}break;
			case 4:
			{
				end();
			}break;
			case 5:
			{
				end();
			}break;
			default:
			{
				System.out.println(RED+"INVALID"+RESET);
				System.out.println();
				individualItem();
				
			}break;
		}
	}
	public void end()
	{
		System.out.println(GREEN+"                                                                  >>>>>>>>>>>>>>>>>>THANK YOU<<<<<<<<<<<<<<<<<<<                    "+RESET);
	}
	


	
}

public class Library{
	public static void main(String args[]){
		Project obj=new Project();
		obj.welcomePage();
	}
}



	


	
	
	
	
	
	
	
	
	

		