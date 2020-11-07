package model;
public class Restricted extends Playlist{
	//Atributes 
	private String[] restricted;
	public Restricted(String name, String[] restricted){
		super(name);
		this.restricted = restricted;
	}

/**
	 * add any song if it is already created, because it is Restricted<br>
	 * <b> pre: we need the information of the song already created and that it has gone through the "addsongtoplaylist" methods in the main and in the MCS </b> 
	 * @param objsong song information
	 * @param objuser user information
	 * @return a message that say, if the song add to playlist correctly
	 */
	@Override
	public String addSongtoplaylist(Song objsong, User objuser){
		String message = "";
		boolean addSong = false;
        for (int i=0;i<5 && !addSong;i++){
		if(objuser.getNickname().equals(restricted[i])){
			addSong = true;
			message = super.addSongtoplaylist(objsong, objuser);
		}else {
			message = "The song could not be created in the playlist because the user is not the owner of the playlist";
		}
	   }

		return message;
	}
	@Override
	public String toString(){
	
	String message=
		"\n ******Restricted Playlist*****" +
		"\n Title: " + getName() +
		"\n During : " +(sumDuration())+
		"\n Genre: " + totalGenre()+
		"\n *************************";
		return message;
	}



}