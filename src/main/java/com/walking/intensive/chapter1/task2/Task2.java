package com.walking.intensive.chapter1.task2;

/**
 * �������: <a href="https://geometry-math.ru/homework/Java-house.html">������</a>
 */
public class Task2 {
    public static void main(String[] args) {
//        ��� ����������� �������� ������ ������ ����� ��������� � ���� ������
        int floorAmount = 4;
        int entranceAmount = 4;

        for (int i = 0; i < floorAmount * entranceAmount * 4 + 2; i++) {
            System.out.println(getFlatLocation(floorAmount, entranceAmount, i));
        }
    }

    static String getFlatLocation(int floorAmount, int entranceAmount, int flatNumber) {
        //        ����� ��� ������ ����

        //�������� �� ������������ ������
        if (floorAmount < 1) {
            return "� ���� �� ����� ���� ����� 1 �����";
        }

        //�������� �� ������������ ���������� ���������
        if (entranceAmount < 1) {
            return "� ���� �� ����� ���� ����� 1 ��������";
        }

        final int FLATS_PER_FLOOR = 4; // ��������� ��� ���������� ������� �� �����
        int flatAmmount = floorAmount * entranceAmount * FLATS_PER_FLOOR; // ���������� ������ ���������� �������

        //������� �������� �� ������� �������� � ����
        if (flatNumber < 1 || flatNumber > flatAmmount) {
            return "����� �������� �� ����������";
        }

        int entranceNumber = (int) Math.ceil((double) flatNumber / (floorAmount * FLATS_PER_FLOOR)); // ���������� ��������. NB:��������, ����c����� ����� ������� ������ ��������� ������� ����� � ������� �������.

        int floorNumber = (int) Math.ceil((((double) flatNumber - (floorAmount * FLATS_PER_FLOOR * (entranceNumber - 1))) / FLATS_PER_FLOOR)); // ���������� �����, ���� ����� ���� �����

        String destination;
        //����������� �������� �� �����
        switch (flatNumber % 4) {
            case 0:
                destination = "������ �� �����, ������";
                break;
            case 1:
                destination = "����� �� �����, �����";
                break;
            case 2:
                destination = "����� �� �����, ������";
                break;
            default:
                destination = "������ �� �����, �����";
                break;
        }

        return flatNumber + " �� - " + entranceNumber + " �������, " + floorNumber + " ����, " + destination;
    }
}