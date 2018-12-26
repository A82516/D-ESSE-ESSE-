import java.util.Map;
import java.util.TreeMap;


public class GFuncionarios {

    private Map<String, Funcionario> funRegistados;
    private Funcionario funcionario;

    public GFuncionarios(){
        this.funRegistados = new TreeMap<String, Funcionario>();
        this.funcionario = null;
    }

    public GFuncionarios(Map<String,Funcionario> c, Funcionario f){
        getGFuncionarios(c);
        this.funcionario = f;
    }

    public GFuncionarios(GFuncionarios c){
        this.funRegistados = c.getGFuncionarios();
        this.funcionario = c.getFuncionario();
    }

    //GETS

    public Map<String,Funcionario> getGFuncionarios(){
        Map<String,Funcionario> novo = new TreeMap<String,Funcionario>();
        for(Map.Entry<String,Funcionario> i : this.funRegistados.entrySet())
            novo.put(i.getKey(), i.getValue());
        return novo;
    }

    public Funcionario getFuncionario(){
      return this.funcionario;
    }


    //SETS

    public void getGFuncionarios(Map<String, Funcionario> c){
        this.funRegistados =  new TreeMap<String,Funcionario>();

        for(Map.Entry<String,Funcionario> i : c.entrySet())
            this.funRegistados.put(i.getKey(), i.getValue());
    }

    public void setFuncionario(Funcionario f){
      this.funcionario = f;
    }

    //CLONE

    public GFuncionarios clone(){
        return new GFuncionarios(this);
    }

    //EQUALS

    public boolean equals(Object o) {
        if (o == this) return true;
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        GFuncionarios c = (GFuncionarios) o;

        return (this.funRegistados.equals(c.getGFuncionarios()) &&
                this.funcionario.equals(c.getFuncionario()));
    }

    //toString

    public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append("-----Funcionários-----");
      for(Funcionario f : this.funRegistados.values())
      sb.append(f.toString());
      return sb.toString();
    }

    //Insere Funcionário (Registar)

    public void registarFuncionario (Funcionario f) throws FuncionarioException{

      if(this.funRegistados.containsKey(f.getMail())){
          throw new FuncionarioException ("Ja existe este Funcionario");
       }
       else {
           this.funRegistados.put(f.getMail(),f);
       }
   }

   public Funcionario verificaFuncionario(String email, String password) throws FuncionarioException{
        Funcionario f;
        if(this.funRegistados.containsKey(email)){
            funcionario = this.funRegistados.get(email);
            if(funcionario.getPassword().equals(password))
                return funcionario;
        }
        else throw new FuncionarioException("Este email não existe");
        return null;
   }

   public boolean verificaGerente(Funcionario f){
        if (f.getTipo() == 1) return true;
        else return false;
   }

}
