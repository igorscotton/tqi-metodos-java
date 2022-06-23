import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args){

        System.out.println("Exercício calculadora");
        Calculadora.soma(5, 5);
        Calculadora.subtrair(5, 5);
        Calculadora.multiplicar(5, 5);
        Calculadora.dividir(5, 5);

        Date hour = new Date();
        hour.getTime();
        SimpleDateFormat justHour = new SimpleDateFormat("HH:mm:ss");
        String hourString = justHour.format(hour).substring(0, 2);

        Mensagem.message(hourString);

        Emprestimo.calcularEmprestimo(6000, 5);
        Emprestimo.calcularEmprestimo(20000, 5);
        Emprestimo.calcularEmprestimo(100000, 5);
    }

}
