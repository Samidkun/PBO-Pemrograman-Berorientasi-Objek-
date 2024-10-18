class Admin extends User {
    public Admin(UserProfile userProfile) {
        super(userProfile);
    }

    public String updateVehicleDetails(int vehicleId) {
        return "Vehicle details for " + vehicleId + " updated";
    }

    public String addVehicle() {
        return "Vehicle added";
    }

    public String retrieveComplain() {
        return "Complaint retrieved";
    }

    public String verifyUser() {
        return "User verified";
    }
}