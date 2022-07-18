package chapter33;

//code.oa.gg/java8/1127
public class Main {
    public static void main(String[] args) {
        HashMap aMap = new HashMap();

        aMap.put(1, "안녕");
        aMap.put("A", false);
        aMap.put("A", true);

        System.out.println(aMap.get("A"));
        // 출력 : true
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
        int idx = indexOfKey(key);

        if (idx == -1) {
            // 키가 없으면 새로 삽입
            keys[size] = key;
            values[size] = value;
            size++;
        } else {
            // 키가 있으면 덮어쓰기
            values[idx] = value;
        }
    }

    public Object get(Object key) {
        int idx = indexOfKey(key);
        // 키가 없으면 null 반환
        if (idx == -1) {
            return null;
        }
        return values[idx];
    }

    public boolean containsKey(Object key) {
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key))
                return true;
        }
        return false;
    }

    // 해당 key의 인덱스 반환
    public int indexOfKey(Object key) {
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key))
                return i;
        }
        return -1;
    }
}