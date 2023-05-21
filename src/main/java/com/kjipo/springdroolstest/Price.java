package com.kjipo.springdroolstest;

public class Price {
    private int kroner;
    private int oere;


    public Price(int kroner, int oere) {
        this.kroner = kroner;
        this.oere = oere;
    }


    public int getKroner() {
        return kroner;
    }

    public void setKroner(int kroner) {
        this.kroner = kroner;
    }

    public int getOere() {
        return oere;
    }

    public void setOere(int oere) {
        this.oere = oere;
    }
}
