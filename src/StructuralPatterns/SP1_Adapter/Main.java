package StructuralPatterns.SP1_Adapter;

import StructuralPatterns.SP1_Adapter.adapters.SquarePegAdapter;
import StructuralPatterns.SP1_Adapter.round.RoundHole;
import StructuralPatterns.SP1_Adapter.round.RoundPeg;
import StructuralPatterns.SP1_Adapter.square.SquarePeg;

public class Main {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println(hole.fits(roundPeg));

        SquarePeg squarePeg1 = new SquarePeg(7);
        SquarePeg squarePeg2 = new SquarePeg(8);

        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(squarePeg1);
        SquarePegAdapter squarePegAdapter2 = new SquarePegAdapter(squarePeg2);

        System.out.println(hole.fits(squarePegAdapter1));
        System.out.println(hole.fits(squarePegAdapter2));
    }
}
