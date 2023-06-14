import java.util.Scanner;

 class ElectricityBillCalculator {
    // Constants for unit rates and surcharge
    private static final double RATE_FIRST_100_UNITS = 0.60;
    private static final double RATE_NEXT_200_UNITS = 0.80;
    private static final double RATE_BEYOND_300_UNITS = 0.90;
    private static final double SURCHARGE_PERCENTAGE = 0.15;
    private static final double MAXIMUM_CHARGE_WITHOUT_SURCHARGE = 300.00;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();
        scanner.close();

        double totalBill = calculateElectricityBill(unitsConsumed);
        System.out.println("Total electricity bill: Rs " + totalBill);
    }
    private static double calculateElectricityBill(int unitsConsumed) {
        double billAmount = 50.0;

        if (unitsConsumed <= 100) {
            billAmount += unitsConsumed * RATE_FIRST_100_UNITS;
        } else if (unitsConsumed > 100 && unitsConsumed <= 200) {
            billAmount += (100 * RATE_FIRST_100_UNITS) + ((unitsConsumed - 100) * RATE_NEXT_200_UNITS);
        } else {
            billAmount += (100 * RATE_FIRST_100_UNITS) + (200 * RATE_NEXT_200_UNITS) + ((unitsConsumed - 300) * RATE_BEYOND_300_UNITS);
        }

        // Add surcharge if the total bill exceeds the maximum charge without surcharge
        if (billAmount > MAXIMUM_CHARGE_WITHOUT_SURCHARGE) {
            billAmount = billAmount + (billAmount * SURCHARGE_PERCENTAGE);
        }

        return billAmount;
    }
}
