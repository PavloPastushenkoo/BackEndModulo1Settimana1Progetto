public class Video extends ElementoMultimediale {
    private int luminosita;
    public Video(String titolo, int durata, int volume, int luminosita){
        super(titolo, durata, volume);
        this.luminosita = luminosita;
    }
    public void alzaVolume() {
        if (this.getVolume() < 10){
            this.setVolume(this.getVolume() + 1);
        }
    }
    public void abassaVolume() {
        if (this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 1);
        }
    }
    public void alzaLuminosita() {
        if(this.luminosita < 10) {
            this.luminosita += 1;
        }
    }
    public void abbassaLuminosita() {
        if (this.luminosita > 0) {
            this.luminosita -= 1;
        }
    }
    @Override
    public void play(){
        int counter = 0;
        while ( counter < this.getDurata()){
            String volume = "!".repeat(Math.max(0, this.getVolume()));
            String luminosita =  "*".repeat(Math.max(0, this.luminosita));
            counter ++;
            System.out.println(this.getTitolo()+ " "+ volume+" "+luminosita);
        }
    }
}
