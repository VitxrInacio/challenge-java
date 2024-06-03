package br.com.challenge;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso do vitinho");
        curso1.setDescricao("vitinhos cursos .com");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso do mitinho");
        curso2.setDescricao("vitinhos cursos .com");
        curso2.setCargaHoraria(8);

    
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria do vitin");
        mentoria1.setDescricao("descricao do vidio");

       
        // System.out.println(curso1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("java developer");
        bootcamp.setDescricao("bootcamp de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);



        Dev devVitor = new Dev();
        devVitor.setNome("vito");
        devVitor.inscreverBootcamp(bootcamp);
        
        System.out.println("conteudos inscritos de vitor " + devVitor.getConteudosInscritos());
        devVitor.progredir();
        System.out.println("conteudos inscritos de vitor " + devVitor.getConteudosInscritos());
        devVitor.progredir();
        
        System.out.println("conteudos inscritos de vitor " + devVitor.getConteudosConcluidos());
        System.out.println("xp: " + devVitor.calcularXpTotal());
        

        
        Dev devCal = new Dev();
        devCal.setNome("miguel");
        devCal.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos de miguel " + devCal.getConteudosInscritos());
        
        devCal.progredir();
        System.out.println("conteudos inscritos de miguel " + devCal.getConteudosInscritos());
        System.out.println("conteudos inscritos de miguel " + devCal.getConteudosConcluidos());
        System.out.println("xp: " + devCal.calcularXpTotal());



        
    }
}
