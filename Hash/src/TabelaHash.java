import java.util.ArrayList;

public class TabelaHash {
    private ArrayList<Time>[] tabela;
    private int tamanho = 17;


    private int hash(String codigo) {
        int h = 0;
        for (int i = 0; i < codigo.length(); ++i)
            h = (997 * h + codigo.charAt(i)) % tamanho;
        return h;
    }

    public TabelaHash() {
        tabela = new ArrayList[tamanho];
        for (int i = 0; i < tamanho; i++) {
            tabela[i] = new ArrayList<>();
        }
    }

    public void adicionar(Time time) {
        int index = hash(time.getCodigo());
        for (Time t : tabela[index]) {
            if (t.getCodigo().equals(time.getCodigo())) {
                return;
            }
        }
        tabela[index].add(time);
    }

    public Time buscar(String codigo) {
        int index = hash(codigo);
        for (Time time : tabela[index]) {
            if (time.getCodigo().equals(codigo)) {
                return time;
            }
        }
        return null;
    }

    public void status(){
        for (int i=0;i<tamanho;++i){
            if (tabela[i]!=null){
                ArrayList<Time> liv = tabela[i];
                System.out.printf("A posição %d possui %d times\n",i,liv.size());
            } else
                System.out.printf("A posição %d não possui times cadastrados\n",i);
        }
    }
}
