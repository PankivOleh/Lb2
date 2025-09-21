package org.example;
import pack.Product;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

    }
    public static ArrayList<Product> createList(){
        int id;
        String name;
        String vurobnuk;
        Scanner sc = new Scanner(System.in);
        int zina , termin , kilkist;
        ArrayList<Product> products = new ArrayList<>();
        while(true) {
            System.out.println("Введіть id товару( 0 щоб зупинити ввід): ");
            id = sc.nextInt();
            if(id==0){break;}
            System.out.println("Введіть назву товару: ");
            name = sc.nextLine();
            System.out.println("Введіть виробника товару: ");
            vurobnuk = sc.nextLine();
            System.out.println("Введіть ціну товару: ");
            zina = sc.nextInt();
            System.out.println("Введіть термін придатності товару(в місяцях): ");
            termin = sc.nextInt();
            System.out.println("Введіть кількість товару: ");
            kilkist = sc.nextInt();
            Product prod = new Product(id , name,vurobnuk,zina,termin,kilkist);
            products.add(prod);
        }
        return products;
    }

}