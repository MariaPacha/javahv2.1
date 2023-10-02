public class Main {
    public static void main(String[] args) {

        int start = 15;
        int refill = 340;
        int bonus = 1;

        if (refill < 1000) {
            bonus = 0;
        }

        int account = start + refill + refill / 100 * bonus;
        int  sumBonus = account - start - refill;

        System.out.println("Итоговый счет:" +account);
        System.out.println("Количество бонусов:" +sumBonus);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

//Один из сотовых операторов решил сделать своим клиентам приятный бонус:
// если клиент пополняет счёт более чем на 1000 рублей, то сотовый оператор
// дарит ему по 1 рублю за каждые полные 100 рублей пополнения.
//
//Примеры. Начальные данные: у клиента на счету 100 рублей.
//
//Клиент пополнил счёт на 300 рублей — бонусов нет, итоговая сумма на счету
// клиента — 400 рублей.
//Клиент пополнил счёт на 1100 рублей — бонус равен 11 рублям, итоговая сумма
// на счету клиента — 1211 рублей.
//Нужно создать приложение, выводящее итоговый счёт и количество бонусных рублей.
// Количество денег на текущем счету клиента и сумму пополнения вы выбираете сами
// — создайте переменные, в которых эти данные будут храниться.