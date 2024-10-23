package edu.ntnu.idi.idatt;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ArbTaker {
  private Person personalia;
  private int arbeidstakerNr;
  private int ansettelsesaar;
  private double maanedslonn;
  private double skatteprosent;
  private int aar;

  public ArbTaker(Person personalia, int arbeidstakerNr, int ansettelsesaar, double maanedslonn, double skatteprosent) {
    this.personalia = personalia;
    this.arbeidstakerNr = arbeidstakerNr;
    this.ansettelsesaar = ansettelsesaar;
    this.maanedslonn = maanedslonn;
    this.skatteprosent = skatteprosent;
    Calendar kalender = new GregorianCalendar();
    int aar = kalender.get(Calendar.YEAR);

  }

  public double skattetrekkPernaaned() {
    return this.maanedslonn * this.skatteprosent / 100;
  }

  public double bruttoLonnPerAar(){
    return maanedslonn * 12;
  }

  public double skattetrekkPerAar(){
    double skattetrekkPerAar = 0;
    skattetrekkPerAar += skattetrekkPernaaned()*10;
    skattetrekkPerAar += skattetrekkPernaaned()/10;//halv skatt i desember
    //ingen skattetrekk i juni
    return skattetrekkPerAar;
  }

  public String hentNavn(){
    return personalia.getEtternavn() + ", " + personalia.getFornavn();
  }

  public int hentAlder(){
    return aar - personalia.getFodselsaar();
  }

  public int antallAarIBedriften(){
    return aar - personalia.getFodselsaar();
  }

  public boolean ansattFlereAarEnn(int inpAar){
    return antallAarIBedriften() > inpAar;
  }




  //Settere
  public void setAnsettelsesaar(int ansettelsesaar) {
    this.ansettelsesaar = ansettelsesaar;
  }
  public void setMaanedslonn(double maanedslonn) {
    this.maanedslonn = maanedslonn;
  }
  public void setSkatteprosent(double skatteprosent) {
    this.skatteprosent = skatteprosent;
  }


  //Gettere
  public Person getPersonalia() {
    return personalia;
  }
  public int getArbeidstakerNr() {
    return arbeidstakerNr;
  }
  public int getAnsettelsesaar() {
    return ansettelsesaar;
  }
  public double getMaanedslonn() {
    return maanedslonn;
  }
  public double getSkatteprosent() {
    return skatteprosent;
  }
}

