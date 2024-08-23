package entidade;

public class Usuario {

    private String nome;
    private String email; // Novo campo adicionado
    private String senha; // Novo campo adicionado
    private String documentoIdentificacao;
    private String rg;
    private String cpf;
    private String numeroPassaporte;
    private String telefoneContato;
    private String telefoneEmergencia;

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() { // Getter para email
        return email;
    }

    public void setEmail(String email) { // Setter para email
        this.email = email;
    }

    public String getSenha() { // Getter para senha
        return senha;
    }

    public void setSenha(String senha) { // Setter para senha
        this.senha = senha;
    }

    public String getDocumentoIdentificacao() {
        return documentoIdentificacao;
    }

    public void setDocumentoIdentificacao(String documentoIdentificacao) {
        this.documentoIdentificacao = documentoIdentificacao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getTelefoneEmergencia() {
        return telefoneEmergencia;
    }

    public void setTelefoneEmergencia(String telefoneEmergencia) {
        this.telefoneEmergencia = telefoneEmergencia;
    }
}
