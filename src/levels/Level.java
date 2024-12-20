package levels;

public class Level {


	private int[][] lvlData;

	public Level(int[][] lvlData) {
		// TODO: set this lvlData to lvlData
	}

	public int getSpriteIndex(int x, int y) {
        return lvlData[y][x];
	}

	public int[][] getLevelData() {
		return lvlData;
	}

}
