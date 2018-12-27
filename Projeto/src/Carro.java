import java.util.Objects;

public class Carro {

    private int id;
    private String nome;
    private double preco;

    public Carro(){
        this.id = 0;
        this.nome = null;
        this.preco = 0;
    }

    public Carro(int a, String b, int c){
        this.id =  a;
        this.nome = b;
        this.preco = c;
    }

    public Carro(Carro c){
        this.id = c.getId();
        this.nome = c.getNome();
        this.preco = c.getPreco();
    }

    //GETS

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    //SETS

    public void setId(int i){
        this.id = i;
    }

    public void setNome(String s){
        this.nome = s;
    }

    public void setPreco(double d){
        this.preco = d;
    }

    // CLONE

    public Carro clone(){
        return new Carro(this);
    }

    //EQUALS

    public boolean equals(Object o){
        if (o == this) return true;
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        Carro c = (Carro) o;
        return nome.equals(c.getNome()) && id == c.getId() && preco == c.getPreco();
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Carro{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }


}
