public abstract class Pracownik {
    String imie;
    String nazwisko;
    void ustawImie(String a){
        imie = a;
    }
    void ustawNazwisko(String a){
        nazwisko = a;
    }
    abstract void drukujDzial();
    abstract void drukujPlace();
}
