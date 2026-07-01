public class Main {
    public static void main(String[] args) {
        String name = "cafeteiro Mateus o que seria hoje?";
        System.out.println("Bem vindo! Respondendo à pergunta: '" + name + "'");
        System.out.println("Hoje, o profissional especialista no preparo de cafés é conhecido como Barista e o nome dele é Jaime.");
        System.out.println("----------------------------------------");
        
     
        String[] tiposDeCafe = {"espresso", "duplo", "coado", "simples", "cappuccino"};
        
        System.out.println("Tipos de café disponíveis:");
        
        for (String cafe : tiposDeCafe) {
            System.out.println("- " + cafe);
        }
    }
}