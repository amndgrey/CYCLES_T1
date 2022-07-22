package ru.netology.sqr;

public class SQRService {

    public int countSquaredRange(int borderMin, int borderMax) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= borderMin && x <= borderMax) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}