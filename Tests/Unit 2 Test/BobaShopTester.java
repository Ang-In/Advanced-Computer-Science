public class BobaShopTester {
    public static void main(String[] args) {
        BobaShopMember member1 = new BobaShopMember("Ana");
        BobaShopMember member2 = new BobaShopMember("Bob");
        BobaShopMember nullMember = new BobaShopMember(null);
        BobaShopMember[] memberList = {member1, nullMember};

        BobaShop shop1 = new BobaShop("Best Boba", memberList);
        BobaShop shop2 = new BobaShop("Bobaholic", 2);
        BobaShop nullShop = new BobaShop(null, null);

        // Testing getters & setters
        System.out.println("== Testing getters and setters ==");
        nullMember.setName(null);
        nullMember.setLoyaltyCredits(null);
        System.out.println("nullMember's name: " + nullMember.getName());
        System.out.println("nullMember's loyaltyCredits: " + nullMember.getLoyaltyCredits());
        // both should be null
        System.out.println("");

        // Testing toString()
        System.out.println("== Testing toString() ==");
        System.out.println("shop1's toString: " + shop1.toString());
        // should print:
        // == Best Boba Members ==
        // 1.) Ana (Plus Member), Loyalty History: [-, -, -, -, -, -, -, -, -, -]
        // 2.) null (Plus Member), Loyalty History: []
        System.out.println("nullShop's toString: " + nullShop.toString());
        // should print: == null Members ==
        System.out.println("");

        // Testing registerMembers() & increaseCapacity()
        System.out.println("== Testing registerMembers() ==");
        shop1.registerMember(member2);
        System.out.println("shop1 with a new member:" + shop1.toString());
        // should print:
        // == Best Boba Members ==
        // 1.) Ana (Plus Member), Loyalty History: [-, -, -, -, -, -, -, -, -, -]
        // 2.) null (Plus Member), Loyalty History: []
        // 3.) Bob (Plus Member), Loyalty History: [-, -, -, -, -, -, -, -, -, -]
        // increaseCapacity was used to allow for 3 members
        System.out.println("");

        // Testing equals()
        BobaShopMember member1dupe = new BobaShopMember("Ana");
        System.out.println("member1 equal to member1dupe: " + member1.equals(member1dupe));
        // should be true
        System.out.println("member1 equal to nullMember: " + member1.equals(nullMember));
        // should be false
    }
}
