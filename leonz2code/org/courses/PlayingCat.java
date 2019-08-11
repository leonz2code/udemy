package leonz2code.org.courses;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isCatPlaying(boolean summer,int temperature) {
		boolean playing = false;
		
		if(summer && (temperature>=25 && temperature<=45 )) {
			
			playing = true;
		}
		if(!summer && (temperature>=25 && temperature<=35 )) {
			
			playing = true;
		}	
		
		return playing;
	}
	
}
