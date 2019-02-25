public class Fizyczny extends Pracownik {
    @Override
    void drukujPlace() {
        System.out.println("zarobki miesiecznie to: 1600");
    }

    @Override
    void drukujDzial() {
        System.out.println(imie+" "+nazwisko+" pracuje na magazynie");
    }
}
