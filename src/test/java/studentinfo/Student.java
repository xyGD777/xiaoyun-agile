package studentinfo;

class Student {
    private String name;
    Student(String name){
        this.name = name;//消除歧义的方法是：成员变量和参数使用相同的名字，但是在必要的地方用关键字this来调用成员变量


    }
    String getName(){
        return name;
    }

}
