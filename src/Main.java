public class Main {
    public static void main(String[] args) {
        cz1();
        //cz2();
    }
    public static void cz2(){
        Kierownik kierownik = new Kierownik();
        kierownik.ustawImie("Jan");
        kierownik.ustawNazwisko("Kowalski");
        kierownik.drukujDzial();
        kierownik.drukujPlace();
        Dyrektor dyrektor = new Dyrektor();
        dyrektor.ustawImie("Norbert");
        dyrektor.ustawNazwisko("Przykladny");
        dyrektor.drukujDzial();
        dyrektor.drukujPlace();
        Fizyczny fizyczny = new Fizyczny();
        fizyczny.ustawImie("Andrzej");
        fizyczny.ustawNazwisko("Nowak");
        fizyczny.drukujDzial();
        fizyczny.drukujPlace();
    }
    public static void cz1(){
        Not not = new Not();
        not.coutinput=3;
        not.setInput("001");
        not.getOutput();
        Nand nand = new Nand();
        nand.coutinput=3;
        nand.setInput("101");
        nand.getOutput();
        Nor nor = new Nor();
        nor.coutinput=3;
        nor.setInput("010");
        nor.getOutput();
    }
}
