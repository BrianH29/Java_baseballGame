package com.bh;

import com.bh.baseballGame.Result;
import com.bh.baseballGame.Setup;

public class Run {

    public static void main(String[] args) {
        Setup set = new Setup();
        int cnt = 0;

        int[] randomNo = set.randomNumber();

        while (true) {
            cnt++;
            int[] inputNo = set.inputNumber();
            Result result = set.compareNumber(randomNo, inputNo);

            set.printResult(result);

            if (set.endGame(result)) {
                System.out.printf("it took %d turns to finish", cnt);
                break;
            }
        }
    }
}
