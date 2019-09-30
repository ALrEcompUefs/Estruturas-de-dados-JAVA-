/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 * Uma pilha implementada como um tipo abstrato de dado
 * Permite as operações basicas de uma pilha.
 * @author Alisson
 * @param <E>
 */
public class Pilha<E> implements IPilha<E> {
    private No<E> topo; // topo da pilha
    int tamanho; //total de elementos armazenados na pilha

    /**
     * Cria uma nova pilha
     */
    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }
    
    
    @Override
    public void pop(E data) {
        if(topo == null){ // se não houver elementos  na pilha
            this.topo = new No(data); // insere o novo topo
        }
        else{ // se já existem elementos na pilha
            No<E> novo = new No(data); //cria um novo nó
            novo.setProximo(this.topo); // faz  novo apontar para o topo
            topo = novo; // faz novo ser o topo
        }
        tamanho++; //incrementa o tamanho
    }

    @Override
    public E push() {
        if(topo != null){ // se houver elementos na pilha
            No<E> aux = this.topo; //guarda o elemento do topo
            topo = topo.getProximo(); // faz o topo ser o proximo elmento
            tamanho--; //decrementa o tamanho
            return aux.getData();
        }
        //se a pilha estiver vazia
        return null; //retorna nulo
    }

    @Override
    public boolean isEmpty() {
        return this.topo == null;
    }

    @Override
    public int size() {
        return this.tamanho;
    }

    
}
