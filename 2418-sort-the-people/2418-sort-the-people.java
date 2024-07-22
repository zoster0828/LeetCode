class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Person[] people = new Person[n];
        
        // 이름과 키를 쌍으로 저장
        for (int i = 0; i < n; i++) {
            people[i] = new Person(names[i], heights[i]);
        }
        
        // 내림차순 정렬
        Arrays.sort(people, (a, b) -> Integer.compare(b.height, a.height));
        
        // 정렬된 이름 배열 생성
        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = people[i].name;
        }
        
        return sortedNames;
    }
    
    // Person 클래스 정의
    class Person {
        String name;
        int height;
        
        Person(String name, int height) {
            this.name = name;
            this.height = height;
        }
    }
}