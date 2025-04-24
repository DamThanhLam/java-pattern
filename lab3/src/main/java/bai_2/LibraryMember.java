package bai_2;

class LibraryMember implements Observer {
    private String name;
    public LibraryMember(String name) {
        this.name = name;
    }
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}