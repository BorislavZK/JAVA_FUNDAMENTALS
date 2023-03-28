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

        while (!command.equals("Stop")) {

            if (command.contains("Add")) {
                //Add|{piece}|{composer}|{key}
                String pieceCurrent = command.split("\\|")[1];
                String composer = command.split("\\|")[2];
                String keyTone = command.split("\\|")[3];
                if (pieceMap.containsKey(pieceCurrent)) {
                    System.out.printf("%s is already in the collection!\n", pieceCurrent);

                } else {
                    pieceMap.put(pieceCurrent, new ArrayList<>());
                    pieceMap.get(pieceCurrent).add(composer);
                    pieceMap.get(pieceCurrent).add(keyTone);
                    System.out.printf("%s by %s in %s added to the collection!\n",pieceCurrent, composer, keyTone);
                }

            } else if (command.contains("Remove")) {
                //Remove|{piece}"
                String pieceCurrent = command.split("\\|")[1];
                if (pieceMap.containsKey(pieceCurrent)) {
                    pieceMap.remove(pieceCurrent);
                    System.out.printf("Successfully removed %s!\n", pieceCurrent);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.\n", pieceCurrent);
                }

            } else if (command.contains("ChangeKey")) {
                //ChangeKey|{piece}|{new key}"
                String pieceCurrent = command.split("\\|")[1];
                String keyToneChange = command.split("\\|")[2];

                if (pieceMap.containsKey(pieceCurrent)) {
                    pieceMap.get(pieceCurrent).set(1, keyToneChange);
                    System.out.printf("Changed the key of %s to %s!\n", pieceCurrent, keyToneChange);
                } else {
                    System.out.printf("Invalid operation! %s does not exist in the collection.\n",pieceCurrent);
                }
            }


            command = scan.nextLine();

        }

        //PRINT
        //"{Piece} -> Composer: {composer}, Key: {key}"

        for (Map.Entry<String, List<String>> entry : pieceMap.entrySet()) {

            System.out.printf("%s -> Composer: %s, Key: %s\n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1) );
        }

    }
}
