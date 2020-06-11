package sk.itsovy.strausz.projectChess;

import java.util.regex.Pattern;

public class Board {

    public String[][] board = new String[8][8];

    public Board() {
        initialize();
    }


    public void initialize() {


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = "0";
            }
        }
        // Rook
        board[0][0] = "R";
        board[0][7] = "R";

        // Knight
        board[0][1] = "N";
        board[0][6] = "N";

        //Bishop
        board[0][2] = "B";
        board[0][5] = "B";

        //Queen
        board[0][3] = "Q";

        //King
        board[0][4] = "K";


    }

    public boolean checkBishop(String position, String destination) {


      position =  normalizeString(position);
      destination =  normalizeString(destination);

        position = convertToArrayPosition(position);
        destination = convertToArrayPosition(destination);

        if( position == null || position.equals(destination) || destination == null){
            return false;
        }

        int srcY = Integer.parseInt(position.substring(0, 1));
        int srcX = Integer.parseInt(position.substring(1));

        int destY = Integer.parseInt(destination.substring(0, 1));
        int destX = Integer.parseInt(destination.substring(1));

        System.out.println("dest Y: " + destY);
        System.out.println("dest X: " + destX);
        System.out.println("src Y: " + srcY);
        System.out.println("src  X: " + srcX);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Math.abs(srcX - destX) == Math.abs(srcY - destY)) {
                    board[destY][destX]="1";


                }else{
                    return false;
                }
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

        return true;

    }

    public boolean checkRook(String position, String destination){
        position =  normalizeString(position);
        destination =  normalizeString(destination);

        position = convertToArrayPosition(position);
        destination = convertToArrayPosition(destination);

        if( position == null || position.equals(destination) || destination == null){
            return false;
        }

        int srcY = Integer.parseInt(position.substring(0, 1));
        int srcX = Integer.parseInt(position.substring(1));

        int destY = Integer.parseInt(destination.substring(0, 1));
        int destX = Integer.parseInt(destination.substring(1));

        System.out.println("dest Y: " + destY);
        System.out.println("dest X: " + destX);
        System.out.println("src Y: " + srcY);
        System.out.println("src  X: " + srcX);


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((srcX != destX) && (srcY == destY) || (srcX == destX) && (srcY != destY)) {
                    board[destY][destX]="1";


                }else{
                    return false;
                }
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

        return true;


    }
    public boolean checkKnight(String position, String destination){
        position =  normalizeString(position);
        destination =  normalizeString(destination);

        position = convertToArrayPosition(position);
        destination = convertToArrayPosition(destination);

        if( position == null || position.equals(destination) || destination == null){
            return false;
        }

        int srcY = Integer.parseInt(position.substring(0, 1));
        int srcX = Integer.parseInt(position.substring(1));

        int destY = Integer.parseInt(destination.substring(0, 1));
        int destX = Integer.parseInt(destination.substring(1));

        System.out.println("dest Y: " + destY);
        System.out.println("dest X: " + destX);
        System.out.println("src Y: " + srcY);
        System.out.println("src  X: " + srcX);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int Yresult = Math.abs(destY-srcY);
                int Xresult = Math.abs(srcX-destX);

                if ((Yresult== 2) && (Xresult==1) ||(Yresult== 1) && (Xresult ==2 )) {
                    board[destY][destX]="1";


                }else{
                    return false;
                }
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

        return true;


    }

    public boolean CheckQueen(String position, String destination){

        position =  normalizeString(position);
        destination =  normalizeString(destination);

        position = convertToArrayPosition(position);
        destination = convertToArrayPosition(destination);

        if( position == null || position.equals(destination) || destination == null){
            return false;
        }

        int srcY = Integer.parseInt(position.substring(0, 1));
        int srcX = Integer.parseInt(position.substring(1));

        int destY = Integer.parseInt(destination.substring(0, 1));
        int destX = Integer.parseInt(destination.substring(1));

        System.out.println("dest Y: " + destY);
        System.out.println("dest X: " + destX);
        System.out.println("src Y: " + srcY);
        System.out.println("src  X: " + srcX);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Math.abs(srcX - destX) == Math.abs(srcY - destY) ||
                        (srcX != destX) && (srcY == destY) || (srcX == destX) && (srcY != destY)) {
                    board[destY][destX]="1";


                }else{
                    return false;
                }
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

        return true;
    }


    public boolean checkKing(String position, String destination){
        position =  normalizeString(position);
        destination =  normalizeString(destination);

        position = convertToArrayPosition(position);
        destination = convertToArrayPosition(destination);

        if( position == null || position.equals(destination) || destination == null){
            return false;
        }

        int srcY = Integer.parseInt(position.substring(0, 1));
        int srcX = Integer.parseInt(position.substring(1));

        int destY = Integer.parseInt(destination.substring(0, 1));
        int destX = Integer.parseInt(destination.substring(1));

        System.out.println("dest Y: " + destY);
        System.out.println("dest X: " + destX);
        System.out.println("src Y: " + srcY);
        System.out.println("src  X: " + srcX);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (Math.abs(destX - srcX) <2  && Math.abs(destY - srcY) < 2) {
                    board[destY][destX]="1";


                }else{
                    return false;
                }
                System.out.print(board[i][j] + " ");

            }
            System.out.println();

        }

        return true;
    }




    public String normalizeString(String item) {

        String pattern = "^[A-Ha-h][1-8]$";


        if (item == null || item.length() != 2) {
            return null;
        }
        if (Character.isDigit(item.charAt(0))) {
            item = item.substring(1) + item.substring(0, 1);

        }
        if (!Pattern.matches(pattern, item)) {
            return null;
        }

        item = item.toUpperCase();

        return item;
    }

    public String convertToArrayPosition(String item) {
        if (item == null) {
            return null;
        }

        char first = item.charAt(0);

        int temp = first - 'A' + 1;
        int secTemp = Integer.parseInt(item.substring(1)) - 1;
        temp--;


        System.out.println(temp + String.valueOf(secTemp));

        return temp + String.valueOf(secTemp);
    }
}
