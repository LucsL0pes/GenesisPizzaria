public class VendaPizza{
private String sabor;
private int tamanho;
private double preco;

public VendaPizza (String sabor, int tamanho, double preco){
this.sabor = sabor;
this.tamanho = tamanho;
this.preco = preco;
}

public double getPreco() {
    return preco;
}

public int getTamanho() {
    return tamanho;
}

public String getSabor() {
    return sabor;
}
public void setSabor(String sabor){
    this.sabor = sabor;
}

public void setTamanho(int tamanho){
    this.tamanho = tamanho;
}

public void setPreco(double preco){
    this.preco = preco;
}
}