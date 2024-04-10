import java.util.ArrayList;
import java.util.List;

public interface PieceInterface {
	public static final List<String> pieces = 
			new ArrayList<String>(List.of("Peon", "Reina", "Rey", "Alfil", "etc.."));
	public static final List<String> color = 
			new ArrayList<String>(List.of("White", "Black"));
	// Makes a the piece move
	public void makeMove(int x, int y);
	// Gets the possible position of a piece
	public ArrayList<int[]> getPositions();
}
