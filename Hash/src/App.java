import java.sql.Date;

public class App {
    public static void main(String[] args) throws Exception {
        TabelaHash tabela = new TabelaHash();

        tabela.adicionar(new Time("LMN787", "Time A", Date.valueOf("1920-05-20")));
        tabela.adicionar(new Time("LMN788", "Time B", Date.valueOf("1935-03-10")));
        tabela.adicionar(new Time("LMN789", "Time C", Date.valueOf("1950-11-31")));
        tabela.adicionar(new Time("LMN790", "Time D", Date.valueOf("1950-12-01")));
        tabela.adicionar(new Time("LMN790", "Time C", Date.valueOf("1950-12-02")));
        tabela.adicionar(new Time("LMN791", "Time E", Date.valueOf("1950-12-03")));
        tabela.adicionar(new Time("LMN792", "Time F", Date.valueOf("1950-12-04")));
        tabela.adicionar(new Time("LMN793", "Time G", Date.valueOf("1950-12-05")));
        tabela.adicionar(new Time("LMN794", "Time H", Date.valueOf("1950-12-06")));
        tabela.adicionar(new Time("LMN795", "Time I", Date.valueOf("1950-12-07")));
        tabela.adicionar(new Time("LMN796", "Time J", Date.valueOf("1950-12-08")));
        tabela.adicionar(new Time("LMN797", "Time K", Date.valueOf("1950-12-09")));
        tabela.adicionar(new Time("LMN798", "Time L", Date.valueOf("1950-12-10")));
        tabela.adicionar(new Time("LMN799", "Time M", Date.valueOf("1950-12-11")));
        tabela.adicionar(new Time("LMN800", "Time N", Date.valueOf("1950-12-12")));
        tabela.adicionar(new Time("LMN801", "Time O", Date.valueOf("1950-12-13")));
        tabela.adicionar(new Time("LMN802", "Time P", Date.valueOf("1950-12-14")));
        tabela.adicionar(new Time("LMN803", "Time Q", Date.valueOf("1950-12-15")));
        tabela.adicionar(new Time("LMN804", "Time R", Date.valueOf("1950-12-16")));
        tabela.adicionar(new Time("LMN805", "Time S", Date.valueOf("1950-12-17")));

        tabela.status();
    }
}
