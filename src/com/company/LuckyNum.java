package com.company;
import java.util.Random;
/**
 * Created by Jessica Qin on 10/13/2016.
 */
public class LuckyNum
{

    public int perfRandom()
    {
        int goodNum = -1;

        for (int i = 0; i <= 100; i++)
        {
            Random rand = new Random();
            int randomNum = rand.nextInt(101);
            double sqrtAns = Math.sqrt(randomNum);
            int intSqrtAns = (int)sqrtAns;

            if (sqrtAns == intSqrtAns)
            {
                goodNum = randomNum;
                break;
            }
            else
            {
                continue;
            }

        }

        return goodNum;
    }
}
