public class ConfiguraFacil {

    private GFuncionarios gFuncionarios;
    private Funcionario funcionario;


    public ConfiguraFacil(){
        this.gFuncionarios = new GFuncionarios();
        this.funcionario = null;
    }

    public void Login(String email, String password) throws FuncionarioException{
        try {
            this.funcionario = gFuncionarios.verificaFuncionario(email,password);
        } catch (Exception e){
            throw new FuncionarioException(e.getMessage());
        }
    }

    public void Logout(){
        this.funcionario = null;
    }

}
