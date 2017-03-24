
package vjezbe01;

import java.util.Stack;


public class Kalkulator {

    public Kalkulator() {

        String infix = "(6+7*8-(6+2)*3)";

        String postfix = toPostfix(infix);
        System.out.println(postfix);
        int rezultat = izracunaj(postfix);
        System.out.println(rezultat);
    }

    private static String toPostfix(String infix) {

        Stack<Character> stc = new Stack<>();
        StringBuilder str = new StringBuilder();
        
        try {
            for (char c : infix.toCharArray()) {
                // Ako je ( - gurnem na stack
                if (c == '(') {
                    stc.push(c);
                    System.out.println(stc);
                } // Ako je broj - gurnem u string
                else if (Character.isDigit(c)) {
                    str.append(c);
                    System.out.println(str.toString());
                } // Ako je ) - skidam sa stacka...ali
                else if (c == ')') {
                    // Provjerim zadnji element. Ako nije zagrada, skinem u string, ako je zagrada, samo maknem sa stacka
                    while (!(stc.peek().equals('('))) {
                        str.append(stc.pop());
                        System.out.println(str.toString());
                    }
                    stc.pop();
                    System.out.println(stc);
                } // Ako je *, u stack
                else if (c == '*') {
                    stc.push(c);
                    System.out.println(stc);
                } // Inače + i -. 
                else if (c == '+' || c == '-') {
                    // Ako je zagrada na stacku, gurnem operator
                    if (stc.peek().equals('(')) {
                        stc.push(c);
                        System.out.println(stc);
                    } // U protivnome je već operator ili više njih na vrhu pa s vrha uzimam i guram u string
                    else {
                        while (stc.peek().equals('+') || stc.peek().equals('-') || stc.peek().equals('*')) {
                            str.append(stc.pop());
                            System.out.println(str.toString());
                        }
                        stc.push(c);
                        System.out.println(stc);
                    }
                }
            }

            return str.toString();
        } catch (Exception e) {
            return "Izraz nije ispravan!";
        }
    }

    private static int izracunaj(String postfix) {
        Stack<Integer> stc = new Stack<>();
        int tempA, tempB;

        // Prolazak kroz generirani string
        for (char c : postfix.toCharArray()) {
            // Ako je broj, gurnem na stack
            
            if (Character.isDigit(c)) {
                stc.push((int) Character.getNumericValue(c));
                System.out.println(stc);
            // Ako je operator, skinem ga sa stacka
            // Skinem zadnja dva broja sa stacka i obavim operaciju
            } else if (c == '+') {
                tempA = stc.pop();
                tempB = stc.pop();
                stc.push(tempA + tempB);
                System.out.println(tempA + " + " + tempB + "=" + (tempA + tempB));
                System.out.println(stc);
            } else if (c == '-') {
                tempA = stc.pop();
                tempB = stc.pop();
                stc.push(tempB - tempA);
                System.out.println(tempA + " - " + tempB + "=" + (tempA + tempB));
                System.out.println(stc);
            } else if (c == '*') {
                tempA = stc.pop();
                tempB = stc.pop();
                stc.push(tempB * tempA);
                System.out.println(tempA + " * " + tempB + "=" + (tempA * tempB));
                System.out.println(stc);
            }
        }

        return stc.pop();
    }
}
