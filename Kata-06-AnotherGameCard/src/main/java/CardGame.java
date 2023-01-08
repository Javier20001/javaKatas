import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGame {

    public CardGame() {
    }

    public static boolean game(int[] frank, int[] sam, int[] tom) {
        List<Integer> frankList2 = ordenar(frank);
        List<Integer> samList = intToList(sam);
        List<Integer> tomList = intToList(tom);
        int victory = 0;

        for (int i = 0; i <= 3; i++) {
            if (frankList2.get(i) > samList.get(i) && frankList2.get(i) > tomList.get(i)) {
                victory++;
            }
        }

        return (victory >= 2);
    }

    private static List<Integer> ordenar(int[] frank) {
        List<Integer> frankList = intToList(frank);
        Collections.sort(frankList, Collections.reverseOrder());
        int total = frankList.get(0);
        frankList.set(0, frankList.get(1));
        frankList.set(1, total);

        return frankList;
    }

    private static List<Integer> intToList(int[] numbers) {
        List<Integer> list = new ArrayList<Integer>();
        for (int number : numbers) {
            list.add(number);
        }
        return list;
    }
}