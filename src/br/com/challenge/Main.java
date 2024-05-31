package br.com.challenge;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso do vitinho");
        curso1.setDescricao("vitinhos cursos .com");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria do vitinho");
        mentoria1.setDescricao("mentoria do vitinho");
        mentoria1.setData(LocalDate.now());
        

       
        System.out.println(curso1);
        System.out.println(mentoria1);





        
    }
}
