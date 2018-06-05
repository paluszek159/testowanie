package landAnimal;

public class Lew {
    //TODO Uzupełnić pola klasy

    private String name;
        private int weight;

    git remote add origin git@github.com:paluszek159/testowanie.git
    public Lew () {
    }

    public Lew (String name, int weight) {

        this.name = name;
        this.weight = weight;
    }

    public Lew (int weight) {

        this.weight = weight;
    }

    public Lew (String name) {

        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getWeight () {
        return weight;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }
}
