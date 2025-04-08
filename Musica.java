public class Musica{
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositores[];

    Musica(String nome, int ano, String tipo, Compositor compositor[]){
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositores = compositor;
    }

    public String getNome(){
        return nome;
    }

    public int getAno(){
        return ano;
    }

    public String getTipo(){
        return tipo;
    }

    public void setNome(String name){
        this.nome = name;
    }

    public void setAno(int year){
        this.ano = year;
    }

    public Compositor[] getCompositores(){
        return compositores;
    }

    public void setCompositor(Compositor compositores[]){
        this.compositores = compositores;
    }

    public void setTipo(String type){
        this.tipo = type;
    }

    public String toString(){
        String printout = "Música: " + nome + "\nAno: " + ano + "\nTipo: " + tipo + "\n";
            for(Compositor compositor : compositores){
                if(compositor != null){
                    printout += compositor.toString();
                }
            }
            return printout;
        }
    }

class Compositor{
    private String nomeCompositor;
    private String nacionalidade;

    Compositor(String nome, String nacionalidade){
        this.nomeCompositor = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNomeCompositor(){
        return nomeCompositor;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public void setNomeCompositor(String compositor){
        this.nomeCompositor = compositor;
    }

    public void setNacionalidade(String nationality){
        this.nacionalidade = nationality;
    }

    public String toString(){
        return "Compositor: " + nomeCompositor + "; " + " Nacionalidade: " + nacionalidade + "\n";
    }
}