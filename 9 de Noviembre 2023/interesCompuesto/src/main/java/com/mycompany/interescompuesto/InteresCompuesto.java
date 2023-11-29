/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interescompuesto;

/**
 *
 * @author fernando
 */
public class InteresCompuesto {

        public static String interescom(double a, double b, int c, int d) {
        double dinerito = a * Math.pow(1 + (b / c), c * d) - a;
        return Double.toString(dinerito);
    }

    public static void main(String[] args) {
        double a = 5000;
        double b = 0.05;
        int c = 12;
        int d = 10;

        String beneficio = interescom(a, b, c, d);
        System.out.println("Tu beneficio es: " + beneficio);
    }

}


