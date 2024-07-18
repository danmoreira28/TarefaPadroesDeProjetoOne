package domain;

public class ContratoFactory extends Factory{
    @Override
    Car retrieveCar(String carroCriado) {
        if ("A".equals(carroCriado)) {
            return new Corola(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}