
/**
 *
 * @author bslab105c
 */
public class Funcionario {
    
    private String nome;
    private int horas;
    private char turno;
    private char categoria;
    private int valorHora;
    private double salarioMinimo = 960.00;
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        if(turno=='M' || turno=='V' || turno=='N' )
         this.turno = turno;
    }
    
     public boolean validaTurno(char turno){
         if(turno=='M' || turno=='V' || turno=='N' )
           return true;
         else
           return false;
    }
    
    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    public boolean validaCategoria(char cat){
        if(cat =='O' || cat=='G')
            return true;
        else 
            return false;
    }
    
    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calculoDeHora(char cat, char tur){
        if(cat=='G' && tur=='N')
            return this.salarioMinimo*18/100;
        else
            if(cat=='G' && (tur=='M' || tur=='V'))
              return this.salarioMinimo*15/100;
            else 
                uf(cat='O' && )
    }
    
    
    
    
    
    
    
    
    
    
}
