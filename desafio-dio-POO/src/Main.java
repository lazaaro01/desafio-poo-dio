import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLazaro = new Dev();
        devLazaro.setNome("Lazaro");
        devLazaro.inscreverBootcapm(bootcamp);
        System.out.println("Conteudos Inscritos Lázaro: " + devLazaro.getConteudosInscritos());
        devLazaro.progredir();
        devLazaro.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Lázaro: " + devLazaro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devLazaro.getConteudosConcluidos());
        System.out.println("XP: " + devLazaro.calcularXp());

        System.out.println("--------");


        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcapm(bootcamp);
        System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Pedro: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularXp());

    }

}