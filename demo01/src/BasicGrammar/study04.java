package BasicGrammar;

public class study04 {
    /**
     * 常用类之Number和Math
     * Number类是所有基本数据类型的包装类的父类
     * 包装类和基本数据类型之间的转换，称之为 装箱，拆箱
     *
     * Math类，是包含了一些属性运输的属性和方法的类,
     * 二者常用方法
     * xxxValue() 将Number对象转换位xxx数据类型的值并返回
     * valueOf() 给Number对象指定内置数据类型
     * toString()字符串形式返回
     * parseInt,将字符串解析位Int类型
     *
     * abs() 绝对值
     * ceil()
     * floor()
     * rint()
     * round()
     * min()max()log()sin()...
     * sqrt() 算术平方根
     * pow（）返回第一个参数的第二参数次方
     * random（）返回一个随机数
     * 三个取整规则函数
     * floor() round()  ceil()
     * 偏小     四舍五入   偏大
     */
    public static void main(String[] args) {
        Integer a = 10;

        System.out.println(a.floatValue());
    }
}
