package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidateParenthesesTest {

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        java.util.Stack<Character> stack = new java.util.Stack<>();

        var leftArr = new char[] { '(', '[', '{' };
        var rightArr = new char[] { ')', ']', '}' };
        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            boolean chIsLeft = false;
            for (int iLeft = 0; iLeft < leftArr.length; iLeft++) {
                if (leftArr[iLeft] == ch) {
                    stack.push(ch);
                    chIsLeft = true;
                    break;
                }
            }
            if (chIsLeft) continue;
            for (int iRight = 0; iRight < rightArr.length; iRight++) {
                if (rightArr[iRight] == ch) {
                    if (stack.empty()) return false;
                    var popped = stack.pop();
                    if (popped != leftArr[iRight]) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    @Test
    void isValid1() {
        Assertions.assertTrue(isValid("[]"));
    }

    @Test
    void isValid2() {
        Assertions.assertTrue(isValid("([{}])"));
    }

    @Test
    void isValid3() {
        Assertions.assertFalse(isValid("[(])"));
    }

    @Test
    void isValid4() {
        Assertions.assertFalse(isValid("]]"));
    }
}
