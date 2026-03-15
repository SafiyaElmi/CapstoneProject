package za.ac.cput.domain;

public class Admin {

    private final String id;
    private final String role;

    public Admin() {
        this.id = "";
        this.role = "";
    }

    private Admin(Builder builder) {
        this.id = builder.id;
        this.role = builder.role;
    }

    public String getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public boolean login() {

        return true;
    }

    public void viewStudents() {

    }

    public void viewTutors() {

    }

    public void viewSubjects() {

    }


    public static class Builder {

        private String id;
        private String role;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id='" + id + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}