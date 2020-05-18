package competitors;

public class Human implements Competitor {
    private String name;

    private int maxRunDistance;
    private int maxJumpHeight;

    private boolean onDistance;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Human(String name) {
        this (name, 3000, 2);
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
