package application;

import entities.LinkedList;
import utils.ConsoleUtils;

public class Program {

    public static void main(String[] args) {
        LinkedList<Integer> lista_ligada = new LinkedList<>();
        
        ConsoleUtils.clear();
        
        System.out.println("Lista vazia (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        System.out.println();
        

        for(int i=1; i<= 6; i++) {
        	lista_ligada.addLast(i);
        }
        for(int i=8; i<= 10; i++) {
        	lista_ligada.addLast(i);
        }
        System.out.println("addLast (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        System.out.println();
        
        
        lista_ligada.addFirst(0);
        System.out.println("addFirst (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        System.out.println();


        lista_ligada.addMiddle(7, 7);
        System.out.println("addMiddle (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        System.out.println();


        lista_ligada.removeFirst();
        System.out.println("removeFirst (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        System.out.println();


        lista_ligada.removeLast();
        System.out.println("removeLast (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        System.out.println();
    }
}