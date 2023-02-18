/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fpoly.qlsv.entity;

/**
 *
 * @author hoang
 */
public class DiemSV {

    private String MaSV;
    private String MaMon;
    private double Lab;
    private double Assment;
    private double Quiz;
    private double diemTB;

    public DiemSV() {
    }

    public DiemSV(String MaSV, String MaMon, double Lab, double Assment, double Quiz, double diemTB) {
        this.MaSV = MaSV;
        this.MaMon = MaMon;
        this.Lab = Lab;
        this.Assment = Assment;
        this.Quiz = Quiz;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public double getLab() {
        return Lab;
    }

    public void setLab(double Lab) {
        this.Lab = Lab;
    }

    public double getAssment() {
        return Assment;
    }

    public void setAssment(double Assment) {
        this.Assment = Assment;
    }

    public double getQuiz() {
        return Quiz;
    }

    public void setQuiz(double Quiz) {
        this.Quiz = Quiz;
    }

    public double getDiemTB() {
        return (Lab + Assment + Quiz)/3;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

}
