public class Kierownik extends Pracownik {

    @Override
    void drukujPlace() {
        System.out.println("zarobki miesiecznie to: 3000");
    }

    @Override
    void drukujDzial() {
        System.out.println(imie+" "+nazwisko+" pracuje w Biurze 100B");
    }
}
