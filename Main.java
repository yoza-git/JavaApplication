public class Main {
    public static void main(String[] args) {
        Pair2<String, Integer> p = new Pair2<>("test1", 100);

        System.out.println(p);
    }
    public static <A> Quadruple<A> getQuadrupleBy(Pair<Pair<A>> pairPair) {
        Pair<String> pair1 = new Pair<>("test1","test2");
        Pair<String> pair2 = new Pair<>("test3","test4");
        Pair<Pair<String>> pairPair = new Pair<>(pair1, pair2);
        Quadruple q = Quadruple.getQuadrupleBy(pairPair);
        System.out.println(q);

}