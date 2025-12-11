public class BobaShop {
    // instance variables
    String shopName;
    BobaShopMember[] registeredMembers;

    // constructors
    public BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    public BobaShop(String shopName, int initialCapacity) {
        this.shopName = shopName;
        this.registeredMembers = new BobaShopMember[initialCapacity];
    }

    // getters
    public String getShopName() {
        return shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    // setters
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    // inherited methods
    public String toString() {
        String header = "";
        String body = "";
        if (shopName == null) {
            header = "== null Members ==\n";
        } else {
            header = "== " + shopName + " Members ==\n";
        }

        if (!(registeredMembers == null)) {
            for (int i = 0; i < registeredMembers.length; i++) {
                if (registeredMembers[i] == null) {
                    break;
                }

                body += (i + 1) + ".) " + registeredMembers[i].toString();

                if (i < registeredMembers.length - 1) {
                    body += "\n";
                }
            }
        }

        return header + body;
    }

    // methods
    public boolean isFull() {
        if (registeredMembers == null) {
            return false; // to-do: change depending on tester
        }

        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        if (!(registeredMembers == null)) {
            BobaShopMember[] increasedMembers = new BobaShopMember[registeredMembers.length * 2];
            for (int i = 0; i < registeredMembers.length; i++) {
                increasedMembers[i] = registeredMembers[i];
            }
            setRegisteredMembers(increasedMembers);
        }
    }

    public void registerMember(BobaShopMember member) {
        if (!(registeredMembers == null)) {
            if (isFull()) {
                increaseCapacity();
            }
            for (int i = 0; i < registeredMembers.length; i++) {
                if (registeredMembers[i] == null) {
                    registeredMembers[i] = member;
                    break;
                }
            }
        }
    }

    public boolean deleteMember(BobaShopMember member) {
        if (!(registeredMembers == null)) {
            for (int i = 0; i < registeredMembers.length; i++) {
                if (registeredMembers[i] == member) {
                    registeredMembers[i] = null;
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
