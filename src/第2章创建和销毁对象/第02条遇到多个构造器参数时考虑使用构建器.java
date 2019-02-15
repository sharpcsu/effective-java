package 第2章创建和销毁对象;

import 第02章.NutritionFacts;

/**
 * Create by @author BG331145 杨威 on 2019/2/15 0015 - 16:01
 */
public class 第02条遇到多个构造器参数时考虑使用构建器 {
    public static void main(String[] args) {
        NutritionFacts nutrition = new NutritionFacts.Builder(1, 2)
                .addA3(3)
                .addA4(4)
                .addA5(5)
                .addA6(6)
                .build();
    }
}

