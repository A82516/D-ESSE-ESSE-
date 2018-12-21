import java.util.Map;
import java.util.TreeMap;
import java.util.TreeMap;

public class ConfiguraFacil {

    private Map<String,Funcionario> funRegistados;
    private Funcionario funcionario;

    public Registo(){
        this.funRegistados = new TreeMap<String, Funcionario>();
        this.funcionario = null;
    }

    public Registo(Map<String,Funcionario> c, Funcionario f){
        setRegisto(c);
        this.funcionario = f;
    }

    public Registo(Registo c){
        this.funRegistados = c.getRegisto();
        this.funcionario = c.getFuncionario();
    }

    //GETS

    public Map<String,Registo> getRegisto(){
        Map<String,Funcionario> novo = new TreeMap<String,Funcionario>();
        for(Map.Entry<String,Funcionario> i : this.funRegistados.entrySet())
            novo.put(i.getKey(), i.getValue());
        return novo;
    }

    public Funcionario getFuncionario(){
      return this.Funcionário;
    }


    //SETS

    public void setRegisto(Map<String, Funcionario> c){
        this.funRegistados =  new TreeMap<String,Funcionario>();

        for(Map.Entry<String,Funcionario> i : c.entrySet())
            this.funRegistados.put(i.getKey(), i.getValue());
    }

    public void setFuncionario(Funcionario f){
      this.funcionario = f;
    }

    //CLONE

    public Registo clone(){
        return new Registo(this);
    }

    //EQUALS

    public boolean equals(Object o) {
        if (o == this) return true;
        if ((o == null) || (o.getClass() != this.getClass())) return false;
        Registo c = (Registo) o;

        return (this.funRegistados.equals(c.getRegisto()) &&
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

   //Login

   public void login (String email, String password) throws LoginException
   {
       if(this.funcionario == null){
           if(funRegistados.containsKey(email)){
               Funcionario cont = funRegistados.get(email).clone();
               if(password.equals(cont.getPassword())){
                   this.funcionario = cont;
                    if(funcionario.getTipo() == 0) {
                      try{
                       menuFuncionario();
                   }
                    else try {
                      menuGerente();
                    }
                   catch(OpcaoException e){
                       System.out.println(e.getMessage());
                     }
                   }
                 }
               }
             }
           }

   //Logout

   public void sairSessao(){
       this.funcionario = null;
       try{
            menuInicial();
       }
       catch(OpcaoException e){
            System.out.println(e.getMessage());
       }
   }

   
}
