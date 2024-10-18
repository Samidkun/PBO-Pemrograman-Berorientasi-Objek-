class Customer extends User {
    private boolean verificationStatus;

    public Customer(UserProfile userProfile) {
        super(userProfile);
        this.verificationStatus = false;
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public String applyVerification(String doc) {
        if (doc.equals("jpg") || doc.equals("png") || doc.equals("pdf")) {
            this.verificationStatus = true;
            return "Verification applied";
        } else {
            return "Invalid document format";
        }
    }
}
