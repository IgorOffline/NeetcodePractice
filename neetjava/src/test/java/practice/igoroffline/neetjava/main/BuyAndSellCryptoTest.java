package practice.igoroffline.neetjava.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuyAndSellCryptoTest {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }

        return maxProfit;
    }

    @Test
    void maxProfit1() {
        Assertions.assertEquals(6, maxProfit(new int[]{10,1,5,6,7,1}));
    }

    @Test
    void maxProfit2() {
        Assertions.assertEquals(0, maxProfit(new int[]{10,8,7,5,2}));
    }

    @Test
    void maxProfit3() {
        Assertions.assertEquals(1, maxProfit(new int[]{1,2}));
    }

    @Test
    void maxProfit4() {
        Assertions.assertEquals(2, maxProfit(new int[]{1,0,2}));
    }
}
