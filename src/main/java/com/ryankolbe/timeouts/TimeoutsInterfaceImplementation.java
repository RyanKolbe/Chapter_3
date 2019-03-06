package com.ryankolbe.timeouts;

import java.util.Random;

public class TimeoutsInterfaceImplementation implements TimeoutsInterface {
    @Override
    public int countTime(Random randomNumber) {
        randomNumber = new Random();
        return  randomNumber.nextInt();
    }
}
