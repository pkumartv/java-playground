package dp.singleton;

public class SingletonBetter {

    // private SingletonBetter singletonBetter;
    private SingletonBetter() {
    }

    private static class SingletonBetterHolder {

        public static final SingletonBetter instance = new SingletonBetter();

    }

    public static SingletonBetter getInstance() {
        return SingletonBetterHolder.instance;

    }

    // Better implementation would be
    // Although the Singleton pattern was introduced by GoF,
    // the original implementation is known to be problematic in multithreaded
    // scenarios.
    // So here, we're going to follow a more optimal approach that makes use of a
    // static inner class:

}
