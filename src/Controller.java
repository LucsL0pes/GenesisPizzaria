import java.util.*;


public class Controller {
    private ArrayList<VendaPizza> vendasPizzas; 
    

    public Controller(){
        vendasPizzas = new ArrayList<VendaPizza>(100);
    }

    public void adicionaPizza(VendaPizza P){
        vendasPizzas.add(P);
        System.out.println("pizza adicionada");
    }

    public double calculoPizzasVendidas(){
        double precoTotal=0;
       for (VendaPizza pizza : vendasPizzas) {
        precoTotal = precoTotal + pizza.getPreco();
       }
        return precoTotal;
    }

    public double calculoValorLiquido(){
        double valorTotal = calculoPizzasVendidas();
        double valorLiquido = valorTotal * 0.4;
        return valorLiquido;
    }

    public int calculaPizzasVendidasPeloSabor(String sabor){
        int total=0; 
        for (VendaPizza pizza : vendasPizzas) {
        if((pizza.getSabor()).equals(sabor)){
            total++;
        };
    }
    return total;
    }
    public String toString(){
        String toString = "";
        for (VendaPizza vendaPizza : vendasPizzas) {
            toString = toString + "\n { Sabor: "+vendaPizza.getSabor() + "\n "
            +" Preço: "+ vendaPizza.getPreco() + "\n "
            +" Tamanho: "+ vendaPizza.getTamanho()+" }\n\n";
        }
        return toString;

    }
}
