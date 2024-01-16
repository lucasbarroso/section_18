package entities;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AluguelCarro {
    private LocalDate inicio;
    private LocalDate fim;
    private Carro carro;
    private Fatura fatura;
    

    public AluguelCarro(LocalDate inicio, LocalDate fim, Carro carro, Fatura fatura) {
        this.inicio = inicio;
        this.fim = fim;
        this.carro = carro;
        this.fatura = fatura;
    }
    public LocalDate getInicio() {
        return fim;
    }
    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }
    public LocalDate getFim() {
        return fim;
    }
    public void setFim(LocalDate fim) {
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
    public String getDataFormatada(DateTimeFormatter date) {
        final DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String inicioFormatado = date.format(formato);

        return inicioFormatado;
    }
   

}
