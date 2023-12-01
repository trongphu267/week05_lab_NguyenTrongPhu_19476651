package com.example.week05_lab_nguyentrongphu_19476651.backend.enums;

public enum Country {
    VIETNAM(1),
    LAO(2),
    TRUNGQUOC(3),
    ANDO(4);
    private int value;
    Country(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
