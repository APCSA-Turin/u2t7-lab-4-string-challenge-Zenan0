package com.example.project;

public class StringProblemsRunner {
    public static void main(String[] args) {
        StringProblems string = new StringProblems();
        Boolean tOrF = string.endsLy("ably");
        System.out.println(tOrF);
        String str = string.conCat("ab", "bc");
        System.out.println(str);
        str = string.deFront("bacde");
        System.out.println(str);
        str = string.withoutX("xyo");
        System.out.println(str);
        str = string.fizzString("nah");
        System.out.println(str);
        str = string.fizzString2(3);
        System.out.println(str);
    }
}
