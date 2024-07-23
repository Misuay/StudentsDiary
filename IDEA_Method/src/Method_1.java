public class Method01 {
    public static void main(String[] args){
//        方法使用
//        1. 方法写好后，如果不去调用，不会输出
//        2. 先创建一个对象，然后调用方法即可
        Person p1 = new Person();
        p1.speak();//调用方法，代码执行到这以后会去Person类赵speak方法
        p1.cal01();//调用01方法，
    }
}
class Person{
    String name = "王浩";
    int age  = 18;
    //        解读：
//        1. public 表示方法是公开的w
//        2. void 表示方法没有返回值
//        3. speak();speak 是方法名 ,()形参列表
//        4. {}方法体，可以写我们要执行的代码
//        5. System.out.println("");表示我们的方法就是输出一句话
    public void speak(){
        System.out.println("我是一个好人");
    }
    public void cal01(){
        //循环完成
        int res = 0;
        for (int i = 1 ; i<=1000 ; i++){
            res += i ;
        }
        System.out.println("计算结果 = " + res);
    }
}11111
223232

