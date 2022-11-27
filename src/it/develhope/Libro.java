package it.develhope;

public class Libro {
    private String nomeLibro;
    private String descrizioneLibro;

    public Libro(String nomeLibro,String descrizioneLibro){
        this.nomeLibro = nomeLibro;
        this.descrizioneLibro = descrizioneLibro;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public void setNomeLibro(String nomeLibro) {
        this.nomeLibro = nomeLibro;
    }

    public String getDescrizioneLibro() {
        return descrizioneLibro;
    }

    public void setDescrizioneLibro(String descrizioneLibro) {
        this.descrizioneLibro = descrizioneLibro;
    }

    public void infoLibro(){
        System.out.println("Il nome del libro: " + nomeLibro + " e tratta di: " + descrizioneLibro);
    }
}
