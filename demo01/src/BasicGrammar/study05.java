package BasicGrammar;

public class study05 {
    /**
     * 常用类之Character
     * 是char类型的包装类
     * char ->Character 自动装箱
     * Character -> char 自动拆箱
     *
     * 1	isLetter()
     * 是否是一个字母
     * 2	isDigit()
     * 是否是一个数字字符
     * 3	isWhitespace()
     * 是否是一个空白字符
     * 4	isUpperCase()
     * 是否是大写字母
     * 5	isLowerCase()
     * 是否是小写字母
     * 6	toUpperCase()
     * 指定字母的大写形式
     * 7	toLowerCase()
     * 指定字母的小写形式
     */
    public static void main(String[] args) {
        Character ch = new Character('a');
        //是否是字母
        boolean letter = Character.isLetter(ch);//自动拆箱
        System.out.println(letter);
        letter = Character.isDigit('5');
        System.out.println(letter);

        char c = Character.toUpperCase(ch);
        System.out.println(c);



    }
}
