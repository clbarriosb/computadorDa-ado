/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Carmen_Lucia3
 */
public class Computador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        queue q = new queue();
        stack s = new stack();
        while (true) {
            String input = scan.readLine();
            while (input.length() > 100000) {
                input = scan.readLine();
            }
            String[] cut = input.split("\\$|#");
            int chain = 0;
            char[] word = input.toCharArray();
            if(cut[chain].equals("")){
                    chain++;
                }
            for (int j = 0; j < word.length; j++) {
                int length =cut.length;
                if (j == 0 && word[j] != '$' && word[j] != '#') {
                    q.add(cut[chain]);
                    chain++;
                } else if (word[j] == '$') {
                    if (chain<length){
                        q.add(cut[chain]);
                        chain++;
                    }
                } else if (word[j] == '#') {
                    if (chain<length){
                        s.add(cut[chain]);
                        chain++;
                    }
                }
            }
            s.removeAndPrint();
            q.removeAndPrint();
            System.out.println("");
        }

    }

}
