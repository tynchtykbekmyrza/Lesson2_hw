public class Iphone extends Phones{
    private int YearOfIssue;
    private int model;

    public Iphone(int yearOfIssue, int model) {
        YearOfIssue = yearOfIssue;
        this.model = model;
    }

    @Override
    public void print() {
        System.out.println("Айфон" + " Год выпуска" + " " + YearOfIssue +
                "\nМодель"    + " "+ model );
    }
}
