package Exercicio;

public class SuperMario1 {
    public static void main(String[] args){

        SuperMario m1 = new SuperMario();
        m1.caracteristicas();
        m1.pegarCogumelosAltos();
        System.out.println("*-----------------------------------------------------------------------------------------*");

        SuperMario m2 = new SuperMario("Super Mario", 32, 1.25);
        m2.caracteristicas();
        m2.pegarCogumelosAltos();
        System.out.println("*-----------------------------------------------------------------------------------------*");

        SuperMario m3 = new SuperMario(" Super Mario Bros", 20, 1.50);
        m3.caracteristicas();
        m3.pegarCogumelosAltos();
        System.out.println("*-----------------------------------------------------------------------------------------*");


    }
    
}
