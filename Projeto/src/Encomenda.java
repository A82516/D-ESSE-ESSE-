public class Encomenda {

    private int id;
    private String nomeCliente;
    private int nifCliente;
    private int telemovel;
    private double preco;
    private Funcionario funcionario;
    private Configuracao configuracao;

    public Encomenda(){
        this.id = 0;
        this.nomeCliente = null;
        this.nifCliente = 0;
        this.telemovel = 0;
        this.preco = 0;
        this.funcionario = null;
        this.configuracao = null;
    }

    public Encomenda(int a, String b, int c, int t, double d, Funcionario e, Configuracao f){
        this.id = a;
        this.nomeCliente = b;
        this.nifCliente = c;
        this.telemovel = t;
        this.preco = d;
        this.funcionario = e;
        this.configuracao = f;
    }

    public Encomenda(Encomenda e){
        this.id = e.getId();
        this.nomeCliente = e.getNomeCliente();
        this.nifCliente = e.getNifCliente();
        this.telemovel = e.getTelemovel();
        this.preco = e.getPreco();
        this.funcionario = e.getFuncionario();
        this.configuracao = e.getConfiguracao();
    }

    //GETS

    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNifCliente() {
        return nifCliente;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public double getPreco() {
        return preco;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    //SETS

    public void setId(int a) {
        this.id = a;
    }

    public void setNomeCliente(String a) {
        this.nomeCliente = a;
    }

    public void setNifCliente(int a) {
        this.nifCliente = a;
    }

    public void setTelemovel(int a) {
        this.telemovel = a;
    }

    public void setPreco(double a) {
        this.preco = a;
    }

    public void setFuncionario(Funcionario a) {
        this.funcionario = a;
    }

    public void setConfiguracao(Configuracao a) {
        this.configuracao = a;
    }

    //CLONE

    public Encomenda clone(){
        return new Encomenda(this);
    }

    //toSTRING

    public String toString() {
        final StringBuilder sb = new StringBuilder("Encomenda{");
        sb.append("id=").append(id);
        sb.append(", nomeCliente='").append(nomeCliente).append('\'');
        sb.append(", nifCliente=").append(nifCliente);
        sb.append(".Telemovel=").append(telemovel);
        sb.append(", preco=").append(preco);
        sb.append(", funcionario=").append(funcionario);
        sb.append(", configuracao=").append(configuracao);
        sb.append('}');
        return sb.toString();
    }

    // EQUALS

    public boolean equals(Object o){
        if(o == this) return true;
        if((o == null) || (o.getClass() != this.getClass())) return false;

        Encomenda e = (Encomenda) o;
        return (e.getId() == this.getId() &&
                e.nomeCliente.equals(this.getNomeCliente()) &&
                e.getNifCliente() == this.getNifCliente() &&
                e.getTelemovel() == this.getTelemovel() &&
                e.getPreco() == this.getPreco() &&
                e.getFuncionario().equals(this.getFuncionario()) &&
                e.getConfiguracao().equals(this.getConfiguracao()));
    }
}