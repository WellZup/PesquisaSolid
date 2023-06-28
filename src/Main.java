// TODO: 28/06/2023  Single Responsibility Principle (SRP) - Princípio da Responsabilidade Única:
//  Cada classe no exemplo tem uma única responsabilidade bem definida. A classe Retângulo, Circulo e Triangulo
//  são responsáveis por calcular a área de suas respectivas formas geométricas.
//  Open-Closed Principle (OCP) - Princípio do Aberto-Fechado:
//  As classes no exemplo estão abertas para extensão e fechadas para modificação.
//  Podemos adicionar novas classes de formas geométricas sem modificar as classes existentes.
//  Liskov Substitution Principle (LSP) - Princípio da Substituição de Liskov:
//  As classes Retângulo, Circulo e Triangulo são subclasses da interface forma e podem ser usadas em qualquer lugar
//  onde um objeto do tipo forma é esperado. Isso significa que podemos substituir uma instância de Retângulo,
//  por exemplo, por uma instância de forma em qualquer contexto sem quebrar o comportamento do programa.
//  Interface Segregation Principle (ISP) - Princípio da Segregação de Interfaces:
//  A interface forma contém apenas o método getArea(), que é relevante para todas as formas geométricas.
//  Não há métodos desnecessários nas classes implementadoras da interface. Isso garante que as classes que implementam
//  a interface não sejam forçadas a depender de métodos que não utilizam.
//  Dependency Inversion Principle (DIP) - Princípio da Inversão de Dependência:
//  A classe AreaCalcular depende da abstração forma em vez de depender de classes concretas, como Retângulo, Circulo ou
//  Triangulo. Isso permite que o AreaCalcular seja flexível e aceite qualquer objeto que implemente a interface forma.
public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo(5,10);
        Circulo circulo = new Circulo(3);
        Triangulo triangulo = new Triangulo(4,6);

        CalcularArea calcularArea = new CalcularArea();

        double AreaRetangulo = calcularArea.calcularArea(retangulo);
        double AreaCirculo = calcularArea.calcularArea(circulo);
        double AreaTriangulo = calcularArea.calcularArea(triangulo);

        System.out.println("Retangulo tem a área de: " + AreaRetangulo);
        System.out.println("Circulo tem a área de: " + AreaCirculo);
        System.out.println("Triangulo tem a área de: " + AreaTriangulo);


    }
}