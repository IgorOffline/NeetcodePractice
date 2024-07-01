package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsAnagramTest {

    public boolean isAnagram(String s, String t) {
        java.util.Map<Character, Integer> sMap = new java.util.HashMap<>();
        java.util.Map<Character, Integer> tMap = new java.util.HashMap<>();
        for (var sCh : s.toCharArray()) {
            if (!sMap.containsKey(sCh)) {
                sMap.put(sCh, 1);
            } else {
                sMap.put(sCh, sMap.get(sCh) + 1);
            }
        }
        for (var tCh : t.toCharArray()) {
            if (!tMap.containsKey(tCh)) {
                tMap.put(tCh, 1);
            } else {
                tMap.put(tCh, tMap.get(tCh) + 1);
            }
        }

        return sMap.equals(tMap);
    }

    @Test
    void isAnagram1() {
        var s = "racecar";
        var t = "carrace";
        Assertions.assertTrue(isAnagram(s, t));
    }

    @Test
    void isAnagram2() {
        var s = "jar";
        var t = "jam";
        Assertions.assertFalse(isAnagram(s, t));
    }
}
