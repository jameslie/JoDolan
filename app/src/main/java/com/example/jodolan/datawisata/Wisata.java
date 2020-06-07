package com.example.jodolan.datawisata;

public class Wisata {

    public String wisataName;
    public String wisataGmaps;
    public String wisataWaktu;
    public String wisataDeskripsi;
    public String wisataAlamat;
    private int wisataImage;

    public String getWisataGmaps() {
        return wisataGmaps;
    }

    public void setWisataGmaps(String wisataGmaps) {
        this.wisataGmaps = wisataGmaps;
    }

    public String getWisataAlamat() {
        return wisataAlamat;
    }

    public void setWisataAlamat(String wisataAlamat) {
        this.wisataAlamat = wisataAlamat;
    }
    public String getWisataName(){
        return wisataName;
    }
    public void setWisataName(String wisataName){
        this.wisataName = wisataName;
    }
    public int getWisataImage(){
        return wisataImage;
    }
    public void setWisataImage(int wisataImage){
        this.wisataImage = wisataImage;
    }

    public String getWisataWaktu() {
        return wisataWaktu;
    }

    public void setWisataWaktu(String wisataWaktu) {
        this.wisataWaktu = wisataWaktu;
    }

    public String getWisataDeskripsi() {
        return wisataDeskripsi;
    }

    public void setWisataDeskripsi(String wisataDeskripsi) {
        this.wisataDeskripsi = wisataDeskripsi;
    }
}
