package main;

import java.util.Date;

public class Board {
    private Box box;
    private Piece ArrayList;
    private Date creatianDate;
    public Board( Date creatianDate,Piece arrayList){
        this.creatianDate=creatianDate;
        this.ArrayList=arrayList;
        this.box=new Box();
    }

    public Board() {

    }

    public Piece getPieces() {
        return ArrayList;
    }

    public Piece getArrayList() {
        return ArrayList;
    }


    public void setPieces(Piece arrayList){
        ArrayList=arrayList;
    }
    public void resetBoard(){}

}
