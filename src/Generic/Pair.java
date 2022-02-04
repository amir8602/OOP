package Generic;

public class Pair <K,V>  {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {

        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Pair <K,V> left=this;
        Pair <K,V> right=(Pair<K, V>) (obj);
        if(left.key.getClass().equals(right.key.getClass()))
            if(left.value.getClass().equals(right.value.getClass()))
                if(left.getKey().equals(right.getKey()))
                    if (left.getValue().equals(right.getValue()))
                        return true;
        return false;

    }

    @Override
    public String toString() {
        String keyType = this.key.getClass().getSimpleName();
        String valType = this.value.getClass().getSimpleName();
        return "Pair{" +
                keyType + "=" + key +
                ","+valType+" =" + value +
                '}';
    }
}
