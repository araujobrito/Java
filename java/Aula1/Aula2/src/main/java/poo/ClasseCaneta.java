package poo;

public class ClasseCaneta {

    String marca;
    String cor;
    String tipo;
    String material;
    int carga;
    float ponta;
    boolean tampa;

    //void significa "sem retorno"

        void escrever() {
        if(carga > 0 && tampa == false) {
            System.out.println("Caneta escrevendo");
        }else{
            System.out.println("erro!! Caneta sem carga ou está tampada");


        }
    }

        void rabiscar() {
        if(carga > 0 && tampa == false) {
            System.out.println("Caneta rabiscando");
        }else {
            System.out.println("erro!! Caneta sem carga ou está tampada");
        }
    }

        void pintar() {
        if(carga > 0 && tampa == false) {
            System.out.println("Caneta pintando!!");
        }else {
            System.out.println("erro!! Caneta sem carga ou está tampada");
        }
    }

        void estado(){
            System.out.println("Esta caneta é da marca: "+marca  );
            System.out.println("Esta caneta é da cor:"+cor);
            System.out.println("Esta caneta é do tipo: "+tipo);
            System.out.println("Esta caneta é de: "+material);
            System.out.println("Esta caneta está com: "+carga+"% de carga");
            System.out.println("Esta caneta tem a ponta: "+ponta);
            System.out.println("Esta caneta está: " + tampa);

        }
}



