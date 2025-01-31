package refactoring_guru.structural.adapter.adapters;

import refactoring_guru.structural.adapter.round.RoundPeg;
import refactoring_guru.structural.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
