import java.util.Arrays;
import java.util.List;

public class Pet {
    private String name;
    private String type;
    private int age;
    private String colour;

    /**
     * This constructor takes 4 arguments, one for the name, one for
     * the type one for age and last for the colour.
     *
     * The constructor must be the same name as the class (including the upper case first letter)
     * The constructor does NOT have a return type
     */
    public Pet(String name, String type,int age,String colour){
        setName(name);
        setType(type);
        setAge(age);
        setColour(colour);
    }

    public String getName() {
        return name;
    }

    /**
     * This method will validate that the argument is 2 in length
     * set the instance variable
     * @param name - this is a String to represent the name of the animals
     */
    public void setName(String name) {
        if(name.length()>=2)
            this.name = name;
        else
            throw new IllegalArgumentException(name+ " should be at least 2 characters in length");
    }

    public String getType() {
        return type;
    }

    /**
     * This returns a list of valid types of animals
     * @return
     */
    public static List<String> getTypes(){
        return Arrays.asList("dog","cat","bird","fish","reptile");
    }

    /**
     * This method will validate that the argument is in the collection of
     * "dog","cat","bird","fish","reptile" and set the instance variable
     * @param type - this is a String to represent the type of the animal
     */
    public void setType(String type) {
        type = type.toLowerCase();
        if(getTypes().contains(type))
            this.type = type;
        else
            throw new IllegalArgumentException(type+ " is not valid, please choose from "+getTypes());
    }

    public int getAge() {
        return age;
    }

    /**
     * This method will validate that the argument is in range of 0 to 60
     * set the instance variable
     * @param age - this is a int to represent the age of the animals
     */
    public void setAge(int age) {
        if(age > 0 && age < 60)
            this.age = age;
        else
            throw new IllegalArgumentException(age+ " is not valid, age should be between 0 to 60" );
    }

    public String getColour() {
        return colour;
    }


    public static List<String> getColours(){
        return Arrays.asList("yellow", "brown", "black", "blue", "red", "white","grey");
    }

    /**
     * This method will validate that the argument is in the collection of
     * "yellow", "brown", "black", "blue", "red", "white","grey" and set the instance variable
     * @param colour - this is a String to represent the colour of the animal
     */
    public void setColour(String colour) {
        colour = colour.toLowerCase();
        if(getColours().contains(colour))
            this.colour = colour;
        else
            throw new IllegalArgumentException(colour+ " is not valid, please choose colour from "+getColours());
    }

    //returns how animals speaks
    public String speak(){
        if(type.equals("dog"))
            return "woof woof";
        else if(type.equals("cat"))
            return "meow meow";
        else if(type.equals("bird"))
            return "chirp chirp";
        else if(type.equals("reptile"))
            return "hiss";
        else if(type.equals("fish"))
            return "Smimming sound";
        else
            return "invalid";
    }

    //returns how animals moves
    public String movesBy(){
        if(type.equals("dog"))
            return "walks or runs";
        else if(type.equals("cat"))
            return "walks or runs";
        else if(type.equals("bird"))
            return "flies";
        else if(type.equals("reptile"))
            return "silther or walk";
        else if(type.equals("fish"))
            return "swim";
        else
            return "invalid";
    }

    //returns animals has fur or not
    public boolean hasFur(){
        if(type.equals("dog"))
            return true;
        else if(type.equals("cat"))
            return true;
        else if(type.equals("bird"))
            return false;
        else if(type.equals("reptile"))
            return false;
        else if(type.equals("fish"))
            return false;
        else
            System.out.println("invalid");
            return false;
    }
    public String toString(){
        return name+" is a "+age+ " year old "+colour+" "+type;
    }
}
