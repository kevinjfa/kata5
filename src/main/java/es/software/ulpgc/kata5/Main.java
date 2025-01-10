package es.software.ulpgc.kata5;

public class Main {
    public static void main(String[] args) {
        UserAdapter adapter = new RandomUserAdapter();
        UserLoader loader = new RandomUserLoader();
        for (int i = 0; i < 50; i++) {
            System.out.println(adapter.adapt(loader.load()));
        }
    }
}
