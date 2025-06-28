public class endereco {
    public endereco(String cep, String cidade, String bairro, String estado, String rua, int numero) {
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.rua = rua;
        this.numero = numero;
    }
    private String cep, cidade, bairro, estado, rua;
    private int numero;
    public String getcep() {
        return cep;
    }
    public void setcep(String cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
}