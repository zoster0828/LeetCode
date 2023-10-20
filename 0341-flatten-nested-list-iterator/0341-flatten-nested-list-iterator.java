/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    List<Integer> list;
    int po = -1;
    public NestedIterator(List<NestedInteger> nestedList) {
        list = getList(nestedList);
    }
    
    private List<Integer> getList(List<NestedInteger> nestedList) {
        List<Integer> list = new ArrayList();
        for(NestedInteger nested : nestedList) {
            if(nested.isInteger()) {
                list.add(nested.getInteger());
            } else {
                List<Integer> integers = getList(nested.getList());
                list.addAll(integers);
            }
        }
        
        return list;
    }

    @Override
    public Integer next() {
        po++;
        if(list.size() > po) {            
            return list.get(po);
        }else {
            return null;
        }
    }

    @Override
    public boolean hasNext() {
        return list.size() > po+1;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */