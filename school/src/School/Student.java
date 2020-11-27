package School;

class Student {
    private String name;
    private int id;
    private String gender;
    private int age;
    private String major;

    public Student(String name, int id, int age, String gender, String major){
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.major = major;

    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}
