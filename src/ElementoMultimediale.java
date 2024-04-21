public class ElementoMultimediale {
    private String titolo;
    private int durata;
    private int volume;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }
    public String getTitolo() {return this.titolo; }

    public int getDurata() {return this.durata; }

    public int getVolume() {return this.volume; }

    public void play(){

    }

    public void show(){}

    public void setVolume(int volume){this.volume = volume; }

    public ElementoMultimediale(String title, int durata, int volume) {
        this.titolo = title;
        this.durata = durata;
        this.volume = volume;
    }
}
