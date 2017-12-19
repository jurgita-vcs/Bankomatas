package com.company;

import java.util.ArrayList;

public class Bankomat {
    private int balansas;
    private int komisiniai;

    ArrayList<String> transakcija = new ArrayList<>();

    public Bankomat(int balansas) {
        this.balansas = balansas;
    }


    public void paimtiPinigus(int pinigai) {
        if (this.balansas > 0 && (this.balansas - pinigai) > 0) {
            this.komisiniai = pinigai * 10 / 100;
            this.balansas -= (pinigai - komisiniai);
            transakcija.add("-" + pinigai);
        }
        else {
            System.out.println("Nepakanka pinigu. Pinigu likutis: " + this.balansas + ", o norite išsiimti " + pinigai);
        }
    }

    public void padetiPinigus(int pinigai) {
        this.komisiniai = pinigai * 2 / 100;
        this.balansas += (pinigai - komisiniai);
        transakcija.add("" + pinigai);
    }

    public int balansas() {
        return this.balansas;
    }

    public void menu(int num, int pinigai) {
        switch (num) {
            case 1: {
                paimtiPinigus(pinigai);
                break;
            }
            case 2: {
                padetiPinigus(pinigai);
                break;
            }
            case 3: {
                System.out.println("Balansas: " + balansas());
                break;
            }
            case 4: {
                System.out.println(transakcija);
                break;
            }
            case 5: {
                System.out.println("Nepamirškite pasiimti kortelės.");
                break;
            }
        }
    }

}
