    public class Contato {
    // Declarei os atributos privados (nome e telefone), utilizando o chamado "Encapsulamento"
    private String nome;
    private String telefone;

    // Preferi criar um método construtor para inicializar os atributos
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Implemententei os métodos Getter e Setter para cada atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
}