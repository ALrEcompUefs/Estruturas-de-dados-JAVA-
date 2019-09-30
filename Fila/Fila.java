/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila;

/**
 * Uma fila implementada como um tipo abstrato de dados
 * Novos elementos são adicionados ao final e sempre o primeiro da fila é removido
 * @author Alisson
 */
public class Fila <E> implements IFila<E> {
    private No<E> primeiro;
    private int tamanho;

    public Fila() {
        this.primeiro = null;
        this.tamanho = 0;
    }
    
    
    @Override
    public void enfileirar(E data) {
        if(this.primeiro == null){ // se a fila está vazia
            this.primeiro = new No(data); //adiciona novo elemento no começo
        }
        else{ // se já existirem elementos na fila
            No atual = this.primeiro; // atual começa do primeiro elemento
            //procura pelo fim da fila e adiciona o elemento lá
            while(atual.getProximo() != null){
                atual = atual.getProximo(); //segua na lista
            }
            if(atual.getProximo() == null){ // achou o fim da fila
                atual.setProximo(new No(data));  //insere o novo elemento la
            }
        }
        tamanho++; //incrementa o tamanho
    }

    @Override
    public E desenfileirar() {
        if(this.primeiro != null){ // se a fila não estiver vazia
            No<E> aux = primeiro; //guarda o primeiro elemento
            primeiro = primeiro.getProximo(); //faz o primeiro elemento ser o proximo
            tamanho--; //decrementa o tamanho
            return aux.getData(); // retorna o elemento removido
        }
        //se a fila está vazia
        return null; //retorna null
    }

    @Override
    public boolean isEmpty() {
        return this.primeiro == null;
    }

    @Override
    public int size() {
        return this.tamanho;
    }
}
