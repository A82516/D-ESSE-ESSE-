public class Cliente {

    private String nome;
    private String password;
    private String mail;

    public Cliente(){
        this.mail = "";
        this.nome = "";
        this.password = "";
    }

    public Cliente(String n, String p, String m){
        this.nome = n;
        this.password = p;
        this.mail = m;
    }

    public Cliente(Cliente c){
        this.nome = c.getNome();
        this.password = c.getPassword();
        this.mail = c.getMail();
    }

    public String getNome(){
        return this.nome;
    }

    public String getPassword(){
        return this.password;
    }

    public String getMail(){
        return this.mail;
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

    public Cliente clone(){
        return new Cliente(this);
    }

    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null || o.getClass() != this.getClass()) return false;

        Cliente c = (Cliente) o;
        return (this.nome == c.getNome() &&
                this.password == c.getPassword() &&
                this.mail == c.getMail());
    }
}
