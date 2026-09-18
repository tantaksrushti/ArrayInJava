import java.util.*;
class Song{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter SongCount: ");
		int songCount = sc.nextInt();

		sc.nextLine();

		String songName[] = new String [songCount];

		System.out.println("Enter your fav song name: ");
		for(int i=0; i<songCount; i++){
			songName[i] = sc.nextLine();
		}

		String singerName[] = new String [songCount];

		System.out.println("Enter the singer name of the song: ");
		for(int i=0; i<songCount; i++){
			singerName[i] = sc.nextLine();
		}

		String mostListenedSinger=" ";
		int maxCount=0;
		

		for(int i =0; i<songCount; i++){
			int currentCount=0;
			for(int j=0; j<songCount;j++){
				if(singerName[i].equalsIgnoreCase(singerName[j])){
					currentCount++;
					
				}
			}
			if(currentCount > maxCount){
                        maxCount=currentCount;
                        mostListenedSinger = singerName[i];
			
			} 
		}

		if(maxCount > 1){
			System.out.println(mostListenedSinger + "Mostly listened singer");
		}else{
			System.out.println("No repetation of singer name");
		}

	}

}
