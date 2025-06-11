public class Sequence {
    private Object[] objects; // mảng chứa các object
    private int next = 0;     // chỉ số tiếp theo để thêm phần tử

    public Sequence(int size) {
        objects = new Object[size];
    }

    public void add(Object x) {
        if (next < objects.length) {
            objects[next] = x;
            next++;
        }
    }

    // Inner class SSelector implements Selector
    private class SSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == objects.length;
        }

        public Object current() {
            return objects[i];
        }

        public void next() {
            if (i < objects.length) i++;
        }
    }

    public Selector getSelector() {
        return new SSelector();
    }
}