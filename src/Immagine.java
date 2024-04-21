
    public class Immagine extends ElementoMultimediale {
        private int luminosita;
        public Immagine(String title, int luminosita) {
            super(title);
            this.luminosita = luminosita;
        }
        public void alzaLuminosita(){
            if(this.luminosita < 10) {
                this.luminosita += 1;}
            }
            public void abbassaLuminosita(){
            if (this.luminosita > 0) {
                this.luminosita -= 1;
            }
        }
        @Override
        public void show() {
                System.out.println(this.getTitolo()+" "+"*".repeat(Math.max(0, this.luminosita)));
            }
        }


