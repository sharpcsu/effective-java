package 第02章;

import java.util.EnumSet;
import java.util.Set;

/**
 * Create by @author BG331145 杨威 on 2019/2/15 0015 - 16:57
 */
public abstract class Pizza {
    public enum Topping {
        HAM, MUSHROOM, ONION
    }
    
    final Set<Topping> toppings;
    
    abstract static class Builder<T extends Builder<T>> {
        EnumSet.noneOf(Topping .class)
        
    }
}
