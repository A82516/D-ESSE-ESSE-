public class Pacotes {

    private int id;
    private float desconto;
    private Configuracao pacote;

    public Pacotes(){
        this.id = 0;
        this.desconto = 0;
        this.pacote = null;
    }

    public Pacotes(int a, float b, Configuracao c) {
        this.id = a;
        this.desconto = b;
        this.pacote = c;
    }

    public Pacotes(Pacotes a){
        this.id = a.getId();
        this.desconto = a.getDesconto();
        this.pacote = a.getPacote();
    }

    //GETS


    public int getId() {
        return id;
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
                p.getDesconto() == this.getDesconto() &&
                p.getPacote().equals(this.getPacote()));
    }

    //toSTRING

    public String toString() {
        final StringBuilder sb = new StringBuilder("Pacotes{");
        sb.append("id=").append(id);
        sb.append(", desconto=").append(desconto);
        sb.append(", pacote=").append(pacote);
        sb.append('}');
        return sb.toString();
    }
}
