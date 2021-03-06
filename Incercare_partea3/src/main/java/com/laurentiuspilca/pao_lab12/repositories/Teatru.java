package com.laurentiuspilca.pao_lab12.repositories;

import com.laurentiuspilca.pao_lab12.model.Eveniment;

public class Teatru extends Eveniment {

    private int i;
    private Tip_Teatru tip_teatru;
    String nume;

    public Tip_Teatru getTip_teatru() {
        return tip_teatru;
    }

    public void setTip_teatru(Tip_Teatru tip_teatru) {
        this.tip_teatru = tip_teatru;
    }

    public Teatru(int duration_h, int duration_m, double price, int locuri, int id, int i, Tip_Teatru tip_teatru, String nume) {
        super(duration_h, duration_m, price, locuri, id);
        this.i = i;
        this.tip_teatru = tip_teatru;
        this.nume = nume;
    }

    public Teatru(int i, Tip_Teatru tip_teatru, String nume) {
        this.i = i;
        this.tip_teatru = tip_teatru;
        this.nume = nume;
    }

    public void print()
    {
        System.out.println("Nr produs: "+this.getId()+"\n"+"Teatru:\n"+"Spectacolul dureaza "+this.getDuration_h()+" ore si "+this.getDuration_m()+" de minute\n"+
                            "Pretul este de: "+this.getPrice()+" de lei \n"+
                            "Sunt disponibile "+this.getLocuri()+" locuri\n"+
                            "Tipul teattrului este "+this.tip_teatru+"\n\n");
    }





}
