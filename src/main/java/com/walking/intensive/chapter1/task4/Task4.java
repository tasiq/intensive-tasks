package com.walking.intensive.chapter1.task4;

/**
 * �������: <a href="https://geometry-math.ru/homework/Java-parameter.html">������</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        ��� ����������� �������� ������ ������ ����� ��������� � ���� ������
        double a = 5;
        double b = 3;
        double c = -100;

        System.out.println(solveQuadraticEquation(a, b, c));

    }

    /**
     * ��� ������������ ������, ����� ��������� ������ ����������� �� �����������.
     * <p>
     * ������� �������������� ������:
     * <p>
     * ���������� �������: 2. �����: -4;4
     * <p>
     * ���������� �������: 1. ������: 0
     * <p>
     * ���������� �������: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {
        //        ����� ��� ������ ����

        if (a == 0 && b == 0 && c == 0) {
            return "������� ����������";
        }

        if (a == 0 && b == 0) {
            return "��� �������";
        }

        if (a == 0) {
            double x = -c / b;
            return "���������� �������: 1, ������: " + x;
        }

        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            return "���������� �������: 0";
        }
        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            return "���������� �������: 2, �����: " + Math.min(x1, x2) + " ; " + Math.max(x1, x2);
        } else {
            double x = -b / (2 * a);

            return "���������� �������: 1, ������: " + x;
        }
    }
}