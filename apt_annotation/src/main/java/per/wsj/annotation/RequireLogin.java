package per.wsj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// 目标页面注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface RequireLogin {
    // 需要登录的Activity加上该注解
}
