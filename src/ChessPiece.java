import java.util.ArrayList;
import java.util.List;

public class ChessPiece implements PieceInterface{
	// Piece attributes white or black
	public String Color;
	// Piece shape
	public String PieceType;
	// Handles the position of the piece
	public Position Position;
	// Keeps a track of the piece moves
	private int Moves;
	// Max Steps allowed for a piece
	private int MaxSteps;
	// Characterizes the movement of the piece
	private List<String> StepDirections = new ArrayList<String>();
	
	/**
	 * This is the piece constructor 
	 * @throws Exception 
	 * */
	public ChessPiece(String pieceType, String color) throws Exception {	
		// Verify if is a valid piece
		boolean isValid = ChessPiece.pieces.contains(pieceType);
		boolean isValidColor = ChessPiece.color.contains(color);
		if(!isValid || !isValidColor) {
			throw new Exception("This is not a valid piece");
		};
		
		// Initialize the piece
		this.setMoves(0);
		this.PieceType = pieceType;
		this.Color = color;
		
		// Instance the piece
		switch (pieceType) {
			case "Peon":
				this.setStepDirection(List.of("front", "diagonal"));
				this.setMaxSteps(2);
				break;
			case "Caballo":
				this.setStepDirection(List.of("L-Shape"));
				this.setMaxSteps(3);
				break;
			case "Alfil":
				this.setStepDirection(List.of("diagonal"));
				break;
			//... add more pieces
			default:
				// default behaviour
				break;
		}
	}
	
	@Override
	public void makeMove(int x, int y) {
		// TODO Auto-generated method stub
	}

	public int getMoves() {
		return Moves;
	}

	public void setMoves(int moves) {
		Moves = moves;
	}

	public int getMaxSteps() {
		return MaxSteps;
	}

	public void setMaxSteps(int maxSteps) {
		MaxSteps = maxSteps;
	}

	public List<String> getStepDirection() {
		return StepDirections;
	}

	public void setStepDirection(List<String> stepDirection) {
		StepDirections = stepDirection;
	}

	@Override
	public ArrayList<int[]> getPositions() {
		//return this.Position.getPositions();
		return null;
	}
}
