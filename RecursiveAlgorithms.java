public class RecursiveAlgorithms {
    public int linearSearch(int pSearched) {
        return linearSearch(pSearched, 0);
    }
    public int linearSearch(int pSearched, int currentElement) {
        if(a[currentElement] == pSearched) {
            return currentElement;
        } else if(currentElement == a.length-1) {
            return -1;
        } else {
            return linearSearch(pSearched, currentElement+1);
        }
    }
    /* je nachdem ob a groesser oder kleiner (oder gleich) b ist,
     * ruft die Methode sich selbst nochmal mit unterschiedlichen Parametern auf
     */
    public int ggT(int a, int b) {
        // Rekursionanker wenn a oder b Null sind
        if(a == 0 || b == 0) {
            return a+b;
        } else if(a > b) {
            return ggT(a-b, b);
        } else {
            return ggT(a, b-a);
        }
    }
}
