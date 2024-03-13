package Enum;

import com.sun.xml.internal.bind.api.impl.NameConverter;

public class StudentEnum {
    private String name;
    private Integer age;
    private Standard standard;

    public StudentEnum(String name, Integer age, Standard standard) {
        this.name = name;
        this.age = age;
        this.standard = standard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Standard getStandard() {
        return standard;
    }

    public void setStandard(Standard standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "StudentEnum{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", standard=" + standard +
                '}';
    }
}
