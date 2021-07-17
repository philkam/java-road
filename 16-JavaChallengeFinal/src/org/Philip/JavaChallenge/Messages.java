package org.Philip.JavaChallenge;

public class Messages {
    private  String message;
    private  String recipient;
    private  int id;

    public Messages(String message, String recipient, int id) {
        this.message = message;
        this.recipient = recipient;
        this.id = id;
    }

    public void getDetails(){
        System.out.println("Recipient: " + this.recipient+
                "\nMessage: " +this.message+
                "\nID: "+this.id);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
