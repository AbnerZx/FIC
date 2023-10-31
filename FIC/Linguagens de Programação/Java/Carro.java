public class Carro {
    private String cor;
    private String chassi;
    private String ano;
    private String placa;

    public Carro(String cor, String chassi, String ano, String placa) {
        this.cor = cor;
        this.chassi = chassi;
        this.ano = ano;
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
