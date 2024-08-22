import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);

        System.out.println("Volume atual: "+ smartTv.volume);

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
       
     
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

       

    }
}
