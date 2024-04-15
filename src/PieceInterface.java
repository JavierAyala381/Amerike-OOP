
public interface PieceInterface {
	// Allowed piece types
	enum PieceType {
		Peon,
		Reina,
		Rey,
		Alfil,
		Caballo
	}; 
	
	// Allowed color types
	enum PieceColor {
		White,
		Black
	};
	
	// Makes a the piece move
	public void makeMove(int x, int y);
	
	// Add other public methods ...
}
