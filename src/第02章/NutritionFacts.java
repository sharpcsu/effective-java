package 第02章;

/**
 * Create by @author BG331145 杨威 on 2019/2/15 0015 - 16:23
 */
public class NutritionFacts {
    private final int a1;
    private final int a2;
    private final int a3;
    private final int a4;
    private final int a5;
    private final int a6;
    
    public static class Builder {
        //必须的参数
        private final int a1;
        private final int a2;
        
        //可选参数
        private int a3 = 0;
        private int a4 = 0;
        private int a5 = 0;
        private int a6 = 0;
        
        public Builder(int a1, int a2) {
            this.a1 = a1;
            this.a2 = a2;
        }
        
        public Builder addA3(int val) {
            a3 = val;
            return this;
        }
        
        public Builder addA4(int val) {
            a4 = val;
            return this;
        }
        
        public Builder addA5(int val) {
            a5 = val;
            return this;
        }
        
        public Builder addA6(int val) {
            a6 = val;
            return this;
        }
        
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
        
    }
    
    private NutritionFacts(Builder builder) {
        a1 = builder.a1;
        a2 = builder.a2;
        a3 = builder.a3;
        a4 = builder.a4;
        a5 = builder.a5;
        a6 = builder.a6;
    }
}
