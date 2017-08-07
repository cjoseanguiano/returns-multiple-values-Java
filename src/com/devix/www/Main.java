package com.devix.www;

public class Main {

    public static void main(String[] args) {
        Data data = new Data();
        getTwoValues(data);
        System.out.println(data.name);
        System.out.println(data.size);
    }

    private static void getTwoValues(Data data) {
        data.name = "Java";
        data.size = 100;
    }

    private static class Data {
        public String name;
        public int size;
    }
}
