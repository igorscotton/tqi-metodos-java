public class Mensagem {

    public static void message(String hour){
        int hourNumber = Integer.parseInt(hour);

            if(hourNumber > 5 && hourNumber < 12){
                System.out.println("Bom dia!");
            }else if(hourNumber >= 12 && hourNumber < 19){
                System.out.println("Boa Tarde!");
            }else if(hourNumber >= 19 || hourNumber < 5){
                System.out.println("Boa Noite!");
            }
    }

}
