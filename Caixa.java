

public class Caixa {
 private String cor;
 private int tamanho;
 public Boolean lacrada;
 
//  public void Status(){
//      System.out.println("Uma caiaxa da cor " + this.cor);
//      System.out.println("uma caixa do tamanho "+ this.tamanho);
//      System.out.println("esta caixa esta " +this.lacrada);
//  }

public Caixa(String cor, int tamanho, Boolean lacrada) {
    this.cor = cor;
    this.tamanho = tamanho;
    this.lacrada = lacrada;
}


public void fechada(){
 this.lacrada=true;

}
 public void Aberta(){
    this.lacrada=false;
}
public void Pegar(){
    if(this.lacrada== true){
        System.out.println(" Lacrada não pode pegar o presente");
    }
    else{
      System.out.println(" Aberta, então pode pegar o presente!");
    }
}

public String getCor() {
    return cor;
}

public void setCor(String cor) {
    this.cor = cor;
}

public int getTamanho() {
    return tamanho;
}

public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
}

public Boolean getLacrada() {
    return lacrada;
}

public void setLacrada(Boolean lacrada) {
    this.lacrada = lacrada;
}
@Override
public String toString() {
    return "Caixa [cor=" + cor + ", tamanho=" + tamanho + ", lacrada=" + lacrada + "]";
}


}