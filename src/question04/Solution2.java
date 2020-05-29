package question04;

/**
 * - 剑指offer的思路.就是一个空格变成了%20，也就是说每有一个空格，长度要增加2，所以首先先计算有多少个空格，这样长度就能增加多少，得到增加后的长度Length。
 * - 然后new一个Length长度的字符数组，从尾到头开始复制原来的数组，如果复制过程中，如果字符不是空格，直接复制，
 * 如果字符是空格，那么需要把这个空格变成%20
 * （这个复制过程就是把新建的数组比如现在到了 K这个位置，然后就是K，K-1，K-2这三个位置依次变成0,2，%这三个字符，因为是从后往前复制的所以是倒序）
 * - 重复这个过程就行。
 * - 如果相等，返回true;
 */
public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        //计算出空格的数目
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        //计算出变化后的数组长度的最后下标
        int newIndex = spaceCount * 2 + str.length() - 1;
        int oldIndex = str.length() - 1;
        //设置新的空间长度
        str.setLength(spaceCount * 2 + str.length());
        //替换
        //边界条件 从后到最前
        while (oldIndex >= 0) {
            if (str.charAt(oldIndex) == ' ') {
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');
            } else {
                str.setCharAt(newIndex--, str.charAt(oldIndex));
            }
            oldIndex--;
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        StringBuffer buffer = new StringBuffer("hello world");
        String res = s.replaceSpace(buffer);
        System.out.println(res);
    }
}
