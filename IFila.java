/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

/**
 * Fila implementada como um tipo de dado abstrato
 * @author Alisson
 */
public interface IFila<E> {
    
    /**
     * Enfileira um novo elemento o adicionado no fim da fila
     * @param data novo elmento
     */
    public void enfileirar(E data);
    
    /**
     * Desenfileira/remove o primeiro elemento da fila
     * @return primeiro elemento da fila
     */
    public E desenfileirar();
    
    /**
     * Verifica se a fila esta vazia
     * @return true se estiver vaziar false caso contrario
     */
    public boolean isEmpty();

     /**
     * Retorna a quantidade de elementos enfileirados
     * @return elementos na fila
     */
    public int size();
}
