package question04;
/**
 * 从后往前遍历,然后再反转
 * */
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuilder res = new StringBuilder();
        int index = str.length()-1;
        for (int i = index; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                res.append("02%");
            }else{
                res.append(str.charAt(i));
            }
        }
        return res.reverse().toString();
    }
}