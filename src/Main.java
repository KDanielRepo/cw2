public class Main {
    public static void main(String[] args) {
        cz2();
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
}
