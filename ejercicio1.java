public class Main {
    public static void main(String[] args) {
        int segundos = calcularSegundos(1, 2, 3);
        System.out.println("El número de segundos en 1 año, 2 meses y 3 días es: " + segundos);
    }

    public static int calcularSegundos(int anos, int meses, int dias) {
        int diasPorAno = 365;
        int horasPorDia = 24;
        int minutosPorHora = 60;
        int segundosPorMinuto = 60;

        int totalDias = (anos * diasPorAno) + (meses * 30) + dias;
        int totalSegundos = totalDias * horasPorDia * minutosPorHora * segundosPorMinuto;

        return totalSegundos;
    }
}
