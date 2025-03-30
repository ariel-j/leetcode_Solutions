
import java.util.HashMap;
import java.util.Random;
class RandomizedSet {
    private HashMap<Integer, Integer> set;
    public RandomizedSet() {
        set = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if (set.containsKey(val)) {
            return false; // Already exists
        }
        set.put(val, val);
        return true;
    }
    
    public boolean remove(int val) {
        if (!set.containsKey(val)) {
            return false; // Doesn't exist
        }
        set.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        //int size = set.size();
        int randomIndex = rand.nextInt(set.size());
        return (int) set.values().toArray()[randomIndex];
    }
}

/*
 * From <https://leetcode.com/problems/insert-delete-getrandom-o1/description/?envType=study-plan-v2&envId=top-interview-150> 
 */