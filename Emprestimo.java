public class Emprestimo {

    public static void calcularEmprestimo(double valor, int parcelas){

        double total;

        if(valor < 10000){
            total = valor + valor*0.5;
        }else if(valor < 80000){
            total = valor + valor*0.9;
        }else{
            total = valor + valor*1.1;
        }

        System.out.println("O valor total é: " + total);
    }

}
