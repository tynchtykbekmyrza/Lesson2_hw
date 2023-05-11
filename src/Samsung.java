public class Samsung extends Phones {

    private int AndroidVersion;
    private String Color;

    public Samsung(int androidVersion, String color) {
        AndroidVersion = androidVersion;
        Color = color;
    }

    @Override
    public void print() {
        System.out.println(("Cамсунг" + " Версия Андроида" + AndroidVersion +
                "\nЦвет" + " " + Color));

    }
}
