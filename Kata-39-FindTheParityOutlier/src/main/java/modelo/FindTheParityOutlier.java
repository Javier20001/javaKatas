package modelo;

import java.util.ArrayList;
import java.util.List;

public class FindTheParityOutlier {

    public FindTheParityOutlier() {
    }

    public int find(int[] integers) {
        List<Integer> listPar = new ArrayList();
        List<Integer> listImpar = new ArrayList();
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                listPar.add(integer);
            } else {
                listImpar.add(integer);
            }
        }
        return listPar.size() < listImpar.size() ? listPar.get(0) : listImpar.get(0);
    }
}
