
package obrnutiniz;

import java.util.*;


public class ObrnutiNiz {

   
    public static void main(String[] args) {
        List<Integer> list = ucitajBrojeve();
        int[] kopija = kopiraj(list);
        int[] obrnutiNiz = okreni(kopija);
        
        for (int i = 0; i < obrnutiNiz.length; i++) {
            System.out.println(obrnutiNiz[i]);
        }
    }

    private static List<Integer> ucitajBrojeve() {
        int broj;
        Scanner s = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        
        do {            
            broj = Integer.parseInt(s.nextLine());
            if (broj != -1) {
                lista.add(broj);
            }
        } while (broj != -1);
        
        return lista;
    }

    private static int[] kopiraj(List<Integer> list) {
        int[] polje = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            polje[i] = list.get(i);
        }
        
        return polje;
    }

    private static int[] okreni(int[] kopija) {
        int temp;
        
        for (int i = 0; i < kopija.length / 2; i++) {
            temp = kopija[i];
            int poz = kopija.length - i - 1;
            kopija[i] = kopija[poz];
            kopija[poz] = temp;
        }
        
        return kopija;
    }
    
    
}
