public class Quadruple <A>{
    public A first;
    public A second;

    Quadruple(A first, A second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + this.first + "," + this.second + ")";
    }
}
