public class Funcionario {

    private String nome;
    private String password;
    private String mail;
    private short tipo; // 0 para Funcionário e 1 para Gerente

    public Funcionario(){
        this.mail = "";
        this.nome = "";
        this.password = "";
        this.tipo = 0;
    }

    public Funcionario(String n, String p, String m, short x){
        this.nome = n;
        this.password = p;
        this.mail = m;
        this.tipo = x;
    }

    public Funcionario(Funcionario c){
        this.nome = c.getNome();
        this.password = c.getPassword();
        this.mail = c.getMail();
        this.tipo = c.getTipo();
    }

    public String getNome(){
        return this.nome;
    }

    public String getPassword() {
        return this.password;
    }

    public String getMail(){
        return this.mail;
    }

    public short getTipo(){
        return this.tipo;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public void setPassword(String p){
        this.password = p;
    }

    public void setMail(String m){
        this.mail =  m;
    }

    public void setTipo(short x){
        this.tipo = x;
    }

    public Funcionario clone(){
        return new Funcionario(this);
    }

    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || o.getClass() != this.getClass()) return false;

        Funcionario c = (Funcionario) o;
        return (this.nome == c.getNome() &&
                this.password == c.getPassword() &&
                this.mail == c.getMail() &&
                this.tipo == c.getTipo());
    }
}
