import java.awt.*;
import java.util.Map;
import java.util.TreeMap;

public class Configuracao {

    private Map<Integer, Componente> configcar;
    private Componente componente;

    public Configuracao(){
        this.configcar = new TreeMap<Integer, Componente>();
        this.componente = null;
    }

    public Configuracao(Map<Integer,Componente> c, Componente s){
        setConfigCar(c);
        this.componente = s;
    }

    public  Configuracao(Configuracao c){
        this.configcar = c.getConfigCar();
        this.componente = c.getComponente();
    }

    // GETS

    public Map<Integer, Componente> getConfigCar(){
        Map<Integer,Componente> novo = new TreeMap<Integer, Componente>();
        for(Map.Entry<Integer,Componente> i : this.configcar.entrySet())
            novo.put(i.getKey(), i.getValue());
        return novo;
    }

    public Componente getComponente(){
        return this.componente;
    }

    //SETS

    public void setConfigCar(Map<Integer, Componente> c){
        this.configcar = new TreeMap<Integer, Componente>();

        for(Map.Entry<Integer,Componente> i : c.entrySet())
            this.configcar.put(i.getKey(), i.getValue());
    }

    public void setComponente(Componente c){
        this.componente = c;
    }

    //CLONE

    public Configuracao clone(){
        return new Configuracao(this);
    }

    //EQUALS

    public boolean equals(Object o){
        if (o == this) return true;
        if ((o == null) || (o.getClass() != this.getClass())) return false;

        Configuracao c = (Configuracao) o;
        return (this.configcar.equals((c.getConfigCar())) &&
                this.componente.equals(c.getComponente()));
    }

    //toString

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("-----Configuração-----");
        for(Componente c : this.configcar.values())
            sb.append(c.toString());
        return sb.toString();
    }

    public void insereComponente (Componente c){
        if(this.configcar.containsKey(c.getTipo())){
            this.configcar.replace(c.getTipo(), c);
        } else {
            this.configcar.put(c.getTipo(),c);
        }
    }
}
