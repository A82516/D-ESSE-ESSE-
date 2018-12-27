

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Componente {
    private int tipo;
    private String nome;
    private double preco;
    private List<Componente> incompativeis;
    private List<Componente> obrigatorios;
    private Integer stock;

    public Componente() {
        this.tipo = 0;
        this.nome = "";
        this.preco = 0;
        this.incompativeis = new ArrayList<Componente>();
        this.obrigatorios = new ArrayList<Componente>();
        this.stock = stock;
    }

    public Componente(int tipo, String nome, double preco, List<Componente> incompativeis, List<Componente> obrigatórios, Integer stock) {

        this.tipo = tipo;
        this.nome = nome;
        this.preco = preco;
        setIncompativeis(incompativeis);
        setObrigatórios(obrigatorios);
        this.stock = stock;
    }

    public Componente(Componente c){
        this.tipo= c.getTipo();
        this.nome = c.getNome();
        this.preco = c.getPreco();
        this.incompativeis = c.getIncompativeis();
        this.obrigatorios = c.getObrigatorios();
        this.stock = c.getStock();
    }



    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Componente> getIncompativeis() {
        ArrayList<Componente> novo = new ArrayList<Componente>();
        for(Componente c: incompativeis)
            novo.add(c);

        return novo;
    }

    public void setIncompativeis(List<Componente> incompativeis) {
        this.incompativeis = new ArrayList<>();
        for (Componente c:incompativeis)
            this.incompativeis.add(c);
    }

    public ArrayList<Componente> getObrigatorios() {
        ArrayList<Componente> novo = new ArrayList<Componente>();
        for(Componente c: obrigatorios)
            novo.add(c);

        return novo;
    }

    public void setObrigatórios(List<Componente> obrigatorios) {
        this.obrigatorios = new ArrayList<>();
        for (Componente c:obrigatorios)
            this.obrigatorios.add(c);
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Componente clone() {return new Componente(this); }


    //toString


    @java.lang.Override
    public java.lang.String toString() {
        return "Componente{" +
                "tipo=" + tipo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", incompativeis=" + incompativeis +
                ", obrigatorios=" + obrigatorios +
                ", stock=" + stock +
                '}';
    }

    //Equals


    public boolean equals(Object o) {
        if (o == this) return true;
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        Componente c = (Componente) o;

        return (this.tipo==c.clone().getTipo() &&
                equals(c.getNome()) &&
                this.preco == c.clone().getPreco() &&
                this.incompativeis.equals(c.getIncompativeis()) &&
                this.obrigatorios.equals(c.getObrigatorios()) &&
                this.stock == c.clone().getStock()
                );
    }

    // add Stock

    public void adicionaStock(Integer c){
        setStock(this.getStock()+c);
    }
    // remove c unidades ao stock caso estejam disponíveis, caso contrário dá uma msg

    public void removeStock(Integer c){
        try {
            if (c <= this.getStock()) {
                setStock(this.getStock() - c);

            }
            else {SemStockException s = new SemStockException("Sem stock");
                  throw s;}
        }
        catch(SemStockException s) {
            s.printStackTrace();
        }
        }

}
