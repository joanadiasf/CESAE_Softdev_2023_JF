package Ex_01;

public class Main {

    public static void main(String[] args) {

        Musica masterofpuppets = new Musica("Master Of Puppets","Metal","Metallica",500);
        Musica wantsingle = new Musica("Y'all Want a Single","Metal","Korn",188);
        Musica style = new Musica("Style", "Pop", "Taylor Swift",210);
        Musica gameover = new Musica("Game Over", "Punk", "Falling In Reverse",184);
        Musica kissgoat = new Musica("Kiss The Go-Goat","Rock","Ghost",184);
        Musica squarehammer= new Musica("Square Hammer", "Rock", "Ghost",200);

        MusicPlayer estacaoRadio = new MusicPlayer();

        estacaoRadio.addMusica(masterofpuppets);
        estacaoRadio.addMusica(wantsingle);
        estacaoRadio.addMusica(squarehammer);

        estacaoRadio.imprimirRelatorio();
    }
}
