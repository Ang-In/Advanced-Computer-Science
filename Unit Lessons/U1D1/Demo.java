class Demo {
    private int hello;
    private int world;
    private String goodbye;


    public int getHello() {
        return hello;
    }


    public void setHello(int hello) {
        this.hello = hello;
    }


    public int getWorld() {
        return world;
    }


    public void setWorld(int world) {
        this.world = world;
    }


    public String getGoodbye() {
        return goodbye;
    }


    public void setGoodbye(String goodbye) {
        this.goodbye = goodbye;
    }


    public static void main(String[] args) {
        // AND - all conditions must be true
        int age = 20;
        boolean isFelon = false;

        if ((age >= 18 && age >= 35) && !isFelon) {
            System.out.println("You can run for presidency and vote!");
        }

        // OR - at least 1 condition must be true
        // NB: Java doesn't check all conditions in an or if one is true already

        age = 15;
        if (age < 35 || (isFelon || age > 101)) {
            System.out.println("This person is not eligible for presidency.");
        }

        if (age > 18 || isFelon) {
            System.out.println("print me");
        }

        // READABILITY IS IMPORTANT

        boolean isRegistered = true;
        boolean isCitizen = true;
        String country = "USA";

        if (isRegistered) {
            if (age >= 18) {
                if (isCitizen && !isFelon) {
                    if (country.equals("USA")) {
                        System.out.println("You can vote!");
                    }
                }
            }
        }

        // Guarding if statements (Gates)
        if (!isRegistered) {
            return;
        }
        if (age < 18) {
            return;
        }
        if (!isCitizen) {
            return;
        }
        if (isFelon) {
            return;
        }
        if (!country.equals("USA")) {
            return;
        }
        System.out.println("You can vote!");
    }

}
