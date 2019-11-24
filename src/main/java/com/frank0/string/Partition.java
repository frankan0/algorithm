package com.frank0.string;

import java.util.ArrayList;
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

    }

    public static List<List<String>> partition(String s) {
        if (s.length()==0){
            return new ArrayList<>();
        }

        return new ArrayList<>();
    }
}
