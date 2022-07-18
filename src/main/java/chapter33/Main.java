package chapter33;

import java.util.HashSet;
import java.util.Set;

//code.oa.gg/java8/1127
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("영희", 22);
        ages.put("철수", 23);
        ages.put("민서", 25);
        ages.put("철수", 27);
        ages.remove("영희");
        ages.put("광수", 27);
        for ( String name : ages.keySet() ) {
            System.out.println("이름 : " + name + ", 나이 : " + ages.get(name));
        }
        /* 출력결과 */
        // 이름 : 철수, 나이 : 27
        // 이름 : 민서, 나이 : 25
        // 이름 : 광수, 나이 : 27
        HashMap<String, Object> everyone = new HashMap<>();
        everyone.put("사람", new 사람());
        everyone.put("원숭이", new 원숭이());
        ((사람)everyone.get("사람")).말하다();
        // 출력 => 사람이 말합니다.
        ((원숭이)everyone.get("원숭이")).묘기를_부리다();
        // 출력 => 원숭이가 묘기를 부립니다.
    }
}

class HashMap<K, V> {
    private Object keys[];
    private Object values[];
    private int size;

    public HashMap() {
        keys = new Object[2];
        values = new Object[2];
        size = 0;
    }

    // (key, value) 삽입/수정
    public void put(K key, V value) {
        int idx = indexOfKey(key);

        if (idx == -1) {
            sizeUp();
            // 키가 없으면 새로 삽입
            keys[size] = key;
            values[size] = value;
            size++;
        } else {
            // 키가 있으면 덮어쓰기
            values[idx] = value;
        }
    }

    // key로 value 조회
    public V get(K key) {
        int idx = indexOfKey(key);
        // 키가 없으면 null 반환
        if (idx == -1) {
            return null;
        }
        return (V) values[idx];
    }

    // key로 (key, value) 삭제
    public void remove(K key) {
        int idx = indexOfKey(key);
        // 키가 있을 때만 삭제
        if (idx != -1) {
            // 앞으로 땡겨오기
            for (int i = idx + 1; i < size; i++) {
                keys[i - 1] = keys[i];
                values[i - 1] = values[i];
            }
            size--;
        }
    }

    // 해당 key가 HashMap에 있는지 여부 리턴
    public boolean containsKey(K key) {
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key))
                return true;
        }
        return false;
    }

    // 해당 key의 인덱스 리턴
    public int indexOfKey(K key) {
        for (int i = 0; i < size; i++) {
            if(keys[i].equals(key))
                return i;
        }
        return -1;
    }

    // HashMap의 모든 key를 set으로 리턴
    public Set<K> keySet() {
        Set<K> keySet = new HashSet<K>();
        for (int i = 0; i < size; i++) {
            keySet.add((K) keys[i]);
        }
        return keySet;
    }

    // 내부 배열이 꽉차면, 내부 배열 크기 2배 늘리기
    public void sizeUp() {
        if (size >= keys.length) {
            Object[] newKeys = new Object[size * 2];
            Object[] newValues = new Object[size * 2];
            for (int i = 0; i < size; i++) {
                newKeys[i] = keys[i];
                newValues[i] = values[i];
            }
            System.out.println("내부 배열의 사이즈가 증가: " + keys.length + " -> " + newKeys.length);
            keys = newKeys;
            values = newValues;
        }
    }
}

class 사람 {

    public void 말하다() {
        System.out.println("사람이 말합니다");
    }
}

class 원숭이 {

    public void 묘기를_부리다() {
        System.out.println("원숭이가 묘기를 부립니다");
    }
}