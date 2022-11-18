import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */
    class Solution111 {
        private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
            put('{','}'); put('[',']'); put('(',')');
        }};

        public static boolean isValid(String s) {
            LinkedList<Character> list = new LinkedList<Character>();
            for (Character c : s.toCharArray()) {
                if(map.containsKey(c)) {
                    list.addLast(c);
                } else if(list.size() == 0) {
                    return false;
                } else if(!map.get(list.removeLast()).equals(c)){
                    return false;
                }
            }
            return list.size() == 0;
        }
        public static void main(String[] args) {
            isValid("()");
        }
    }

// @lc code=start
class Solution {
    private static final Map<Character, Character> map = new HashMap<Character, Character>() {{
        put('{','}'); put('[',']'); put('(',')');
    }};

    public boolean isValid(String s) {
        LinkedList<Character> list = new LinkedList<Character>();
        for (Character c : s.toCharArray()) {
            if(map.containsKey(c)) {
                list.addLast(c);
            } else if(list.size() == 0) {
                return false;
            } else if(!map.get(list.removeLast()).equals(c)){
                return false;
            }
        }
        return list.size() == 0;
    }
}
// @lc code=end

