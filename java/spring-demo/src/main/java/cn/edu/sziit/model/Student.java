package cn.edu.sziit.model;

public class Student {
    private String name;
    private String no;
    private  int score;

    public Student(){
    }

    public Student(String name, String no, int score) {
        this.name = name;
        this.no = no;
        this.score = score;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getNo() { return no; }
    public void setNo(String no) { this.no = no; }
    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", no='" + no + '\'' +
                ", score=" + score +
                '}';
    }
}
