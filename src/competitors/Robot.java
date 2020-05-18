package competitors;

public class Robot implements Competitor {
    private String model;

    private int maxRunDistance;
    private int maxJumpHeight;

    private boolean onDistance;


    public Robot(String model, int maxRunDistance, int maxJumpHeight) {
        this.model = model;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }



    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance){
            System.out.println(model + " пробежал " + dist + " метров!");
        }else {
            System.out.println(model + " не смог пробежать " + dist + " метров!\nВыбывает из соревнований!");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight){
            System.out.println(model + " сумел перепрыгнуть стену высотой " + height + " метров!");
        }else {
            System.out.println(model + " не смог перепрыгнуть стену высотой " + height + " метров");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(model + " " +
                (onDistance ? " на дистанции" : " выбыл из соревнований"));
    }
}
