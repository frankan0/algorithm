package com.frank0.string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author tanyuanpeng
 * @desciption
 * @date 2019/11/24 6:12 下午
 **/
public class Partition {

    /**
     * 给定一个字符串 s，将 s 分割成一些子串，使每个子串都是回文串。
     *
     * 返回 s 所有可能的分割方案。
     *
     * 示例:
     *
     * 输入: "aab"
     * 输出:
     * [
     *   ["aa","b"],
     *   ["a","a","b"]
     * ]
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 思路：
         * 1.以首字母最小回文开始，一直遍历整个字符串
         * 2.感觉像回溯法
         */

        List<List<String>> result = partition("addddsbsab");

        for (List<String> item : result) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String s : item) {
                stringBuilder.append(s).append(",");
            }
            System.out.println(stringBuilder.toString());
        }

    }

    public static List<List<String>> partition(String s) {

        if (s.length()==0){
            return new ArrayList<>();
        }
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> stringList = new ArrayList<>();
        splitPartition(0,s,stringList,result);
        return result;
    }

    private static void splitPartition(int startIndex, String s,List<String> stringList,List<List<String>> result) {
        if (startIndex == s.length()){
            //以startIndex为开始index的后续字符串遍历完毕
            List<String> p = new ArrayList<String>(stringList);
            result.add(p);
            return ;
        }
        for(int i = startIndex ;i<s.length();i++){
            //从第i个字符开始分割
            String testString = s.substring(startIndex, i + 1);
            if (IsPalindrome.isPalindrome(testString)){
                stringList.add(testString);
                splitPartition(i+1,s,stringList,result);
                //为什么要删掉？因为result.add已经p 已经删掉了便于下次从头开始
                stringList.remove(stringList.size()-1);
            }
        }
    }
}
