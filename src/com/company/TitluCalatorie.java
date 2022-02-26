package com.company;

public abstract class TitluCalatorie {

    private int id;
    private char denumire;
    private float idLine;
    private String dataStart;
    private String dataStop;
    private  final int idZona;

    public TitluCalatorie(int id, char denumire, float idLine, String dataStart, String dataStop, int idZona) {
        this.id = id;
        this.denumire = denumire;
        this.idLine = idLine;
        this.dataStart = dataStart;
        this.dataStop = dataStop;
        this.idZona = idZona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getDenumire() {
        return denumire;
    }

    public void setDenumire(char denumire) {
        this.denumire = denumire;
    }

    public float getIdLine() {
        return idLine;
    }

    public void setIdLine(float idLine) {
        this.idLine = idLine;
    }

    public String getDataStart() {
        return dataStart;
    }

    public void setDataStart(String dataStart) {
        this.dataStart = dataStart;
    }

    public String getDataStop() {
        return dataStop;
    }

    public void setDataStop(String dataStop) {
        this.dataStop = dataStop;
    }
    public int getIdZone(){
        return idZona;
    }
    public abstract String getIdZona();

    @Override

    public boolean equals(Object o){
        TitluCalatorie t=(TitluCalatorie) o;
        return t.getId()==this.id && t.getDenumire()==this.denumire && t.getIdLine()==this.idLine && t.getDataStart().equals(this.dataStart) && t.getDataStop().equals(this.dataStop);
    }

}
