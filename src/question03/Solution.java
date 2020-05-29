package question03;

/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return false;
        }
        //1.计算出二维数组的行和列,由于下标从0开始故-1
        int rows = array.length - 1;
        int columns = array[0].length - 1;
        //2.设置动态的行、列索引,初始值为右上角第一行最后一列的数
        int i = 0;
        int j = array[0].length - 1;
        //3.设置初识对比数为右上角的数，左边的值比它小，右边的值比它大
        //4.循环条件为 超出边界
        while (i<=rows && j>=0) {
            if (array[i][j] > target) {
                //target比右上角小 故在右上角的左边 删除一列
                j--;
            } else if (array[i][j] < target) {
                //target比右上角大 故在右上角的下边 删除一行
                i++;
            } else {
                //target和对比数相等了 即找到了
                return true;
            }
        }

        return false;
    }

}