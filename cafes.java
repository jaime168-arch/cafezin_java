import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String name = "Cafeteiro Mateus";
        System.out.println("Bem vindo! o que seria hoje? '" + name + "'");
        System.out.println("O profissional especialista no preparo de cafés é o Barista Jaime.");
        System.out.println("----------------------------------------");
        
        
        Map<String, Double> cardapio = new LinkedHashMap<>();
        cardapio.put("espresso", 5.00);
        cardapio.put("duplo", 7.00);
        cardapio.put("coado", 9.00);
        cardapio.put("simples", 3.50);
        cardapio.put("cappuccino", 10.00);
        
        System.out.println("Tipos de café disponíveis e preços:");
       
        for (Map.Entry<String, Double> item : cardapio.entrySet()) {
            System.out.printf("- %s: R$ %.2f%n", item.getKey(), item.getValue());
        }
        
        System.out.println("----------------------------------------");
        
      
        String[] formasPagamento = {"Dinheiro", "Pix", "Cartão de Débito", "Cartão de Crédito", "Vale Alimentação"};
        
        System.out.println("Formas de pagamento aceitas:");
        for (String pagamento : formasPagamento) {
            System.out.println("- " + pagamento);
        }
    }
}