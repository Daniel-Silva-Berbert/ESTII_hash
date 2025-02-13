public class HashTable {
    public static final int M = 13;
    private Livro[] ls;
    public HashTable(){
        ls = new Livro[M];
    }
    private int hash (String chave){
        int h = 0;
        for (int i = 0; i < chave.length(); ++i)
            h = (349 * h + chave.charAt(i)) % M;
        return h;
        // No lugar do multiplicador 31, poderia usar qualquer outro inteiro R, de preferência primo, mas suficientemente pequeno para que os cálculos não produzam overflow.
    }
    public Livro get(String chave){
        int hash;
        int salto;
        for(salto = 0; salto<ls.length; ++salto){
            hash = (hash(chave) + salto) % ls.length;
            if((ls[hash] == null) || ls[hash].getISBN().equals(chave)){
                return ls[hash];
            }
        }
        return null;
    }
    public void put(Livro l) throws Exception{
        int hash;
        int salto;
        for(salto = 0; salto <= ls.length; ++salto){
            if(salto == ls.length){
                throw new Exception("Não há espaço disponível");
            }
            hash = (hash(l.getISBN()) + salto) % ls.length;
            if((ls[hash] == null) || ls[hash].getISBN().equals(l.getISBN())){
                ls[hash] = l;
                break;
            }
            
        }
    }

    public Livro remove(String chave) {
        int hash = hash(chave);
        Livro livro = ls[hash];
        ls[hash] = null;
        return livro;
    }
}
