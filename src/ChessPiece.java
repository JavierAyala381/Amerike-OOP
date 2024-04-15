import java.util.ArrayList;
import java.util.List;

public class ChessPiece implements PieceInterface{
	// Piece attributes white or black
	public PieceColor Color;
	// Piece shape
	public PieceType PieceType;
	// Handles the position of the piece
	public Position Position;
	// Keeps a track of number moves made by the piece
	private int Moves;
	// Max Steps allowed for a piece if applicable
	private int MaxSteps;
	// Characterizes the movement of the piece contains the allowed step directons
	private List<PositionInterface.Movements> StepDirections = 
			new ArrayList<PositionInterface.Movements>();
	
	/**
	 * This is the piece constructor initializes the state of the piece
	 * @throws Exception 
	 * */
	public ChessPiece(PieceType pieceType, PieceColor color, int[] p_0) {
		// This sets the initial position of the piece
		this.Position = new Position(p_0[0], p_0[1]);
		
		// Initialize other piece attributes
		this.setMoves(0);
		this.PieceType = pieceType;
		this.Color = color;
		
		// Instance the piece according to the type (this is an example)
		switch (pieceType) {
			case Peon:
				this.setStepDirections(List.of(
						PositionInterface.Movements.Forward,
						PositionInterface.Movements.ForwardRight,
						PositionInterface.Movements.ForwardLeft
				));
				break;
			case Caballo:
				this.setStepDirections(List.of(PositionInterface.Movements.LShape));
				this.setMaxSteps(3);
				break;
			default:
				break;
		}
	}
	
	@Override
	public void makeMove(int x, int y) {
		// Hint use position to make the move
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

	public List<PositionInterface.Movements> getStepDirections() {
		return StepDirections;
	}

	public void setStepDirections(List<PositionInterface.Movements> stepDirections) {
		StepDirections = stepDirections;
	}
}
