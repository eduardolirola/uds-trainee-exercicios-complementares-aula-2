public class Usuario extends Pessoa {

    private String login;
    private int totalAssistido;

    public Usuario(String nome,int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }


//    GET E SET

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return  "\nUsuario: {" +
                "nome: '" + nome + '\'' +
                ", idade: " + idade +
                ", sexo: '" + sexo + '\'' +
                ", total assistido: "+ totalAssistido +
                ",login: " + login +
                "}"+"\n";
    }
}
