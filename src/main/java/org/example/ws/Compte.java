package org.example.ws;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date location;

    public Compte(int code, double solde, Date location) {
        this.code = code;
        this.solde = solde;
        this.location = location;
    }

    public Compte() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getLocation() {
        return location;
    }

    public void setLocation(Date location) {
        this.location = location;
    }
}
