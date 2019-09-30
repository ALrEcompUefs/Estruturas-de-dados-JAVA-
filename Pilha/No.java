/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author Alisson
 * @param <E> elemento armazenado no nó
 */
public class No<E> {
    private E data;
    private No<E> proximo;

    /**
     *Método construtor que instância o novo objeto
     * @param data é a informação que o nó contém
     */
    public No(E data) {
        this.data = data;
    }

    public No() {
    }

    /**
     *Método de acesso aos atributos do objeto No.
     * que retorna a data continda no nó
     * @return é a informação que que esta contida no nó
     */
    public E getData() {
        return data;
    }

    /**
     *Método de acesso aos atributos do objeto No.
     * Recebe um novo objeto que é atribuido como data do nó
     * @param data é a informação continda no nó
     */
    public void setData(E data) {
        this.data = data;
    }

    /**
     *Método de acesso aos atributos do objeto No.
     * que retorna o proximo nó vizinho ao nó atual
     * @return é o proximo nó apontado por esse
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * Método de acesso aos atributos do objeto No.
     * Recebe um novo nó que é atribuido como proximo do atual
     * @param proximo é o nó que será apontado pelo atual
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    
}
