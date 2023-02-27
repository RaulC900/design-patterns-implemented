package StructuralPatterns.SP1_Adapter.adapters;

import StructuralPatterns.SP1_Adapter.round.RoundPeg;
import StructuralPatterns.SP1_Adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return (peg.getWidth() * Math.sqrt(2)) / 2;
    }
}
