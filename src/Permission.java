

public class Permission implements Comparable<Permission>{

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Permission{" + "name='" + name + '\'' + '}';
    }


    @Override
    public int compareTo(Permission o) {
        return name.compareTo(o.getName());
    }
}
