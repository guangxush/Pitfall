import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: guangxush
 * @create: 2020/07/05
 */
public class CompareLists {
    public static void main(String[] args) {
        Head head1 = new Head("noses", "eyes", "mouse");
        Person person1 = new Person(head1, "body", "feet", "hands");
        Head head2 = new Head("noses", "eyes", "mouse");
        Person person2 = new Person(head2, "body", "feet", "hands");
        Head head3 = new Head("noses", "eyes", "mouse");
        Person person3 = new Person(head3, "body", "feet", "hands");
        Head head4 = new Head("noses", "eyes", "mouse");
        Person person4 = new Person(head4, "body", "feet", "hands");
        Work work1 = new Work(Arrays.asList(new Person[]{person1, person2}), "Baidu");
        Work work2 = new Work(Arrays.asList(new Person[]{person3, person4}), "Tencent");

        Head head5 = new Head("noses", "eyes", "mouse");
        Person person5 = new Person(head5, "body", "feet", "hands");
        Head head6 = new Head("noses", "eyes", "mouse");
        Person person6 = new Person(head6, "body", "feet", "hands");
        Head head7 = new Head("noses", "eyes", "mouse");
        Person person7 = new Person(head7, "body", "feet", "hands");
        Head head8 = new Head("noses", "eyes", "mouse");
        Person person8 = new Person(head8, "body", "feet", "hands");
        Work work3 = new Work(Arrays.asList(new Person[]{person5, person6}), "Alibaba");
        Work work4 = new Work(Arrays.asList(new Person[]{person7, person8}), "ByteDance");
    }

    public <T> CompareLists(List<T> source, List<T> target){

    }
}

class Work {
    public Work(List<Person> personList, String name) {
        this.personList = personList;
        this.name = name;
    }

    private List<Person> personList;
    private String name;
}

class Person {
    public Person(Head head, String body, String foot, String hand) {
        this.head = head;
        this.body = body;
        this.foot = foot;
        this.hand = hand;
    }

    private Head head;
    private String body;
    private String foot;
    private String hand;
}

class Head {
    public Head(String nose, String eye, String mouse) {
        this.nose = nose;
        this.eye = eye;
        this.mouse = mouse;
    }

    private String nose;
    private String eye;
    private String mouse;
}