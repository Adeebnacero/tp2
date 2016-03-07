package com.kabaso.domain;

import java.io.Serializable;

/**
 * Created by hashcode on 2016/03/07.
 */
public class ElectricityData implements Serializable{
    private int voltage;
    private int freq;
    private String source;

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ElectricityData data = (ElectricityData) o;

        return voltage == data.voltage;

    }

    @Override
    public int hashCode() {
        return voltage;
    }

    @Override
    public String toString() {
        return "ElectricityData{" +
                "voltage=" + voltage +
                '}';
    }
}
