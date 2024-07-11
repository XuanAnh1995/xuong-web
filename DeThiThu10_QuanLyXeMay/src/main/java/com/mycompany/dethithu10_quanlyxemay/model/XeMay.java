/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dethithu10_quanlyxemay.model;

/**
 *
 * @author ADMIN
 */
public class XeMay {

    private String ma;
    private String ten;
    private double giaBan;
    private int soLuong;
    private int trangThai;
    private double thanhTien;

    public XeMay() {
    }

    public XeMay(String ma, String ten, double giaBan, int soLuong, int trangThai, double thanhTien) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
        this.thanhTien = thanhTien;
    }

    public XeMay(String ma, String ten, double giaBan, int soLuong, int trangThai) {
        this.ma = ma;
        this.ten = ten;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

}
