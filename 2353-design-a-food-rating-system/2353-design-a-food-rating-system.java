class FoodRatings {
    
    private Map<String, PriorityQueue<Food>> highest;
    private Map<String, Food> foodMap;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        int length = foods.length;
        highest = new HashMap();
        foodMap = new HashMap();
        for(int i = 0 ; i < length ; i++) {
            Food food = new Food(foods[i], cuisines[i], ratings[i]);
            foodMap.put(foods[i], food);
            if(highest.get(cuisines[i]) == null) {
                highest.put(cuisines[i], new PriorityQueue<Food>());
            }

            PriorityQueue<Food> priorityQueue = highest.get(cuisines[i]);
            priorityQueue.add(food);
        }
    }

    public void changeRating(String food, int newRating) {
        Food found = foodMap.get(food);
        PriorityQueue<Food> queue = highest.get(found.cuisine);
        queue.remove(found);
        Food newFood = new Food(found.name, found.cuisine, newRating);
        foodMap.put(newFood.name, newFood);
        queue.add(newFood);
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> priorityQueue = highest.get(cuisine);
        return priorityQueue.peek().name;
    }

    class Food implements Comparable<Food> {
        public String name;
        public String cuisine;
        public int rating;

        public Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }


        @Override
        public int compareTo(Food target) {
            if(this.rating == target.rating) {
                return this.name.compareToIgnoreCase(target.name);
            }
            return this.rating < target.rating ? 1 : - 1;
        }
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */