package lession6;

public class Teacher extends Person {
    private String subject;

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void setPhone(String phone) {
        if (phone.length() != 10) {
            System.out.println("Invalid phone number");
        }
        super.setPhone(phone);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                '}';
    }
}
