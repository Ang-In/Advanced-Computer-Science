public class Assignment {
    private String title;
    private String description;
    private int descriptionLength;

    public Assignment(String title, String description) {
        // Students: add your own validation and exceptions as you see fit
        requireNotBlank(title, "Title");
        setTitle(title);

        setDescription(description);
    }

    private static void requireNotBlank(String s, String field) {
        if (s == null) {
            throw new IllegalArgumentException(field + " is null.");
        }
        if (s.trim().isEmpty()) {
            throw new IllegalArgumentException(field + " is blank.");
        }
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
        this.descriptionLength = (description == null) ? 0 : description.length();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDescriptionLength() {
        return descriptionLength;
    }
}
