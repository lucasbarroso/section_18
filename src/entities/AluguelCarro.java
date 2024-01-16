package entities;
import java.util.Date;

public class AluguelCarro {
    private Date inicio;
    private Date fim;
    private Carro carro;
    private Fatura fatura;
    
    public AluguelCarro(Date inicio, Date fim, Carro carro, Fatura fatura) {
        this.inicio = inicio;
        this.fim = fim;
        this.carro = carro;
        this.fatura = fatura;
    }
    public Date getInicio() {
        return inicio;
    }
    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }
    public Date getFim() {
        return fim;
    }
    public void setFim(Date fim) {
        this.fim = fim;
    }
    public Carro getCarro() {
        return carro;
    }
    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    public Fatura getFatura() {
        return fatura;
    }
    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }
   
   

}
