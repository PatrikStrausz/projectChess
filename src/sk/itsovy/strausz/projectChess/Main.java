package sk.itsovy.strausz.projectChess;

public class Main {

    public static void main(String[] args) {

        Board board = new Board();
//        System.out.println(board.checkBishop("3A", "3a"));
//        System.out.println(board.checkRook("A1","B1"));
//        System.out.println(board.checkKnight("C3", "D5"));
//        System.out.println(board.CheckQueen("A4", "e8"));
        System.out.println(board.checkKing("A5", "c47"));
    }
}
