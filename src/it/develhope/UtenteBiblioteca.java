package it.develhope;

import java.util.ArrayList;
import java.util.List;

public class UtenteBiblioteca {
    private static UtenteBiblioteca user = new UtenteBiblioteca();
    private UtenteBiblioteca(){}

    private static List<String> listaLibri = new ArrayList<>();

    public static UtenteBiblioteca getUser() {
        return user;
    }

    public static void setUser(UtenteBiblioteca user) {
        UtenteBiblioteca.user = user;
    }

    public static List<String> getListaLibri() {
        return listaLibri;
    }

    public void setListaLibri(List<String> listaLibri) {
        this.listaLibri = listaLibri;
    }

    public static UtenteBiblioteca getIstance(){
        return user;
    }
    public void aggiungiLibro(String libro){
        listaLibri.add(libro);
    }
}
