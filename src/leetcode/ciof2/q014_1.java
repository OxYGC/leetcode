package leetcode.ciof2;

/**
 * 剪绳子
 * Description:
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * 示例 1：
 * 输入: 2
 * 输出: 1
 * 解释: 2 = 1 + 1, 1 × 1 = 1
 *
 * 示例 2:
 * 输入: 10
 * 输出: 36
 * 解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36
 *
 * 分析:
 * 动态规划/贪心算法
 * 数学模型：把一个整数分成若干个整数的和,这几个整数的积最大能是多少. 确定当前问题是由哪两个最优子问题构成，这样只能一个一个试,跟暴力算法差不多,顶多算个递推，
 * 其实最优子问题就是取三最多的两个,如果知道这个特性就是考察的是数学能力了。不知道这个特性就只能暴力递推了。
 *
 * @Author: YangGC
 * DateTime: 05-14
 */
public class q014_1 {

    public int cuttingRope(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int a = n / 3;
        int b = n % 3;
        /**
         * 看是否能被3整除,如果可以的话就是3的a次方
         * 如果余1：就是 3的(a-1)次方 乘以2再乘以2 (把最后一个3和1 拆分成2和2相乘)
         * 比如 10
         * 3*3*3*1 或者 3*3*2*2
         *
         * 如果余2 就是 多少个3相乘然后乘以最后一个2
         */
        if (b == 0) {
            return (int) Math.pow(3,a);
        }
        if (b == 1) {
            return (int) Math.pow(3, a - 1) * 2 * 2;
        }
        //剩下就是余数为2了
        return (int) Math.pow(3, a) * 2;
    }

}
