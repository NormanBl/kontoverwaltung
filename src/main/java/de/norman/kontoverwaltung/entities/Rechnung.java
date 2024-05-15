package de.norman.kontoverwaltung.entities;

public class Rechnung {
    private Kategorie kategorie;
    private int summe;


    public Rechnung(Kategorie kategorie, int summe) {
        this.kategorie = kategorie;
        this.summe =summe;
    }
}
