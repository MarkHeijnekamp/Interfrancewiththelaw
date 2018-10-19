import java.util.*;

public class Main {

    public static void main(String[] args) {

        boolean runGame = true;

        Scanner scan = new Scanner(System.in);
        String input = "";

        String[] commandos = {"hoger","lager","exit"};

        double getalstart = 0;
        double getaleind = 0;

        while (runGame){

            getalstart = Math.ceil(Math.random() * 10);

            System.out.println("Het start getal is " + getalstart);
//            input conroleren:

            boolean geldigeinput = false;
           //als dit dan doe dat
            while (geldigeinput == false) {

                input = scan.nextLine();
                input = input.toLowerCase();

                for (int i = 0; i < commandos.length; i++){
                    if (input.equals(commandos[i])){
                        geldigeinput = true;
                        break;
                    }
                }
            }

            //input is geldig check resultaat:

            getaleind = Math.ceil(Math.random() * 10);
            boolean win = false;
            if (input.equals(commandos[0])){
                if (getaleind > getalstart){
                    //won
                    win = true;
                }
            }
            else if (input.equals(commandos[1])){
                if (getaleind < getalstart){
                     win = true;
                }


                    if (input.equals(commandos[0])){
                        if (getaleind > getalstart){
                            //won

                        }
                    }

                }

            else{

                //exitgame
                runGame = false;
                continue;//begint opnieuw
            }

            //eindresultaat tonen:
            System.out.println("Het start getal is " + getalstart);
            System.out.println("Het eind getal is " + getaleind);

            if (win == true){
                System.out.println("je hebt gewonnen oude gokverslaafde");
            }
            else{
                System.out.println("je hebt verloren oude gokverslaafde");

            }





        }
    }
}
