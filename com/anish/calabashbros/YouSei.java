package com.anish.calabashbros;

import java.awt.Color;

public class YouSei extends Creature implements Comparable<YouSei> {
    public YouSei(Color color, int rank, World world) {
        super(color, (char) 1, world);
        this.rank = rank;
    }

    public int getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return String.valueOf(this.rank);
    }

    @Override
    public int compareTo(YouSei o) {
        return Integer.valueOf(this.rank).compareTo(Integer.valueOf(o.rank));
    }

    public void swap(YouSei another) {
        int x = this.getX();
        int y = this.getY();
        this.moveTo(another.getX(), another.getY());
        another.moveTo(x, y);
    }

    private int rank;

}
