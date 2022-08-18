public class Main {
    public static void main(String[] args) {

        Cuenta micuenta = new Cuenta("1223", "ahorro",150000);
        System.out.println("Saldo minimo : " +micuenta.getSaldoMinimo());
        micuenta.consignar(80000);
        System.out.println("Saldo Actual : " +micuenta.getSaldoActual());
        micuenta.retirar(50000);
        System.out.println("Saldo Actual : " +micuenta.getSaldoActual());

        Persona persona1= new Persona("456", "ahorro", 200000,28,"111222333","Luis Diaz");
        System.out.println("Saldo minimo : "+persona1.getSaldoMinimo());
        persona1.consignar(100000);
        System.out.println("Saldo actual : "+persona1.getSaldoActual());
        persona1.retirar(300000);
        System.out.println("Saldo actual : "+persona1.getSaldoActual());
    }

}
