package pruebas_unitarias.ejercicio3;

public class Empleat {

    public double calculaSalariBrut(String tipusEmpleat, double vendesMes, int horesExtra) throws MaException {
        if (tipusEmpleat == null || (!tipusEmpleat.equals("venedor") && !tipusEmpleat.equals("encarregat"))) {
            throw new MaException("el tipus de venedor no és correcte");
        }
        if (vendesMes < 0 || horesExtra < 0) {
            throw new MaException("el valor no pot ser negatiu");
        }

        double salariBase = tipusEmpleat.equals("venedor") ? 1000 : 1500;
        double prima = vendesMes >= 2500 ? 200 : (vendesMes >= 1000 ? 100 : 0);
        double extra = horesExtra * 18.57;

        return salariBase + prima + extra;
    }

    public double calculaSalariNet(double salariBrut) throws MaException {
        if (salariBrut < 0) {
            throw new MaException("el valor no pot ser negatiu");
        }

        double retencio = salariBrut > 1500 ? 0.20 : (salariBrut >= 1000 ? 0.16 : 0);

        return salariBrut * (1 - retencio);
    }
}
