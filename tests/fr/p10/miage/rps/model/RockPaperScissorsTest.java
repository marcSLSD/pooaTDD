package fr.p10.miage.rps.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Projet pooaTDD
 * Created by masalsed on 27/09/2016.
 */
public class RockPaperScissorsTest {

    RockPaperScissors rps;
    @BeforeMethod
    public void setUp() throws Exception {
        rps= new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        rps = null;
    }
    @DataProvider
    public Object[][] WinData() {
        return new Object[][] {
                { RPSEnum.SCISSORS,RPSEnum.PAPER},
                { RPSEnum.PAPER,RPSEnum.ROCK},
                {RPSEnum.ROCK,RPSEnum.SCISSORS}
        };
    }
    @DataProvider
    public Object[][] LostData() {
        return new Object[][] {
                { RPSEnum.PAPER,RPSEnum.SCISSORS},
                { RPSEnum.ROCK,RPSEnum.PAPER},
                {RPSEnum.SCISSORS,RPSEnum.ROCK}
        };
    }
    @DataProvider
    public Object[][] TieData() {
        return new Object[][] {
                {RPSEnum.SCISSORS,RPSEnum.SCISSORS},
                {RPSEnum.ROCK,RPSEnum.ROCK},
                {RPSEnum.PAPER,RPSEnum.PAPER}
        };
    }

    //@Parameters({"PAPER", "ROCK"})
    @Test(dataProvider = "WinData")
    public void testWinPlay(RPSEnum p1, RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2),Result.WIN);
    }

    //@Parameters({"PAPER", "PAPER"})
    @Test(dataProvider = "TieData")
    public void testTiePlay(RPSEnum p1, RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2),Result.TIE);
    }

    //@Parameters({"PAPER", "SCISSORS"})
    @Test(dataProvider = "LostData")
    public void testLostPlay(RPSEnum p1, RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2),Result.LOST);
    }
}