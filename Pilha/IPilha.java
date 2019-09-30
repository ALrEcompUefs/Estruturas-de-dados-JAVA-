/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 * Interface para uma pilha implementada por um tipo abstrato de dado
 * @author Alisson
 * @param <E> Parametro de tipo para qualquer elemento sem restrição
 */
public interface IPilha<E> {
    
    /**
     * Inseri um novo elemento no topo da pilha
     * @param data novo elemento
     */
    public void pop(E data);
    
    /**
     * Desempilha/remove o elemento do topo da pilha
     * @return elemento no topo da pilha
     */
    public E push();
    
    /**
     * Verifica se a pilha está vazia
     * @return true se estiver vaziar false caso contrario
     */
    public boolean isEmpty();
    
    /**
     * Retorna a quantidade de elementos empilhados
     * @return elementos na pilha
     */
    public int size();
}
