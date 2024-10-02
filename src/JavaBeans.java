import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setName("Luis");
        persona.setLastname("Alvarez");
        System.out.println(persona);
        System.out.println(persona.getName());
        System.out.println(persona.getLastname());
    }
}

// a JavaBean is a class that must have some characteristics
// it must have an empty constructor but can have more thant one
// It must apply encapsulation, private attributes, setters and getters to access them
// It must implement the interface serializable
class Persona implements Serializable {

    private String name;
    private String lastname;

    public Persona(){}

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
