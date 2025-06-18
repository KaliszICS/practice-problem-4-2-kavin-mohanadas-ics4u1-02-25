public class Dog {
    private String name;
    private String breed;
    private int weight;

    /**
     * Dog object with name, breed, and weight
     *
     * @param name name of the dog
     * @param breed breed of the dog
     * @param weight weight of the dog
     */
    public Dog(String name, String breed, int weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    /**
     * this returns the name of the dog
     *
     * @return the dog's name
     */
    public String getName() {
        return name;
    }

    /**
     * this sets the name of the dog
     *
     * @param name the dog's new name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this returns the dog's breed
     *
     * @return the dog's breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * this sets the dog's breed
     *
     * @param breed the dog's new breed
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * this returns the dog's weight
     *
     * @return the dog's weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * this sets the dog's weight
     *
     * @param weight the dog's new weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }
}