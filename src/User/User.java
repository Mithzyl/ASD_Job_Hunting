package User;

public class User<T> {

    private String userName;

    private String password;

    private Boolean status;

    private String email;

    private T paymentModel;

    public User() {
    }

    public User(String userName, String password, Boolean status, String email, T paymentModel) {
        this.userName = userName;
        this.password = password;
        this.status = status;
        this.email = email;
        this.paymentModel = paymentModel;
    }

    public String writeReview() {
        return null;
    }

    // TODO: review parameter
    public String updateReview(){
        return null;
    }

    public String updateProfile(){
        return null;
    }

    // Getters and setters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public T getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(T paymentModel) {
        this.paymentModel = paymentModel;
    }


}
