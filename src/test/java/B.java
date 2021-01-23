public class B extends A {

    private boolean sex;

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public void sayA() {
        System.out.println("sayA from B");
        // super.sayA();
    }

    public void sayB() {
        System.out.println("sayB");
    }

    @Override
    public String toString() {
        return "B [name=" + this.getName() + ", sex=" + sex + "]";
    }
}