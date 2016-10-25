package fr.p10.miage.rps.model;

/**
 * Projet pooaTDD
 * Created by masalsed on 27/09/2016.
 */
public class RockPaperScissors {

    public Result play(RPSEnum p1, RPSEnum p2)
    {
        //P1
        String j1 = p1.getValue();
        String j2 = p2.getValue();

        if(j1.equals("PAPER") && j2.equals("ROCK"))
            return Result.WIN;
        else if(j1.equals("SCISSORS") && j2.equals("PAPER"))
            return Result.WIN;
        else if(j1.equals("ROCK") && j2.equals("SCISSORS"))
            return Result.WIN;
        else if (j1.equals(j2))
            return Result.TIE;
        else return Result.LOST;

    }
}
