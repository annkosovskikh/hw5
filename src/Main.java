import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final var marsGravity = 3.721;
        final var earthGravity = 9.80665;
        final var fuelKg = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес груза, который нужно выгрузить на орбиту Марса (в кг): ");
        var weight = scanner.nextDouble();

        double fuelNeeded = (weight * (marsGravity / earthGravity)) * fuelKg;
        System.out.println("Для выгруза " + weight + " кг груза на орбиту Марса необходимо " + fuelNeeded + " кг топлива.");

    }
}