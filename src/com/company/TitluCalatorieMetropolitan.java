package com.company;

public abstract class TitluCalatorieMetropolitan extends TitluCalatorie {
    String denumireOperatorMetropolitan;
    public TitluCalatorieMetropolitan(int id, char denumire, float idLine, String dataStart, String dataStop, int idZona,String denumireOperatorMetropolitan){
        super(id,denumire,idLine,dataStart,dataStop,idZona);
        this.denumireOperatorMetropolitan=denumireOperatorMetropolitan;
    }

    public String getDenumireOperatorMetropolitan() {
        return denumireOperatorMetropolitan;
    }

    public void setDenumireOperatorMetropolitan(String denumireOperatorMetropolitan) {
        this.denumireOperatorMetropolitan = denumireOperatorMetropolitan;
    }
    @Override
    public boolean equals(Object o){
        TitluCalatorieMetropolitan t=(TitluCalatorieMetropolitan) o;
        return super.equals(o) && t.getDenumireOperatorMetropolitan().equals(this.denumireOperatorMetropolitan);

    }
}
