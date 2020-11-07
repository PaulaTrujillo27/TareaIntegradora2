package model;
public class Song{


	private int duration;
	private String tittle;
	private String artist;
	private String date;
	
	private Genre songGenre;
	
	/**
	 * constructor method <br>
	 * <b> pre: we need the atributes </b> 
	 * @param duration song duration
	 * @param tittle song tittle
	 * @param artist song artist
	 * @param songGenre song genre
	 * @param date song date
	 */
	public Song(int duration, String tittle,  String artist, String songGenre, String date) {
		this.duration = duration;
		this.tittle = tittle;
		this.artist = artist;
		this.songGenre = Genre.valueOf(songGenre);
		this.date = date;
	}
	
	
	/**
	 * get method <br>
	 * <b> pre: constructor method </b> 
	 * @return duration= playlist duration
	 */
		public int getDuration(){
		return duration;
		}
		
	/**
	 * get method <br>
	 * <b> pre: constructor method </b> 
	 * @return tittle= song tittle
	 */
		public String getTittle() {
		return tittle;
		}
		
		
	/**
	 * get method <br>
	 * <b> pre: constructor method </b> 
	 * @return artist= artist name
	 */
		public String getArtist() {
		return artist;
		}
		
		
	/**
	 * get method <br>
	 * <b> pre: constructor method </b> 
	 * @return songGenre: song genre
	 */
		public Genre getGenre() {
		return songGenre;
		}
		
		
	/**
	 * get method <br>
	 * <b> pre: constructor method </b> 
	 * @return date: creation date song
	 */
		public String getDate() {
		return date;
		}

	/**
	 * set method <br>
	 * <b> pre: constructor method </b> 
	 * @param duration: duration song
	 */		public void setDuration(int duration){
			this.duration = duration;
		}
	/**
	 * set method <br>
	 * <b> pre: constructor method </b> 
	 * @param tittle: song tittle
	 */
		public void setTittle(String tittle) {
			this.tittle = tittle;
		}
		
	/**
	 * set method <br>
	 * <b> pre: constructor method </b> 
	 * @param artist: artist name
	 */
		public void setArtist(String artist) {
			this.artist = artist;
		}
		
		
	/**
	 * set method <br>
	 * <b> pre: constructor method </b> 
	 * @param date: creation song date
	 */
		public void setDate(String date) {
			this.date = date;
		}

	/**
	* convert time from just seconds to minutes, and seconds <br>
	 * <b> pre: we need the time in seconds </b> 
	 * @return convert time
	 */
		public String duration(){
		int num=0,min=0,seg=0;
        String message="";
        num=duration;
        min=num/60;
        seg=num-(min*60);

    	message=(": "+min+"m "+seg+"s\n");
   		return message;
		}
		

	/**
	 * displays Song information on screen<br>
	 * <b> pre: we need all the Song information: title, artist, duration and songGenre </b> 
	 * @return a message showing all the information of Song
	 */
		public String toString(){
			String message ="";

			message = "\n******Song******"+
			"\nTittle: " + tittle +
			"\nArtist: " + artist +
			"\nDuration: " + duration +
			"\nGenre: " + songGenre +
			"\n*************";

			return message;

		}
}