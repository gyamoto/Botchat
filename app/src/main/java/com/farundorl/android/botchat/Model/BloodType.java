package com.farundorl.android.botchat.Model;

public enum BloodType {
    A("A"),
    B("B"),
    O("O"),
    AB("AB");

    private final String name;

    BloodType(String string) {
        this.name = string;
    }

    public String toString() {
        return name;
    }

    public static BloodType valueOfName(String name) {
        for (BloodType bloodType : values()) {
            if (bloodType.name.equals(name)) {
                return bloodType;
            }
        }
        throw new IllegalArgumentException("no such enum object for the id: " + name);
    }
}
