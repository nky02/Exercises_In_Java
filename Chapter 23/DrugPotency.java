public class DrugPotency {
    public static void main(String[] args) {
        double effectiveness = 100.0;
        int month = 0;

        while (effectiveness >= 50.0) {
            System.out.printf("month: %d \teffectiveness: %.2f\n", month, effectiveness);
            effectiveness *= 0.96; // Decrease by 4%
            month++;
        }
        System.out.printf("month: %d \teffectiveness: %.2f DISCARDED\n", month, effectiveness);
    }
}