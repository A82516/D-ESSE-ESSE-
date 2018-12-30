public class Pacotes {

    private int id;
    private String nome;
    private float desconto;
    private Configuracao pacote;

    public Pacotes(){
        this.id = 0;
        this.nome = null;
        this.desconto = 0;
        this.pacote = null;
    }

    public Pacotes(int a, String x, float b, Configuracao c) {
        this.id = a;
        this.nome = x;
        this.desconto = b;
        this.pacote = c;
    }

    public Pacotes(Pacotes a){
        this.id = a.getId();
        this.nome = a.getNome();
        this.desconto = a.getDesconto();
        this.pacote = a.getPacote();
    }

    //GETS


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public float getDesconto() {
        return desconto;
    }

    public Configuracao getPacote() {
        return pacote;
    }

    //SETS


    public void setId(int a) {
        this.id = a;
    }

    public void setNome(String a) {
        this.nome = a;
    }

    public void setDesconto(float a) {
        this.desconto = a;
    }

    public void setPacote(Configuracao a) {
        this.pacote = a;
    }

    //CLONE

    public Pacotes clone(){
        return new Pacotes(this);
    }

    //EQUALS

    public boolean equals(Object o){
        if(o == this) return true;
        if((o == null) || (o.getClass() != this.getClass())) return false;

        Pacotes p = (Pacotes) o;

        return (p.getId() == this.getId() &&
                p.getNome().equals(this.getNome()) &&
                p.getDesconto() == this.getDesconto() &&
                p.getPacote().equals(this.getPacote()));
    }

    //toSTRING


    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacotes{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", desconto=").append(desconto);
        sb.append(", pacote=").append(pacote);
        sb.append('}');
        return sb.toString();
    }
}
