class UserProfile {
    private int userId;
    private int password;
    private String name;
    private int age;
    private String emailId;
    private String doc;

    public UserProfile(int userId, int password, String name, int age, String emailId, String doc) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = doc;
    }

    public int getUserId() {
        return userId;
    }

    public int getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public String showDocuments() {
        return doc;
    }
}
