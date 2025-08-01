class Solution {

    List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> generate(int numRows) {        
        List<Integer> list = Arrays.asList(1);
        result.add(list);        
        generate(numRows-1, list); 

        return result;
    }

    public void generate(int numRows, List<Integer> input) {        
        if(numRows == 0) {return;}        
        List<Integer> list = new ArrayList();
        int pre = 0;
        for(Integer num : input) {
            list.add(pre + num);
            pre = num;
        }
        list.add(pre);
        result.add(list);
        generate(numRows-1, list);
    }
}