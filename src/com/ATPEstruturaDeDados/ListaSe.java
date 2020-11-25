package com.ATPEstruturaDeDados;

/**
 * @autor Johnny Carvalho - 23:58
 * @create 24/11/2020
 */
public class ListaSe {
    public String color = "\u001B[";
    No first = null;
    No last = null;

    //constructor
    public ListaSe() {
    }

    public boolean Check() { // check if the list is empty!
        return first == null;
    }


    public void FirstInsert(String element, int frequency) {
        No newFound = new No(element, frequency);
        if (!Check()) { // if check is different from null...
            newFound.next = first;
            first = newFound;
        }
        else { // Else, if check is equal to null...
            first = newFound;
            last = newFound;
        }
    }

    public void InsertList(int elementNew[], int inferior, int superior) {
        int pivo;
        if (inferior >= superior){
            return;
        }

    }

    public void print() {
        No primary = first;
        while (primary!=null) {
            System.out.println((primary.dados)+" ["+color+"32"+"m"+primary.frequency+color+"m"+"]");
            primary = primary.next;
        }
    }
}
