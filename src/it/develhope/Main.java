package it.develhope;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UtenteBiblioteca user = UtenteBiblioteca.getIstance();
        Libro libro1 = new Libro("Naruto", "Anime");
        Libro libro2 = new Libro("I tre papaveri", "romanzo");
        Libro libro3 = new Libro("Il cielo", "poetico");

        user.aggiungiLibro(libro1.getNomeLibro());
        user.aggiungiLibro(libro2.getNomeLibro());
        user.aggiungiLibro(libro3.getNomeLibro());

        List<Libro> listaLibri = new ArrayList<>();
        listaLibri.add(libro1);
        listaLibri.add(libro2);
        listaLibri.add(libro3);

        for (String nome : UtenteBiblioteca.getListaLibri()){
            System.out.println(nome);
        }
        listaLibri.get(0).infoLibro();
        listaLibri.get(1).infoLibro();
        listaLibri.get(2).infoLibro();
    }
}
