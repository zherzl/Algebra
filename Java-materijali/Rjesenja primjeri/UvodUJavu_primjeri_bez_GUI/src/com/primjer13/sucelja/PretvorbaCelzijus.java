package com.primjer13.sucelja;

public class PretvorbaCelzijus implements Pretvaranja {

    @Override
    public double celzijusiUKelvine(double stupnjevaCelzijusovih) {
        return stupnjevaCelzijusovih + Pretvaranja.CuK;
    }

    @Override
    public double celzijusiUFahrenheite(double stupnjevaCelzijusovih) {
        return stupnjevaCelzijusovih * Pretvaranja.CuFFaktor + 32;
    }

}
