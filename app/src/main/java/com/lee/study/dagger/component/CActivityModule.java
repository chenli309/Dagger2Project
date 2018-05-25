package com.lee.study.dagger.component;

import com.lee.study.dagger.bean.C1Bean;
import com.lee.study.dagger.bean.C2Bean;

import dagger.Module;
import dagger.Provides;

@Module
public class CActivityModule {

    // 方式一：在一个方法内new一个C2Bean出来作为C1Bean的参数
//    @Provides
//    C1Bean provideC1Bean() {
//        C2Bean c2Bean = new C2Bean();
//        return new C1Bean(c2Bean);
//    }

    /*
    方式二：

    1. 把C2Bean拆分出去，通过提供另一个provideC2Bean()构建方法，构建一个C2Bean对象
    2. dagger在CActivity中注入C1Bean的时候，会到该Module中找有没有添加了@Provides注解，提供构建C2Bean对象的方法
    3. 有添加了@Provides注解，提供构建C2Bean对象的方法，拿到这个创建好的C2Bean做为参数传给provideC1Bean(C2Bean c2Bean)
    4. 没有添加了@Provides注解，提供构建C2Bean对象的方法，会继续到C2Bean类中，看C2Bean的构造方法，有没有被@Inject标注
     */

    @Provides
    C1Bean provideC1Bean(C2Bean c2Bean) {
        return new C1Bean(c2Bean);
    }

     /*
    接上面的方式二：

    可以把这个方法注释掉，然后在C2Bean的构造方法上添加@Inject标注，验证一下上面的第四点
     */
    @Provides
    C2Bean provideC2Bean() {
        return new C2Bean();
    }
}
