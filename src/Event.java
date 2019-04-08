import java.util.Objects;

public class Event {

    private int id;
    private String name;
    private Location location;

    public Event(){}

    public Event(int id, String name, Location location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Event id(int id) {
        this.id = id;
        return this;
    }

    public Event name(String name) {
        this.name = name;
        return this;
    }

    public Event location(Location location) {
        this.location = location;
        return this;
    }

    Event build(){
        Event l = new Event();
        l.id = this.id;
        l.name = this.name;
        l.location = this.location;
        return l;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id &&
                Objects.equals(name, event.name) &&
                Objects.equals(location, event.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location);
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                "}\n";
    }
}
