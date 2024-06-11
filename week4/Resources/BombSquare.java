import java.util.*;

public class BombSquare extends GameSquare
{
	private boolean thisSquareHasBomb = false;
	public static final int MINE_PROBABILITY = 10;

	int total;

	public BombSquare(int x, int y, GameBoard board)
	{
		super(x, y, "images/blank.png", board);

		Random r = new Random();
		thisSquareHasBomb = (r.nextInt(MINE_PROBABILITY) == 0);

		/*if(thisSquareHasBomb == true){
			setImage("images/nomb.png"); 
		}*/
	}

	public void clicked() {

		if (thisSquareHasBomb) {
			setImage("images/bomb.png");
		} else {
			total = 0;
			for (int i = -1; i <= 1; i++) {
				for (int j = -1; j <= 1; j++) {
					if (i == 0 && j == 0) {
						continue; 
					}
					int x = xLocation + i;
					int y = yLocation + j;
					if (isBombSquare(x, y)) {
						total++;
				}
			}
			setImage("images/" + total + ".png");
			}
		}
	}
	
	public boolean isBombSquare(int x, int y) {
		GameSquare s = board.getSquareAt(x, y);
		if (s != null) {
			BombSquare bomb = (BombSquare) s;
			if (bomb.thisSquareHasBomb) {
				return true;
			}
		}
		return false;
		}
}