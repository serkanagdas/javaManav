/*Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL

Örnek Çıktı;

 */

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        double armut, elma, domates, muz, patlican, toplam;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen Kaç kg Armut aldığınızı Girin: ");
        armut = input.nextDouble();
        System.out.print("Lütfen Kaç kg Armut aldığınızı Girin: ");
        elma = input.nextDouble();
        System.out.print("Lütfen Kaç kg Armut aldığınızı Girin: ");
        domates = input.nextDouble();
        System.out.print("Lütfen Kaç kg Armut aldığınızı Girin: ");
        muz= input.nextDouble();
        System.out.print("Lütfen Kaç kg Armut aldığınızı Girin: ");
        patlican = input.nextDouble();

        toplam= (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
        System.out.println("Toplam Ödemeniz Gereken Tutar= "+toplam);


    }
}
