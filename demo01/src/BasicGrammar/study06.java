package BasicGrammar;

import jdk.nashorn.internal.ir.CallNode;

public class study06 {
    /**
     * 常用类之String,StringBuffer,StringBulider
     * String是一个特使的类，底层是字符数组char[]，String类型表示字符串
     * 可以通过关键字赋值，也可以通过构造器创建对象
     * String是不可变字符串，一经创建，值会在常量池中，修改字符串内容，实际是创建新的字符串，并入变量指向新的地址
     * String类型重写了equals()方法，变成比较字符串的内容是否一致，
     * ==比较的是对象的地址值，为重写的equals()方法底层还是==
     *
     * StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。
     * 三者区别：
     * String 不可变字符序列
     * StringBuffer 线程安全的可变字符串序列
     * StringBuilder 线程不安全的可变字符串序列
     *效率：
     * StringBuilder > StringBuffer >String
     * 不考虑安全问题时，多数情况下建议使用 StringBuilder 类
     */
    public static void main(String[] args) {
        String str = new String("huzhibin"); //在堆空间中
        String str2 = "huzhibin"; //直接赋值方式，字符串对象在常量池中
        String str3 =str2;//不创建新的字符串，常量池中，仅有一份”huzhibin“
        String str4 = "huzhi"+"bin"; //和str2一样属于直接赋值方式
        String str5 = str2+"bin";//属于new方式，对象在堆空间中

//        String类型重写了equals()方法，变成比较字符串的内容是否一致，
        boolean result1 = str2.equals(str);
//        ==比较的是对象的地址值
        boolean result2 = str2==str;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(str2==str3);//都指向的是常量池的字符串
        System.out.println(str2==str4);
        /**
         * 常用方法
         */
//        str.length()字符串长度
        System.out.println(str.length());
//        a.concat(b) 相当与字符串的a+b
        System.out.println(str.concat(str2));
        /*
        1	char charAt(int index)
        返回指定索引处的 char 值。
        2	int compareTo(Object o)
        把这个字符串和另一个对象比较。
        3	int compareTo(String anotherString)
        按字典顺序比较两个字符串。
        4	int compareToIgnoreCase(String str)
        按字典顺序比较两个字符串，不考虑大小写。
        5	String concat(String str)
        将指定字符串连接到此字符串的结尾。
        6	boolean contentEquals(StringBuffer sb)
        当且仅当字符串与指定的StringBuffer有相同顺序的字符时候返回真。
        7	static String copyValueOf(char[] data)
        返回指定数组中表示该字符序列的 String。
        8	static String copyValueOf(char[] data, int offset, int count)
        返回指定数组中表示该字符序列的 String。
        9	boolean endsWith(String suffix)
        测试此字符串是否以指定的后缀结束。
        10	boolean equals(Object anObject)
        将此字符串与指定的对象比较。
        11	boolean equalsIgnoreCase(String anotherString)
        将此 String 与另一个 String 比较，不考虑大小写。
        12	byte[] getBytes()
         使用平台的默认字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        13	byte[] getBytes(String charsetName)
        使用指定的字符集将此 String 编码为 byte 序列，并将结果存储到一个新的 byte 数组中。
        14	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        将字符从此字符串复制到目标字符数组。
        15	int hashCode()
        返回此字符串的哈希码。
        16	int indexOf(int ch)
        返回指定字符在此字符串中第一次出现处的索引。
        17	int indexOf(int ch, int fromIndex)
        返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
        18	int indexOf(String str)
         返回指定子字符串在此字符串中第一次出现处的索引。
        19	int indexOf(String str, int fromIndex)
        返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始。
        20	String intern()
         返回字符串对象的规范化表示形式。
        21	int lastIndexOf(int ch)
         返回指定字符在此字符串中最后一次出现处的索引。
        22	int lastIndexOf(int ch, int fromIndex)
        返回指定字符在此字符串中最后一次出现处的索引，从指定的索引处开始进行反向搜索。
        23	int lastIndexOf(String str)
        返回指定子字符串在此字符串中最右边出现处的索引。
        24	int lastIndexOf(String str, int fromIndex)
         返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。
        25	int length()
        返回此字符串的长度。
        26	boolean matches(String regex)
        告知此字符串是否匹配给定的正则表达式。
        27	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)
        测试两个字符串区域是否相等。
        28	boolean regionMatches(int toffset, String other, int ooffset, int len)
        测试两个字符串区域是否相等。
        29	String replace(char oldChar, char newChar)
        返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。
        30	String replaceAll(String regex, String replacement)
        使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
        31	String replaceFirst(String regex, String replacement)
         使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
        32	String[] split(String regex)
        根据给定正则表达式的匹配拆分此字符串。
        33	String[] split(String regex, int limit)
        根据匹配给定的正则表达式来拆分此字符串。
        34	boolean startsWith(String prefix)
        测试此字符串是否以指定的前缀开始。
        35	boolean startsWith(String prefix, int toffset)
        测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
        36	CharSequence subSequence(int beginIndex, int endIndex)
         返回一个新的字符序列，它是此序列的一个子序列。
        37	String substring(int beginIndex)
        返回一个新的字符串，它是此字符串的一个子字符串。
        38	String substring(int beginIndex, int endIndex)
        返回一个新字符串，它是此字符串的一个子字符串。
        39	char[] toCharArray()
        将此字符串转换为一个新的字符数组。
        40	String toLowerCase()
        使用默认语言环境的规则将此 String 中的所有字符都转换为小写。
        41	String toLowerCase(Locale locale)
         使用给定 Locale 的规则将此 String 中的所有字符都转换为小写。
        42	String toString()
         返回此对象本身（它已经是一个字符串！）。
        43	String toUpperCase()
        使用默认语言环境的规则将此 String 中的所有字符都转换为大写。
        44	String toUpperCase(Locale locale)
        使用给定 Locale 的规则将此 String 中的所有字符都转换为大写。
        45	String trim()
        返回字符串的副本，忽略前导空白和尾部空白。
        46	static String valueOf(primitive data type x)
        返回给定data type类型x参数的字符串表示形式。
        47	contains(CharSequence chars)
        判断是否包含指定的字符系列。
        48	isEmpty()
        判断字符串是否为空
         */

//#####################StringBuilder
        StringBuilder stringBuilder = new StringBuilder(10);
//        末尾添加方法
        stringBuilder.append("huzhibin");
        System.out.println(stringBuilder);
        stringBuilder.append("!!!");
        System.out.println(stringBuilder);
        //insert 插入
        stringBuilder.insert(2,"000");
        System.out.println(stringBuilder);
        //delete删除,索引位置2开始，删除到索引3位置，左闭右开，并且后续的字符向前移动3个字符，前后拼接
        stringBuilder.delete(2,5);
        System.out.println(stringBuilder);
        //反转序列
        System.out.println(stringBuilder.reverse());
//        替换
        System.out.println(stringBuilder.replace(0,3,"111"));

    }
}
