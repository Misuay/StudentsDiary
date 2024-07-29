public class Method01 {
    public static void main (String[] args){
//  方法使用：
//        1.方法写好后，如果不去调用，则不会输出
//        2.先创建一个对象，然后调用其方法即可
        Person p1 = new Person();
        p1.speak();//调用speak方法
        p1.cal01();//调用cal01方法
        p1.cal02(1000);//调用cal02方法，同时传入1000=cal02方法的max值
        p1.cal02(5);//调用cal02方法，同时传入5=cal02方法的max值，一个对象可以调用多次方法
        int returnRes = p1.getSum(10,20);//调用getSum方法，同时把num1赋了10，num2赋了20，把getSum方法返回的值赋给 returnRes
        System.out.println("getSum方法放回的值="+ returnRes);
    }
}
    class Person{
        String name;
        int age;
//        public 表示方法是公开的
//        void 表示方法没有返回值
//        speak() ：speak 表示方法名，（）形参列表
//        {}方法体，写我们要执行的代码
        public void speak(){
            System.out.println("我是一个好人");
        }
//        计算1+.....1000的结果
        public void cal01(){
            int res = 0;
            for(int i = 1; i <= 1000; i++){
                res += i;
            }
            System.out.println("cal01计算结果="+res);
        }
//        计算1+......n的结果
//        1.(int max)形参列表，表示当前有一个形参n，可以接收用户输入
        public void cal02(int max){
            int res1 = 0;
            for(int i = 1;i <= max;i++){
                res1 += i;
            }
            System.out.println("cal02计算结果=" +res1);
        }
//        添加getsum方法，可以计算两个数的和
//        1.public 表示方法是公开的
//        2.int 表示方法执行后，返回一个int值
//        3.getSum 方法名
//        4.(int num1,int num2)形参列表，2个形参，可以接收用户传入的两个数
//        5.return res;表示把res的值返回
        public int getSum(int num1,int num2){
            int res = num1 + num2;
            return res;

        }
    }
