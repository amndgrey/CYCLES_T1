package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int actual = service.countSquaredRange(200, 300);
    }
}