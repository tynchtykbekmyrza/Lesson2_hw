public class Nokia extends Phones{
    private int Memory;
    private double DisplayDiagonalInInch;

    public Nokia(int memory, double displayDiagonalInInch) {
        Memory = memory;
        DisplayDiagonalInInch = displayDiagonalInInch;
    }

    @Override
    public void print() {
        System.out.println( " Нокия" + " Память" + " " + Memory +
                    "\nРазмер дисплея в дюймах"    + " " + DisplayDiagonalInInch);
    }
}
