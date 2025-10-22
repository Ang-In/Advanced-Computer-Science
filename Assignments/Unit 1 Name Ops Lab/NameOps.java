public class NameOps {

    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return -1;
        }
        String split = name.substring(indexOfFirstSpace(name) + 1);
        int splitSpaceIndex = split.indexOf(" ");
        if (splitSpaceIndex == -1) {
            return -1;
        } else {
            return indexOfFirstSpace(name) + splitSpaceIndex + 1;
        }
    }

    public static String findFirstName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return name;
        }
        return name.substring(0, indexOfFirstSpace(name));
    }

    public static String findLastName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return "";
        }

        if (indexOfSecondSpace(name) == -1) {
            return name.substring(indexOfFirstSpace(name) + 1);
        }

        return name.substring(indexOfSecondSpace(name) + 1);
    }

    public static String findMiddleName(String name) {
        if (indexOfFirstSpace(name) == -1) {
            return "";
        }

        if (indexOfSecondSpace(name) == -1) {
            return "";
        }

        return name.substring(indexOfFirstSpace(name) + 1, indexOfSecondSpace(name) + 1);
    }

    public static String generateLastFirstMidInitial(String name) {
        if (findLastName(name).equals("")) {
            return findFirstName(name);
        } else if (findMiddleName(name).equals("")) {
            return findLastName(name) + ", " + findFirstName(name);
        } else {
            return findLastName(name) + ", " + findFirstName(name) + " "
                    + findMiddleName(name).charAt(0) + ".";
        }
    }

}
