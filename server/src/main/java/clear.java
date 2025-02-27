import chess.ChessGame;
import chess.ChessPiece;
import dataaccess.DataAccessException;
import server.Server;

public class clear {
    public static void main(String[] args) throws DataAccessException {
        var piece = new ChessPiece(ChessGame.TeamColor.WHITE, ChessPiece.PieceType.PAWN);
        System.out.println("♕ 240 Chess Server: " + piece);
        Server server = new Server();
        server.run(8080);
        server.clear();
    }
}
