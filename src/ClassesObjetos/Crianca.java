package ClassesObjetos;

public class Crianca {
 //ATRIBUTOS
    String corCabelço;
    String corPele;
    double altura;
    int idade;
//METODOS
    void brincar(){
        System.out.println("Brincando...");
    }
    void correr (double metros){
        System.out.println("Correndo "+metros+" metros.");
    }
    void nadar (double metros){
        System.out.println("Nadando"+metros+" m.");
    }
    String sorrir(){
        return ":)";
    }
}
