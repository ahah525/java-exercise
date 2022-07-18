package chapter33;

//code.oa.gg/java8/1127
public class Main {
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");
        aMap.put("A", false);

        System.out.println(aMap.get("A"));
        // 출력 : false
    }
}

class HashMap {
    private Object keys[];
    private Object values[];
    int size;

    public HashMap() {
        keys = new Object[10];
        values = new Object[10];
        size = 0;
    }

    public void put(Object key, Object value) {
        keys[size] = key;
        values[size] = value;
        size++;
    }

    public Object get(Object key) {
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }

    public boolean containsKey(Object key) {
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key))
                return true;
        }
        return false;
    }
}