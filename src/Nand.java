public class Nand extends Bramka {
    //1+1=0
    @Override
    String getOutput() {
        if(coutinput!=inputs.length()){
            System.out.println("ilosc wejsc sie nie zgadza");
        }
        int check;
        String wynik="";
        for (int i = 0; i < coutinput; i++) {
            check = inputs.charAt(i);
            if(check==48){
                System.out.println("0");
                return "0";
            }else if(check==49){
                wynik="1";
            }else{
                System.out.println("podana liczba nie jest liczba binarna");
            }
        }
        System.out.println(wynik);
        return wynik;
    }
}
