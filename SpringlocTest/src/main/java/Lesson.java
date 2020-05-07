public class Lesson {
    int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public void printLesson(){
        System.out.println(name);
    }
}
