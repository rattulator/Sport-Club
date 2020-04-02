package club;
import java.time.LocalDate;
import java.time.Period;

public class Football_Club {
	static Player player_list[] = new Player[8];
			
	public static void main(String[] args) {

		//Shaun.Create_Address("54 The Meridian", "Kenavon Drive", "Reading", "Berkshire", "RG1 3DQ", "UK");
		//Harry.Create_Address("54 The Meridian", "Kenavon Drive", "Reading", "Berkshire", "RG1 3DQ", "UK");
		//Saida.Create_Address("54 The Meridian", "Kenavon Drive", "Reading", "Berkshire", "RG1 3DQ", "UK");
		//Emily.Create_Address("106", "Oxford Road", "Oxford", "Oxfordshire", "OX1 HE2", "Scotland");
		//Timmy.Create_Address("12", "Honk Street", "Geeseton", "Borkshire", "BK1 0NK", "France");
		//Tammy.Create_Address("12", "Honk Street", "Geeseton", "Borkshire", "BK1 0NK", "France");
		//Tony.Create_Address("112", "4th Avenue", "New York", "New York", "90210", "USA");
		//Jenny.Create_Address("55", "Daisy Lane", "Dingleberry", "Essex", "ES4 B03", "England");
		
//		player_list[0] = Shaun;
//		player_list[1] = Harry;
//		player_list[2] = Saida;
//		player_list[3] = Emily;
//		player_list[4] = Timmy;
//		player_list[5] = Tammy;
//		player_list[6] = Tony;
//		player_list[7] = Jenny;
		
		//create_team(8,60,"mixed");
		
		
		} //end of main

public static void create_team(int players_needed, int max_age, String required_gender) { 
	int teamsize = 0;
	
	for (Player i : player_list) {
		
		if (teamsize>=players_needed) break;
		else { 
			if ((Player[i].age<=max_age)&&(((Player[i].gender).equals(required_gender))||((required_gender).equals("mixed")))) {
				System.out.println(Player[i].firstname+" is on the team");
				teamsize++;
				}
			}
		
		}
	
	}

}


	
