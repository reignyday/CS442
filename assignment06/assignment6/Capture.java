package assignment6;

public class Capture implements Command {
	int iccf;
	int undoICCF;
	Piece lost;
	Board board;
	public Capture (Board brd, int i) {
		iccf = i;
		board = brd;
		undoICCF = 100*(iccf % 100) + iccf/100;
	}

	@Override
	public void execute() {
		int from = iccf/100;
		int to = iccf%100;
		Piece p = board.getPiece(from); // get the piece currently on the "from" square
		board.setPiece(from, board.piece.get("--")); // replace it with a non-piece
		lost = board.getPiece(to); // store the piece that is taken in the command
		board.setPiece(to, p); // put the "from-piece" on the "to" square
	}

	@Override
	public void undo() {
		// use the undoICCF to move the piece back where it came from.
		// and replace where it was with the lost piece.
		int to = undoICCF % 100;
		int from = undoICCF / 100;
		Piece p = board.getPiece(to);
		board.setPiece(to, lost);
		board.setPiece(from, p);
	}
}

