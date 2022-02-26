package com.company;

public  class TitluCalatorieUrban extends TitluCalatorie{

    String denumireOperatorUrban;
    public TitluCalatorieUrban(int id, char denumire, float idLine, String dataStart, String dataStop, int idZona,String denumireOperatorUrban){
        super(id,denumire,idLine,dataStart,dataStop,idZona);
        this.denumireOperatorUrban=denumireOperatorUrban;
    }
    @Override
    public boolean equals(Object o){
        TitluCalatorieUrban t=(TitluCalatorieUrban) o;
        return super.equals(o) && t.getDenumireOperatorUrban().equals(this.denumireOperatorUrban);

    }

    public String getDenumireOperatorUrban() {
        return denumireOperatorUrban;
    }

    public void setDenumireOperatorUrban(String denumireOperatorUrban) {
        this.denumireOperatorUrban = denumireOperatorUrban;
    }
    @Override
    public String getIdZona(){
        String text =getIdZone() + " " + denumireOperatorUrban;
        return text;
    }



}
