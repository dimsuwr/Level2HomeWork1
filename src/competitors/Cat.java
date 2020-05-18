package competitors;

public class Cat implements Competitor {

    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;

    private boolean onDistance;

    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Cat(String name) {
        this (name, 300, 5);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance){
            System.out.println(name + " пробежал " + dist + " метров!");
        }else {
            System.out.println(name + " не смог пробежать " + dist + " метров!\nВыбывает из соревнований!");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.println(name + " сумел перепрыгнуть стену высотой " + height + " метров!");
        }else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " метров");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(name + " " +
                (onDistance ? " на дистанции" : " выбыл из соревнований"));
    }
}
