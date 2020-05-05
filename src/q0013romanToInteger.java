//@author minyue
//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

//consider how to deal with IV, IX, XL, XC, CD, CM.
//one solution is IV = I + V - I - I, which means IV = 1 + 5 - 2.

public class q0013romanToInteger {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int num = 0;
        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == 'I' && (ch[i + 1] == 'V' || ch[i + 1] == 'X'))
                num -= 2;
            if (ch[i] == 'X' && (ch[i + 1] == 'L' || ch[i + 1] == 'C'))
                num -= 20;
            if (ch[i] == 'C' && (ch[i + 1] == 'D' || ch[i + 1] == 'M'))
                num -= 200;
        }
        for (char c : ch)  //for (int i = 0; i < ch.length; i++)
            switch (c) {
                case 'M': {
                    num += 1000;
                    continue;
                }
                case 'D': {
                    num += 500;
                    continue;
                }
                case 'C': {
                    num += 100;
                    continue;
                }
                case 'L': {
                    num += 50;
                    continue;
                }
                case 'X': {
                    num += 10;
                    continue;
                }
                case 'V': {
                    num += 5;
                    continue;
                }
                default: {
                    num += 1;
                    continue;
                }
            }
        return num;
    }
}

/*other solution
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int output = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                output += map.get(s.charAt(i));
            } else {
                output += -map.get(s.charAt(i));
            }
        }
        output += map.get(s.charAt(s.length() - 1));
        return output;
    }
 */
