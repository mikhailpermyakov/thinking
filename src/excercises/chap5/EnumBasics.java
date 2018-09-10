package excercises.chap5;

public class EnumBasics {
    public enum MoneyEnum {
        ROUBLE, DOLLAR, EURO, YENA, DINAR, TENGE
    }

    public static class CurrencyDescription{
        MoneyEnum currency;

        CurrencyDescription(MoneyEnum currency) {
            this.currency = currency;
        }

        void describe(){
            System.out.println("This currency is ");
            switch (currency){
                case EURO:
                case DOLLAR:
                    System.out.println("one of the most popular");
                    break;
                case YENA:
                case TENGE:
                    System.out.println("from Asia");
                    break;
                case DINAR:
                    System.out.println("from KSA");
                    break;
                case ROUBLE:
                    System.out.println("from Russia");
                    break;
            }
        }
    }
    public static void main(String[] args) {
        CurrencyDescription
                rouble = new CurrencyDescription(MoneyEnum.ROUBLE),
                tenge = new CurrencyDescription(MoneyEnum.TENGE),
                dollar = new CurrencyDescription(MoneyEnum.DOLLAR);
        for (MoneyEnum currency : MoneyEnum.values()){
            System.out.println(currency + " " + currency.ordinal());
        }

        rouble.describe();
        tenge.describe();
        dollar.describe();
    }
}
