public class contato {
    private int DDD, NUMERO;
    private String tipo;
  
    public contato(){}
    
    public contato(int dDD, int nUMERO, String tipo) {
     DDD = dDD;
     NUMERO = nUMERO;
     this.tipo = tipo;
    }
  
    public int getDDD() {
     return DDD;
    }
  
    public void setDDD(int dDD) {
     DDD = dDD;
    }
  
    public int getNUMERO() {
     return NUMERO;
    }
  
    public void setNUMERO(int nUMERO) {
     NUMERO = nUMERO;
    }
  
    public String getTipo() {
     return tipo;
    }
  
    public void setTipo(String tipo) {
     this.tipo = tipo;
    }
 }