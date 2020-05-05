//@author minyue
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

public class q0014LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String output = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int n = strs[i].length();
            String temp = "";
            for (int j = 0; j < Math.min(output.length(),strs[i].length()); j++) {
                    if (output.charAt(j)==strs[i].charAt(j)){
                        temp = temp + output.charAt(j);
                    }
                    else {
                        output = temp;
                        break;
                    }
                }
            }
        return output;
    }
}

/* other solution
if (strs.length == 0) return "";
   String prefix = strs[0];
   for (int i = 1; i < strs.length; i++)
       while (strs[i].indexOf(prefix) != 0) {
           prefix = prefix.substring(0, prefix.length() - 1);
           if (prefix.isEmpty()) return "";
       }
   return prefix;
*/
