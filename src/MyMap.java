import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMap<K, V> {

    private Set<Entry<K, V>> entries = new HashSet<>();

    public void put(K key, V value) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }
        entries.add(new Entry<>(key, value));
    }

    public void remove(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                entries.remove(entry);
            }
        }
    }

    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public int size() {
        return entries.size();
    }

    public boolean isEmpty() {
        return entries.isEmpty();
    }

    public List<V> getAllValues() {
        List<V> values = new ArrayList<>();
        for (Entry<K, V> entry : entries) {
            values.add(entry.getValue());
        }
        return values;
    }
}
