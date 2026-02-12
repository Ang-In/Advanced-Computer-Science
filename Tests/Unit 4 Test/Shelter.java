import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException(
                    "Cannot make a shelter with negative or zero dimensions!");
        }

        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        if (kennels == null) {
            throw new IllegalArgumentException("Cannot set kennels to nothing!");
        }
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Cannot add a nonexistent animal!");
        }

        boolean foundKennel = false;
        for (int i = 0; i < kennels.length; i++) {
            int colLen = kennels[i].length;
            for (int j = 0; j < colLen; j++) {
                if (kennels[i][j] == null) {
                    foundKennel = true;
                    kennels[i][j] = animal;
                    break;
                }
            }
            if (foundKennel) {
                break;
            }
        }

        if (!foundKennel) {
            System.out.println("No empty kennels.");
        }
    }


    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("Cannot add a nonexistent animal!");
        }
        if (row < 0 || row > kennels.length - 1) {
            throw new IllegalArgumentException("Cannot access an impossible row!");
        }
        for (int i = 0; i < kennels.length; i++) {
            int colLen = kennels[i].length;
            if (row == i && (col < 0 || col > colLen - 1)) {
                throw new IllegalArgumentException("Cannot access an impossible column!");
            }
        }

        Dog prevAnimal = kennels[row][col];
        if (prevAnimal == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
    }

    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Cannot add nonexistent animals!");
        }
        for (Dog animal : animals) {
            add(animal);
        }
    }

    public Dog adopt(int row, int col) {
        if (row < 0 || row > kennels.length - 1) {
            throw new IllegalArgumentException("Cannot access an impossible row!");
        }
        for (int i = 0; i < kennels.length; i++) {
            int colLen = kennels[i].length;
            if (row == i && (col < 0 || col > colLen - 1)) {
                throw new IllegalArgumentException("Cannot access an impossible column!");
            }
        }
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("Cannot adopt a nonexistent animal!");
        }

        Dog adoptee = kennels[row][col];
        kennels[row][col] = null;

        return adoptee;
    }

    public ArrayList<Dog> search(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Cannot search for a nonexistent name!");
        }

        ArrayList<Dog> searchResults = new ArrayList<Dog>();
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal == null) {
                    continue;
                }
                if (animal.getName().equals(name)) {
                    searchResults.add(animal);
                }
            }
        }

        return searchResults;
    }

    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Cannot search for a negative age!");
        }

        ArrayList<Dog> searchResults = new ArrayList<Dog>();
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal == null) {
                    continue;
                }
                if (animal.getAge() == age) {
                    searchResults.add(animal);
                }
            }
        }

        return searchResults;
    }
}
