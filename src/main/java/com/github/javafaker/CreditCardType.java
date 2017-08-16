package com.github.javafaker;

import java.util.Random;

public enum CreditCardType {
    VISA,
    MASTER,
    HIPER,
    DINERS_CLUB,
    JCB,
    AMEX,
    ELO;

    public static CreditCardType getCreditCardType() {
        CreditCardType[] values = CreditCardType.values();
        Random random = new Random();
        return values[random.nextInt(values.length - 1)];
    }
}
