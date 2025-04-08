import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Musica musicas[] = new Musica[5];
        Compositor compositor[] = new Compositor[5];

        compositor[0] = new Compositor("Monêt", "Francês");
        compositor[1] = new Compositor("Bjhorn", "Russo");

        Compositor comps[] = new Compositor[2];
        comps[0] = compositor[0];
        comps[1] = compositor[1];

        musicas[0] = new Musica("Le festin", 2004, "Clássica", comps);

        System.out.println(musicas[0].toString());

        sc.close();
    }
}
