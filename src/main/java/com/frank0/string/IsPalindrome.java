package com.frank0.string;

/**
 * @author tanyuanpeng
 * @desciption 验证回文串
 * @date 2019/11/24 5:44 下午
 **/
public class IsPalindrome {

    /**
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     *
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     *
     * 示例 1:
     *
     * 输入: "A man, a plan, a canal: Panama"
     * 输出: true
     * 示例 2:
     *
     * 输入: "race a car"
     * 输出: false
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 思路：
         * 然后采用两头开始比较进行循环处理
         * 可以采用什么算法？
         */
        //去掉
//        System.out.println(isPalindrome("adfsf"));
//        System.out.println(isPalindrome("ababa"));
//        System.out.println(isPalindrome("ababa1"));
//        System.out.println(isPalindrome("1abba1"));
        System.out.println(isPalindrome("a"));
    }

    /**
     * 加入给定字符串已经去掉符号，只包含数字与字符
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        int end = s.length()/2;
        for(int i=0;i<=end;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }



}
