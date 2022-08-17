public class Main {
    public static void main(String[] args) {

        Cuenta micuenta = new Cuenta("1223", "ahorro",150000);
        System.out.println("Saldo minimo : " +micuenta.getSaldoMinimo());
        micuenta.consignar(80000);
        System.out.println("Saldo Actual : " +micuenta.getSaldoActual());
        micuenta.retirar(50000);
        System.out.println("Saldo Actual : " +micuenta.getSaldoActual());
    }
}
