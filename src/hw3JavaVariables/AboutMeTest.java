package hw3JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {

		AboutMe aboutMe = new AboutMe(); // Constructor is initialized here

		System.out.println("My name is" + aboutMe.myName + "\nMy Age is " + aboutMe.myAge + "\nMy home rent  is "
				+ aboutMe.homeRent + "\nMy Monthly Salarty is" + aboutMe.salary + "\nMy Bankbalance is "
				+ aboutMe.bankBalance + "\nMy Height is " + aboutMe.myheight + "\nMy School Grade is " + aboutMe.Grade
				+ "\nMy Gender is " + aboutMe.myGender + "\n Am i a US Citizen " + aboutMe.usCitizen

		);

		aboutMe.aboutMe(); // Method is initialized here

	}

}
