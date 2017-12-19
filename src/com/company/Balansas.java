package com.company;

public class Balansas extends Bankomat {

    public Balansas(int balansas) {
        super(balansas);
    }

    public void pakankamasBalansas(int balansas, int pinigai) throws InvalidBalansas {
        if (super.balansas() > 0) {
            balansas -= balansas;
            //System.out.println("Nepakankamas balansas.");
        }
        else {
            throw new InvalidBalansas("Nepakankamas balansas.");
        }
    }

}
