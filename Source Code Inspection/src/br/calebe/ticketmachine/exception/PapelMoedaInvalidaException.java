package br.calebe.ticketmachine.exception;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class PapelMoedaInvalidaException extends Exception {
        public PapelMoedaInvalidaException() {
        System.out.println("Erro ao tentar inserir valor, nenhuma papel moeda detectado!");
    }
}
