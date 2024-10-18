class User {
    protected UserProfile userProfile;

    public User(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public String logIn(int userId, int password) {
        if (userProfile.getUserId() == userId && userProfile.getPassword() == password) {
            return "Logged in successfully";
        } else {
            return "Invalid credentials";
        }
    }

    public String recoverPassword() {
        return "Password recovery process initiated";
    }

    public String logOut() {
        return "Logged out successfully";
    }
}