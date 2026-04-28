package application;

import entities.LinkedList;
import utils.ConsoleUtils;

public class Program {

    public static void main(String[] args) {
        LinkedList<Integer> lista_ligada = new LinkedList<>();
        
        ConsoleUtils.clear();
        
        System.out.println("Lista vazia (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        
        for(int i=1; i<= 10; i++) {
        	lista_ligada.addLast(i);
        }
        
        System.out.println("addLast (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        
        lista_ligada.addFirst(0);
        
        System.out.println("addFirst (" + lista_ligada.length() + " elementos):");
        lista_ligada.printList();
        
    }
}