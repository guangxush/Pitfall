import java.util.Optional;

/**
 * @author: guangxush
 * @create: 2020/05/24
 */
public class RemoveIfElseNPE {

    private static final University UNIVERSITY_1 =  new University(new College(new Department("Tongji CS")));
    private static final University UNIVERSITY_2 =  new University(new College(null));
    private static final University UNIVERSITY_3 =  new University(null);
    private static final University UNIVERSITY_4 =  null;


    public static void main(String[] args) {
        System.out.println("Java8 Optional");
        System.out.println(getUniversityWithOptional(UNIVERSITY_1));
        System.out.println(getUniversityWithOptional(UNIVERSITY_2));
        System.out.println(getUniversityWithOptional(UNIVERSITY_3));
        System.out.println(getUniversityWithOptional(UNIVERSITY_4));
        System.out.println("Java If Else");
        System.out.println(getUniversityWithIfElse(UNIVERSITY_1));
        System.out.println(getUniversityWithIfElse(UNIVERSITY_2));
        System.out.println(getUniversityWithIfElse(UNIVERSITY_3));
        System.out.println(getUniversityWithIfElse(UNIVERSITY_4));
    }

    public static String getUniversityWithOptional(University university){
        return Optional.ofNullable(university).map(University::getCollege).map(College::getDepartment).map(Department::getName).orElse(null);
    }

    public static String getUniversityWithIfElse(University university){
        if(university == null){
            return null;
        }
        if(university.getCollege() == null){
            return null;
        }
        if(university.getCollege().getDepartment()==null){
            return null;
        }
        if(university.getCollege().getDepartment().getName()==null){
            return null;
        }
        return university.getCollege().getDepartment().getName();
    }
}

/**
 * 大学
 */
class University {
    private College college;

    public University(College college) {
        this.college = college;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
}

/**
 * 学院
 */
class College {
    private Department department;

    public College(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

/**
 * 系
 */
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
