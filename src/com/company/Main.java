package com.company;

public class Main {

    public static void main(String[] args) {

        (new Thread(new HelloRunnable())).start();

    }
}