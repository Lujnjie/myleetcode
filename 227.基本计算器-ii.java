import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=227 lang=java
 *
 * [227] 基本计算器 II
 */


// @lc code=start
class TSolutiont {
    public int calculate(String s) {
        char[] cArr = s.toCharArray();

        LinkedList<Integer> stack = new LinkedList<>();
        char operator = '+';
        int num = 0;
        for (int i = 0; i < cArr.length; i++) {
            if(Character.isDigit(cArr[i])) {
                num = num * 10 + (cArr[i] - '0');
            }
            if((!Character.isDigit(cArr[i]) && cArr[i] != ' ') || i== cArr.length-1) {
                switch(operator) {
                    case '+' : 
                        stack.push(num);
                        break;
                    case '-' : 
                        stack.push(-num);
                        break;
                    case '*' : 
                        stack.push(stack.pop() * num);
                        break;
                    case '/' :
                        stack.push(stack.pop() / num);
                }
                operator = cArr[i];
                num = 0;
            }
        }

        int ans = 0;
        while(!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }
}
// @lc code=end

