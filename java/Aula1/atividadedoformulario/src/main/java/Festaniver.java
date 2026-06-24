import org.example.Atividadedoformulario;

public class Festaniver {
    public static void main(String[] args) {
        Atividadedoformulario f = new Atividadedoformulario(); // cria o objeto certo
        f.setHorario("18:30");
        f.setLocal("lapa tito");
        f.setDuracao("3horas");
        f.setEncerramento("22Hrs");
        f.setMusica("rock");

        System.out.println("horario " + f.getHorario());
        System.out.println("local " + f.getLocal());
        System.out.println("duração " + f.getDuracao());
        System.out.println("encerramento " + f.getEncerramento());
        System.out.println("musica " + f.getMusica());
    }



}
