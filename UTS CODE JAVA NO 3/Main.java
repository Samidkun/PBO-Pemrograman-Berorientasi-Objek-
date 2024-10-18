 public class Main {
    public static void main(String[] args) {
        // Create a UserProfile
        UserProfile profile1 = new UserProfile(1, 1234, "Samid Jago", 69, "SamidJago@example.com", "document.pdf");

        // Create a Customer with the UserProfile
        Customer customer1 = new Customer(profile1);

        // Log in as the customer
        System.out.println(customer1.logIn(1, 1234));

        // Apply for verification
        System.out.println(customer1.applyVerification("pdf"));
        System.out.println("Verification status: " + customer1.getVerificationStatus());

        // Create an Admin with the UserProfile
        Admin admin1 = new Admin(profile1);

        // Perform admin actions
        System.out.println(admin1.updateVehicleDetails(101));
        System.out.println(admin1.addVehicle());
        System.out.println(admin1.retrieveComplain());
        System.out.println(admin1.verifyUser());

        // Log out
        System.out.println(customer1.logOut());
    }
}
