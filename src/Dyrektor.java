public class Dyrektor extends Pracownik {
    @Override
    void drukujDzial() {
        System.out.println(imie+" "+nazwisko+" pracuje w Biurze głównym");
    }

    @Override
    void drukujPlace() {
        System.out.println("zarobki miesiecznie to: 13000");
    }
}
