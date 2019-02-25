public class Not extends Bramka {
    @Override
    int getOutput() {
        int wynik;
        if(inputs<=0){
            wynik = 0;
        }else{
            wynik = 1;
        }
        return wynik;
    }
}
