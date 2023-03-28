package FinalExamPrep01;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Map<String, List<String>> pieceMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //"{piece}|{composer}|{key}".

            String data = scan.nextLine();
            String piece = data.split("\\|")[0];
            String composer = data.split("\\|")[1];
            String keyTone = data.split("\\|")[2];

            pieceMap.put(piece, new ArrayList<>());
            pieceMap.get(piece).add(composer); // List 0 position
            pieceMap.get(piece).add(keyTone); // List 1 position

        }

        String command = scan.nextLine();
        //Add|{piece}|{composer}|{key}
        //Remove|{piece}"
        //ChangeKey|{piece}|{new key}"

        while (!command.equals("Stop")) {

            String pieceCurrent = command.split("\\|")[1];


            command = scan.nextLine();
        }


    }
}
