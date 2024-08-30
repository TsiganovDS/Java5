public class z9 {
    public static void main(String[] args) {
        double s = 29000;
        double a = 0;
        for (int i = 1; i <= 12; i++) {
            a = a + s + s * 0.1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + a + " рублей.");
        }
    }
}
