package bai_2;

class ExtendedBorrow implements Borrowable {
    private Borrowable base;
    public ExtendedBorrow(Borrowable base) {
        this.base = base;
    }
    public void borrow() {
        base.borrow();
        System.out.println("Extended borrow time to 30 days.");
    }
}