package br.com.mentorama.execptions;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AlunosService {

    public List<String> findAll() {
        String caminho = AlunosService.class.getClassLoader()
        .getResource("aluno.txt")
        .getPath();

        try{
            List<String>alunos = Files.readAllLines(Path.of(caminho));
            return alunos;
        }catch(IOException ioException){
             throw new RuntimeException("Arquivo nao encontrado");
        }          
    }
    public String findAluno(String nome) throws AlunoNaoEncontradoException{
        return findAll().stream()
        .filter(aluno -> aluno.equals(nome))
        .findFirst()
        .orElseThrow(() -> new AlunoNaoEncontradoException(nome));    }


}
