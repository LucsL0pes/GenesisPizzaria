import java.util.*;

public class Controller {
    private ArrayList<VendaPizza> vendasPizzas; 

    public Controller(){
        vendasPizzas = new ArrayList<VendaPizza>();
    }

    public void adicionaPizza(VendaPizza P){
        vendasPizzas.add(P);
    }

    public double calculoPizzasVendidas(){
        double precoTotal=0;
       for (VendaPizza pizza : vendasPizzas) {
        precoTotal = precoTotal + pizza.getPreco();
       }
        return precoTotal;
    }

    public double calculoValorLiquido(){
        double valorLiquido = calculoPizzasVendidas();
        valorLiquido = valorLiquido * (4/10);
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
}
