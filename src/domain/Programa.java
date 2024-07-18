package domain;

public class Programa {
    public static void main(String[] args) {


        Custumer cliente = new Custumer("A", false);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();
    }

    private static Factory getFactory(Custumer cliente) {
        if (cliente.hasCompanyContract()) {
            return new ContratoFactory();
        } else {
            return new SemContratosFactory();
        }

    }

}