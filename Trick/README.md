## Trick 

### Java8 Optional 判空

比If Else更优雅
```java
public static String getUniversityWithOptional(University university){
        return Optional.ofNullable(university).map(University::getCollege).map(College::getDepartment).map(Department::getName).orElse(null);
    }
```
[完整代码](./src/main/java/RemoveIfElseNPE.java)


### Java8比较Map和List里面对象元素是否一样

