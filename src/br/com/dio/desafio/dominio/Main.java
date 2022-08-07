package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição curso Python básico");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição aula de orientacção a objetos");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer ");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getCoteudos().add(curso1);
        bootcamp.getCoteudos().add(curso2);
        bootcamp.getCoteudos().add(mentoria);

        Dev devLucimar = new Dev();
        devLucimar.setNome("Lucimar");
        devLucimar.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devLucimar.getConteudosInscritos());
        devLucimar.progredir();
        devLucimar.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos " + devLucimar.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devLucimar.getConteudosConcluidos());
        System.out.println("XP:" + devLucimar.calcularTotalXP());

        System.out.println("-------------------------------------------------------------");

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos " + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devLucimar.calcularTotalXP());

        Dev devJulia = new Dev();
        devJulia.setNome("Julia");
        devJulia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devJulia.getConteudosInscritos());
        devJulia.progredir();
        devJulia.progredir();
        System.out.println("-");

        System.out.println("Conteúdos Inscritos " +devJulia.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devJulia.getConteudosConcluidos());
        System.out.println("XP:" +  devJulia.calcularTotalXP());







    }
}

