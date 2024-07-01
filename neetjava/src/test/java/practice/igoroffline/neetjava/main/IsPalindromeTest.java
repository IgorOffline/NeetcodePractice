package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPalindromeTest {

    public boolean isPalindrome(String s) {
        var sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            var ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        var s2 = sb.toString();
        for (int i = 0; i < s2.length() / 2; i++) {
            if (s2.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    @Test
    void isPalindrome1() {
        Assertions.assertTrue(isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    void isPalindrome2() {
        Assertions.assertFalse(isPalindrome("tab a cat"));
    }

    @Test
    void isPalindrome3() {
        Assertions.assertTrue(isPalindrome("t"));
    }
}
