package com.ATPEstruturaDeDados;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<ListaSe> ListaSe;


    public static void main(String[] args) {

        ListaSe = new ArrayList<ListaSe>();


        try (Scanner input = new Scanner(System.in)) {// input from data

            // create new object
            ListaSe list = new ListaSe();

            list.FirstInsert("Arquivo 55.txt", 23);
            list.FirstInsert("Arquivo 12.txt", 14);
            list.FirstInsert("Arquivo 78.txt", 5);

            list.FirstInsert("Arquivo 65.txt", 8);


            ListaSe.add(list);

        }

        catch (Exception e) {
            System.out.println("Erro ao escrever o arquivo!");

        }
        for (ListaSe list : ListaSe) {
            list.print();


        }
    }
}

