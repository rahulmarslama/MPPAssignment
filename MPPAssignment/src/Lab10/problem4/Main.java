package Lab10.problem4;

import java.util.List;

public class Main
{
    static void main(String[] args)
    {
        List<String> words = List.of("doctorated", "camoflouge", "apartcents", "maple", "cap");
        System.out.println(countWords(words, 'c', 'd', 10));
    }

    public static int countWords(List<String> words, char c, char d, int len)
    {
        return (int) words.stream()
                        .filter(x->x.contains(""+c))
                .filter(x->!x.contains(""+d))
                .filter(x->x.length()==len).count();
    }
}
