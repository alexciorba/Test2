package com.company;

public class Matrice {
    private  int nrLinii;
    private int nrColoane;
    private Object o;

    public Matrice(int nrLinii, int nrColoane, Object o) {
        this.nrLinii = nrLinii;
        this.nrColoane = nrColoane;
        this.o = o;
    }

    public int getNrLinii() {
        return nrLinii;
    }

    public void setNrLinii(int nrLinii) {
        this.nrLinii = nrLinii;
    }

    public int getNrColoane() {
        return nrColoane;
    }

    public void setNrColoane(int nrColoane) {
        this.nrColoane = nrColoane;
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    @Override
    public boolean equals(Object o){
        Matrice m=(Matrice) o;
        return m.getNrColoane()==this.nrColoane && m.getNrLinii()==this.nrLinii;
    }

}
