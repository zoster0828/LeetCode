class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // 이름과 키를 쌍으로 저장할 클래스 정의
        class Person {
            String name;
            int height;
            
            Person(String name, int height) {
                this.name = name;
                this.height = height;
            }
        }
        
        Person[] people = new Person[names.length];
        for (int i = 0; i < names.length; i++) {
            people[i] = new Person(names[i], heights[i]);
        }
        
        // 내림차순 정렬
        Arrays.sort(people, (a, b) -> b.height - a.height);
        
        // 정렬된 이름 배열 생성
        String[] sortedNames = new String[names.length];
        for (int i = 0; i < people.length; i++) {
            sortedNames[i] = people[i].name;
        }
        
        return sortedNames;
    }
}