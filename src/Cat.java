public class Cat extends Animal implements Printable {
    private boolean lovitMishey;

    public boolean isLovitMishey() {
        return lovitMishey;
    }

    public void setLovitMishey(boolean lovitMishey) {
        this.lovitMishey = lovitMishey;
    }

    public Cat(int age, boolean lovitMishey) {
        super(age);
        this.lovitMishey = lovitMishey;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( "cat age " + this.getAge() + " lovit mishey " + this.isLovitMishey());
    }
}
