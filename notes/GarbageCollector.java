package notes;

class GarbageCollector {
    GarbageCollector() {
        System.out.println("Object Created");
    }

    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }

    public static void main(String args[]) {

        GarbageCollector d1 = new GarbageCollector();
        d1 = null;

        GarbageCollector d2 = new GarbageCollector();
        GarbageCollector d3 = new GarbageCollector();
        d2 = d3;

        new GarbageCollector(); // ananymous object
        System.gc(); // or Runtime.getRuntime().gc();
    }
}
