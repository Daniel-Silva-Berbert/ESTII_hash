import java.sql.Date;

public class Time {
    private String codigo;
    private String nome;
    private Date anoFundacao;
    
    public Time(String codigo, String nome, Date anoFundacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.anoFundacao = anoFundacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(Date anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    
}
