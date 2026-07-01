public class Main {
    public static void main(String[] args) {
        String name = "Cafeteiro Mateus";
        System.out.println("Bem vindo! o que seria hoje? '" + name + "'");
        System.out.println("O profissional especialista no preparo de cafés é o Barista Jaime.");
        System.out.println("----------------------------------------");
        
     
        String[] tiposDeCafe = {"espresso", "duplo", "coado", "simples", "cappuccino"};
        
        System.out.println("Tipos de café disponíveis:");
        
        for (String cafe : tiposDeCafe) {
            System.out.println("- " + cafe);
        }
    }
}