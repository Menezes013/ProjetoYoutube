package POO;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de POO");
        v[1] = new Video("Aula 02 de POO");
        v[2] = new Video("Aula 03 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Mauricio", 15,"M", "Menezes");
        g[1] = new Gafanhoto("Milene", 18, "F", "Jujuba");

        Visualizacao vis [] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(35.0f);
        System.out.println(vis[1].toString());


    }
}