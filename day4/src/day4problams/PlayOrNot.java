package day4problams;

public class PlayOrNot {
	public static final int noplay = 0;
    public static final int ladder = 1;
    public static final int snake = 2;

    public static void main(String[] args) {
    	
           int Position=0;
           int newPosition=0;

           int DieRolled = (int) (Math.random()*6)+1;
           int checkOption = (int) (Math.random()*3);

           switch (checkOption){
               case noplay:
                     newPosition = 0;
                      break;
               case ladder:
                   newPosition = DieRolled;
                     break;
               case snake:
                   newPosition = -DieRolled;
           }
           Position=Position+newPosition;
           if (Position<0){
                    Position = 0;
           }
           System.out.println("current posi is "+Position+"th"+" position");
    }

}
