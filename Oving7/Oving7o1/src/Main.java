public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        NyString testString = new NyString("det var en gang");
        System.out.println(testString);

        System.out.println(testString.forkort());
        testString.fjernBokstav('e');
        System.out.println(testString.fjernBokstav('e'));

        System.out.println('e');
        System.out.println('e' + 'e');
        System.out.println('e' + 'e' + 'e');

        System.out.println("e" + "e");

    }
}