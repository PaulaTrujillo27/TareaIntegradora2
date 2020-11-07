package ui;
import java.util.Scanner;
import model.MCS;

public class Main{

	private  Scanner sc;
	public MCS mcs;

	public  Main() {
		sc= new Scanner(System.in);
		mcs = new MCS();
	}	

	public static void main(String[] args) {
	System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((\n"+
"((((((((((((((((/((((((((((((((((((((((((((((((((\n"+
"(((/  .(((((((*  .((((((*        (((((/      /(((\n"+
"(((/   .((((((.  .(((((   ,((((((((((*  .((((((((\n"+
"(((/    /((((/   .((((/  ,(((((((((((.  /((((((((\n"+
"(((/     ((((*   .((((*  ,(((((((((((/   ((((((((\n"+
"(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((\n"+
"(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((\n"+
"(((/  //  ,(  .   ((((*  *((((((((((((((/   /((((\n"+
"((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((\n"+
"(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((\n"+
"(((/  .((    ((   /((((  .(((((((((((((((((.  /((\n"+
"(((/  .((.  .((.  *((((,  *((((((((((((((((   /((\n"+
"(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((\n"+
"(((/  .((((((((.  *((((((.        *((   .   .((((\n"+
"(((((((((((((((/*/((((((((((///(((((((////(((((((\n"+
"(((((((((((((((((((((((((((((((((((((((((((((((((\n"+
"               ./(###((///((###(*                \n"+
"          *#(,                   *((,            \n"+
"        ,#/                           ((         \n"+
"     .#*          .**/////*,.          ((        \n"+
"     *(.      .//////////////////*       *#      \n"+
"    .#,     *///////////////////////,     /(     \n"+
"    /(    *///////////////////////////    .#.    \n"+
"  ,/////,*/////////////////////////////,*////*.  \n"+
"  /////////////////////////*,...,/////////////,  \n"+
"  //////*,,,********,,.............,,,,,//////,  \n"+
"  //////*.........//*........//*.......,//////,  \n"+
"  //////*.........,,.........,,........,//////,  \n"+
"  //////*..............................,//////,  \n"+
"   *///*  ........,/.........**.......  .*///,   \n"+
"            .......,/*.....,/*.......            \n"+
"               ........,,,,.......               \n"+
"                    .........                    \n"+
"												\n"+
"*************************************************\n");
	System.out.println("************************");
	System.out.println("***  Welcome to MCS  ***");
	System.out.println("************************");
	Main ppal= new Main();

	int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		

	}
	
	/**
	 * prints on screen the options to use the application <br>
	 * <b> pre: we need the user to choose what action to perform </b> 
	 * @param option menu option
	 * @return the number chosen by the user
	 */
	public int showMenu() {
		int option=0;

		System.out.println(
				"Selec one option to start\n" +
				"(1) to create one user\n" +
				"(2) to create one song\n"+
				"(3) to create one playlist\n"+
				"(4) to add song to playlist\n" + 
				"(5) to show users\n" +  
				"(6) to show song\n" +  
				"(7) to calificate if the playlist is public\n" +  
				"(8) to show playlist\n" +
				"(0) to get out"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}

	/**
	 * depending on the option chosen, the program performs an option <br>
	 * <b> pre: we need the value of the option variable </b> 
	 * @param operation menu option
	 * 
	 */
	public void executeOperation(int operation) {
		String message="";
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
			createUser() ;
			break;
		case 2:
			createSong();
			break;
		case 3:
			createPlaylist();
			break;
		case 4:
			addSongtoplaylist();
			break;
		case 5:
			message=mcs.showUsers();
			System.out.println(message);
			break;
		case 6:
			message=mcs.showSongs();
			System.out.println(message);
			break;
		case 7:
			System.out.println("Playlist available:");
			System.out.println(mcs.showPlaylist());
			System.out.println("Write PUBLIC playlist name: ");
			String name= sc.nextLine();sc.nextLine();
			System.out.println("Calificate the playlist from 1 to 5(being 1 the worst calification and 5 the best calification: ");
			double calification = sc.nextDouble();sc.nextLine();
			mcs.calificationPublicPlaylist(calification, name);
			break;	
		case 8:
			message=mcs.showPlaylist();
			System.out.println(message);
			break;
			

		default:
			System.out.println("Invalid option");
		}
	}

	//user information

	/**
	 * asks the user for the information of the user to be registered <br>
	 * <b> pre: we need the value of the option variable </b> 
	 * @param nickname user nickname
	 * @param password user password
	 * @param age user age
	 */
	private void createUser(){
		String nickname, password; 
		int age; 
		System.out.println("Write your nickname");
		nickname = sc.nextLine();
		System.out.println("Write your age");
		age = sc.nextInt();sc.nextLine();
		System.out.println("Write your password");
		password = sc.nextLine();
		String message = mcs.addUser(nickname,  age, password);
		System.out.println(message);

	}
	
	
	//song information

	/**
	 * asks the user for the information of the song to be registered <br>
	 * <b> pre: we need the value of the option variable </b> 
	 * @param name =song name
	 * @param artist =song artist
	 * @param songGenre=song genre 
	 * @param date= song date
	 */
	private void createSong(){
		String nickname,name, artist, songGenre, date;
		int duration;
		System.out.println("Write the nickname");
		nickname = sc.nextLine();	
		mcs.updateRank(nickname);
		System.out.println("Write down the song information");
		System.out.println("write the song name");
		name = sc.nextLine();		
		System.out.println("Write the artist name");
		artist = sc.nextLine();
		System.out.println("Write the song length in SECONDS");
		duration = sc.nextInt();sc.nextLine();
		System.out.println("Write the song genre (ROCK, HIP_HOP, CLASSIC, REGGAE, SALSA, METAL, POP)");
		songGenre = sc.nextLine().toUpperCase();
		System.out.println("Write the song's release date");
		date = sc.nextLine();

		String message =  mcs.addSong(nickname,duration, name, artist, songGenre, date);
		System.out.println(message);
		
	}
	
	//playlist information

	/**
	 * asks the user for the information of the user to be registered <br>
	 * <b> pre: we need the value of the option variable </b> 
	 * @param numplay choose the type of playlist
	 * @param name playlist name
	 * 
	 */
	private void createPlaylist(){
		int length, numplay;
		String name; 
		String message="";
		System.out.println("Write down the playlist information");
		System.out.println("Write the playlist name");
		name = sc.nextLine();
		System.out.println("Write (1) if the playlist is private \n" +
		"(2) if de playlist is public \n" +
		"or (3) if de playlist is restricted\n");
		numplay = sc.nextInt();sc.nextLine();

		switch(numplay) {
		case 1:
			System.out.println("Write user name");
			String nameprivate = sc.nextLine();
			message=mcs.addPlaylist(name, nameprivate);
			System.out.println(message);
			break;
		case 2:
		
			message=mcs.addPlaylist(name);
			System.out.println(message);
			
			break;
		case 3:
			String[] resuser = new String[5];
			for(int i = 0; i<5; i++){
				System.out.println("Write user name");
				String namerestricted = sc.nextLine();
			}
			message=mcs.addPlaylist(name, resuser);
			System.out.println(message);
			
			break;
		default:
			System.out.println("Error, invalid option");
		}
	}

	/**
	 * ask for the song information and add it to a playlist <br>
	 * <b> pre: we need the value of the option variable </b> 
	 * @param name= playlist name
	 * @param nickname= user nickname(private and restricted)
	 * @param song= song name
	 * @param message right or wrong message
	 */
	private void addSongtoplaylist(){
		String name, nickname,song,message;

		System.out.println("Write the name song");
		song = sc.nextLine();
		System.out.println("Write the playlist name");
		name = sc.nextLine();
		System.out.println("Write the nickname");
		nickname = sc.nextLine();

		message=mcs.addSongtoplaylist(name, nickname,song);
		System.out.println(message);

	}

}
