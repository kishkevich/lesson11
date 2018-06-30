import generator.Generate;

import java.util.Date;

public class Patient {
    @Generate
    private String name;
    @Generate
    private Date dateOfBirth;
    @Generate
    private boolean health;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", date of birth=" + dateOfBirth +
                ", health=" + health +
                '}';
    }
}
