package poo;

public class Caneta {
    public static void main(String[] args) {
        ClasseCaneta caneta1 = new ClasseCaneta();

        caneta1.marca = "BIC";
        caneta1.cor = "PRETA";
        caneta1.tipo = "Esferográfica";
        caneta1.material = "Acrilico";
        caneta1.carga = 100;
        caneta1.ponta = 0.5f;
        caneta1.tampa = false;

        caneta1.estado();
        caneta1.escrever();

    }
}
