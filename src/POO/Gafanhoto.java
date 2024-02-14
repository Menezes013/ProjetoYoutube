package POO;

public class Gafanhoto extends Pessoa {

    // Metodos

    private String login;
    private int TotAssistido;

    // Atributos

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.TotAssistido = 0;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return TotAssistido;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.TotAssistido = totAssistindo;
    }
}
