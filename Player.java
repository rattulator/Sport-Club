package club;
import java.time.LocalDate;
import java.time.Period;

public class Player {
	String firstname;
	String lastname;
	boolean ismale;
	String gender;
	boolean coach;
	int age;
	LocalDate DOB;
	String nationality;
	String line1;
	String line2;
	String city;
	String state;
	String postcode;
	String country;
	
	Player(String name1,String name2, boolean ismale,boolean coach, LocalDate dob, String nationality) {
		firstname=name1;
		lastname=name2;
		this.ismale=ismale;
		if (ismale==true) this.gender = "male"; //turns the gender boolean into a string 
		else this.gender = "female";			//^
		this.coach=coach;
		DOB=dob;
		this.nationality=nationality;
		age = this.Age_Calculate();				//calls separate method to turn the two localDates into an age
		}
	
	int Age_Calculate() {
		LocalDate currentDate = LocalDate.now();			//get current date
		age = Period.between(DOB, currentDate).getYears();	//find difference between current date and the DOB, then get only the years
		return age;
		}
	
	void Create_Address(String line1, String line2, String city, String state, String postcode, String country){
		this.line1=line1;
		this.line2=line2;
		this.city=city;
		this.state=state;
		this.postcode=postcode;
		this.country=country;
	}
	void Full_address() {
		System.out.println(this.line1);
		System.out.println(this.line2);
		System.out.println(this.city);
		System.out.println(this.state);
		System.out.println(this.postcode);
		System.out.println(this.country);
	}
}

