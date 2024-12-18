public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        float creditSumm = 1_000_000F;
        int periodMonth = 1;
        float rateProcent = 9.99F;
        int anuitet = service.calculate(creditSumm,periodMonth,rateProcent);

        System.out.println();
        System.out.println("Параметры кредита 1_000_000 рублей  на 1 год  под  9.99%");
        System.out.println("Ваш аннуитет составит " + service.calculate(1_000_000F,1, 9.99F) + " рублей");

        System.out.println();
        System.out.println("Параметры кредита 1 000 000 рублей  на 2 год  под  9.99%");
        System.out.println("Ваш аннуитет составит " + service.calculate(1_000_000F,2, 9.99F) + " рублей");

        System.out.println();
        System.out.println("Параметры кредита 1 000 000 рублей  на 3 год  под  9.99%");
        System.out.println("Ваш аннуитет составит " + service.calculate(1_000_000F,3, 9.99F) + " рублей");

    
    }
}