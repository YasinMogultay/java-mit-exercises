public class FooCorporation {
    public static void main(String[] args) {
//        System.out.printf("Employee 1    %.2f\n", totalPay(7.5, 35));
        System.out.printf("Employee 2    $%.2f\n", totalPay(7 , 47));
    }

    public static double totalPay (double basePay, double hoursWorked) {
        if (hoursWorked > 40 && basePayCheck(basePay) && numberOfHoursCheck(hoursWorked)) {
            double overtimeHours = hoursWorked - 40;
            double normalHours = hoursWorked - overtimeHours;
            return overTimePay(basePay,hoursWorked) + (basePay * normalHours);
        } else if (basePayCheck(basePay) && hoursWorked <= 40 && numberOfHoursCheck(hoursWorked)){
            return basePay * hoursWorked;
        } else {
            return totalPay(basePay,hoursWorked);
        }
    }

    public static double overTimePay (double basePay, double hoursWorked) {
        return (hoursWorked - 40) * (1.5 * basePay);
    }

    public static boolean basePayCheck (double bp) {
        return !(bp < 8);
    }

    public static boolean numberOfHoursCheck (double hw) {
        return !(hw > 60);
    }
}
