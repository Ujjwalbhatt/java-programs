package notes;

class GarbageCollectorClass {
    GarbageCollectorClass() {
        System.out.println("Object Created");
    }

    public void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }

    public static void main(String args[]) {

        GarbageCollectorClass d1 = new GarbageCollectorClass();
        d1 = null;

        GarbageCollectorClass d2 = new GarbageCollectorClass();
        GarbageCollectorClass d3 = new GarbageCollectorClass();
        d2 = d3;

        new GarbageCollectorClass(); // ananymous object
        System.gc(); // or Runtime.getRuntime().gc();
    }
}
