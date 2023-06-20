package com.example.memberview;

public class NotaModel {
    private Integer nomer_nota;
    private String nama_kasir;
    private Integer grand_total;
    private String pembayaran;
    private String tanggal_ambil;

    public NotaModel(Integer nomer_nota, String nama_kasir, Integer grand_total, String pembayaran, String tanggal_ambil) {
        this.nomer_nota = nomer_nota;
        this.nama_kasir = nama_kasir;
        this.grand_total = grand_total;
        this.pembayaran = pembayaran;
        this.tanggal_ambil = tanggal_ambil;
    }

    public Integer getNomer_nota() {
        return nomer_nota;
    }

    public String getNama_kasir() {
        return nama_kasir;
    }

    public Integer getGrand_total() {
        return grand_total;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public String getTanggal_ambil() {
        return tanggal_ambil;
    }

    public void setNomer_nota(Integer nomer_nota) {
        this.nomer_nota = nomer_nota;
    }

    public void setNama_kasir(String nama_kasir) {
        this.nama_kasir = nama_kasir;
    }

    public void setGrand_total(Integer grand_total) {
        this.grand_total = grand_total;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }

    public void setTanggal_ambil(String tanggal_ambil) {
        this.tanggal_ambil = tanggal_ambil;
    }
}
