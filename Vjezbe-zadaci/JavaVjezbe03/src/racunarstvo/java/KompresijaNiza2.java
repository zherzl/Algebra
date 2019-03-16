
package kompresijaniza;

import java.util.*;


public class KompresijaNiza {

    public static void main(String[] args) {
        List<Integer> lista = ucitajBrojeve();
        int[] kopija = kopiraj(lista); // Kopiram zbog indexa
        List<Integer> komprimirano = komprimiraj(kopija);
        int[] komprimiranaKopija = kopiraj(komprimirano);
        
        for (int i : komprimiranaKopija) {
            System.out.println(i);
        }
    }

    private static List<Integer> ucitajBrojeve() throws NumberFormatException {
        int broj;
        Scanner s = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        do {
            System.out.println("Unesite broj: ");
            broj = Integer.parseInt(s.nextLine());

            if (broj != -1) {
                lista.add(broj);
            }
        } while (broj != -1 && lista.size() <= 100);
        return lista;
    }

    private static int[] kopiraj(List<Integer> lista) {
        int[] niz = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            niz[i] = lista.get(i);
        }

        return niz;
    }

    private static List<Integer> komprimiraj(int[] niz) {
        List<Integer> komprimirano = new ArrayList<>();

        komprimirano.add(niz[0]);

        int counter = 1;
        for (int i = 1; i < niz.length; i++) {
            if (niz[i - 1] != niz[i]) {
                komprimirano.add(counter);
                komprimirano.add(niz[i]);
                counter = 1;
            } else {
                counter++;
            }

        }
        
        komprimirano.add(counter);
        return komprimirano;
    }

}
