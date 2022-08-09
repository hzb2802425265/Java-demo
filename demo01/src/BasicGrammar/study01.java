package BasicGrammar;

public class study01 {
    /**
     * 练习基础语法之基本数据类型
     * byte、int、long、和short都可以用十进制、16进制以及8进制的方式来表示。
     * 当使用字面量的时候，前缀 0 表示 8 进制，而前缀 0x 代表 16 进制.
     * 自动类型转换有低到高
     * byte,short,char—> int —> long—> float —> double
     * 反过来则需要强制类型转换（int）LongNumber,这种转换可能会丢失精度
     * 默认整数的类型时int，小数时double，因此在定义float时需要在末尾加f,例如：0.5是double,0.5f是float
     */
    public static void main(String[] args) {
        System.out.println("基本类型：byte 二进制位数："+ Byte.SIZE);
        System.out.println("包装类：java.long.Byte");
        System.out.println("max:"+Byte.MAX_VALUE);
        System.out.println("min"+Byte.MIN_VALUE);
        System.out.println("----------------------");
        System.out.println("基本类型：short 二进制位数："+ Short.SIZE);
        System.out.println("包装类：java.long.Short");
        System.out.println("max:"+Short.MAX_VALUE);
        System.out.println("min"+Short.MIN_VALUE);
        System.out.println("----------------------");
        System.out.println("基本类型：int 二进制位数："+ Integer.SIZE);
        System.out.println("包装类：java.long.Integer");
        System.out.println("max:"+Integer.MAX_VALUE);
        System.out.println("min"+Integer.MIN_VALUE);
        System.out.println("----------------------");
        System.out.println("基本类型：long 二进制位数："+ Long.SIZE);
        System.out.println("包装类：java.long.Long");
        System.out.println("max:"+Long.MAX_VALUE);
        System.out.println("min"+Long.MIN_VALUE);
        System.out.println("----------------------");
        System.out.println("基本类型：float 二进制位数："+ Float.SIZE);
        System.out.println("包装类：java.long.Float");
        System.out.println("max:"+Float.MAX_VALUE);
        System.out.println("min"+Float.MIN_VALUE);
        System.out.println("----------------------");
        System.out.println("基本类型：double 二进制位数："+ Double.SIZE);
        System.out.println("包装类：java.long.Double");
        System.out.println("max:"+Double.MAX_VALUE);
        System.out.println("min"+Double.MIN_VALUE);
        System.out.println("----------------------");
        System.out.println("基本类型：char 二进制位数："+ Character.SIZE);
        System.out.println("包装类：java.long.Character");
        System.out.println("max:"+(int)Character.MAX_VALUE);
        System.out.println("min"+(int)Character.MIN_VALUE);




    }

}
