public class SkillDemo {

    public static int expand(int current, int minimum, int required) {
        if(current < minimum) {
            current = current * 2;
        }
        else if(current < required) {
            current = required;
        }

        return current;
    }
}
