package com.example.project;
public class Calculate {

    float height;
    float weight;

    public Calculate()
    {

    }

    public Calculate(float h, float w) {
        this.height = h;
        this.weight=w;
    }

    public float getH() {
        return height;
    }

    public float getW() {
        return weight;
    }

    public void setH(float h) {
        this.height = h;
    }

    public void setW(float w) {
        this.weight = w;
    }
}
