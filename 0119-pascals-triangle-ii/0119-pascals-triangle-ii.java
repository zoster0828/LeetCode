class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) {
            return Arrays.asList(1);
        }        
        
        return calc(rowIndex);
    }
    
    public List<Integer> calc(int rowIndex) {
        List<Integer> list = Arrays.asList(1,1);
        for(int i = 1 ; i < rowIndex  ;i++) {
            List<Integer> temp = new ArrayList();
            temp.add(1);
            for(int j = 0 ; j < list.size() -1 ; j++) {
                temp.add(list.get(j) + list.get(j+1));
            }
            temp.add(1);
            list = temp;
        }
        
        return list;
    }
}