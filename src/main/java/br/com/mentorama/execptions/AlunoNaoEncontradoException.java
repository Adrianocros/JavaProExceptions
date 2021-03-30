package br.com.mentorama.execptions;

public class AlunoNaoEncontradoException extends Exception{

    public AlunoNaoEncontradoException(String nome) {
        super("Nome " + nome + " não encontrado");
    }
    
}
