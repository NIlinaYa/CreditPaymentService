public class CreditPaymentService {
    public int calculate(float creditSumm, int periodMonth, float rateProcent) {
        float pp = (rateProcent / 12)/100;
        int periomInMonth = periodMonth *12;
        float a = 1 + pp;
        //System.out.println("величина 1 + i  = " + a);
        //System.out.println("количество месяцев  = " + periodMonth);

        float k = (float)Math.pow(a, periomInMonth);
        //System.out.println("возвели в степень период за год " +k);
        //System.out.println(" Сумма кредита " +creditSumm);
        float kk = (pp * k) / (k - 1);
        //System.out.println("коэффициент K= " +k);
        int anuitent = (int) (creditSumm * kk); // вычисляем ануитет;

        return anuitent; /* возвращаем в main  значение локальной пременной index*/
    }

}
