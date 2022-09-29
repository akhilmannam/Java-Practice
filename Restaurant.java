public class Restaurant {
    private String name;
    private String cuisine;
    private int cap;

    public Restaurant(String setName, String setCuisine, int setCap) {
        name = setName;
        cuisine = setCuisine;
        cap = setCap;
    }

    @Override
    // Method to check if two restaurants have the same name and cuisine
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) o;
        return other.name.equals(name) && other.cuisine.equals(cuisine);
    }

    public static void main(String[] args) {
        Restaurant one = new Restaurant("KFC", "Asian", 450);
        Restaurant two = new Restaurant("KFC", "European", 300);
        System.out.println(one.equals(two));
    }
}