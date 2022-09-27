import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class StringCalculator{
    public int add(String numbers) throws CalculatorExceptions{
        int sumResult;
        String delimiterDefault = ",|\n";
        int negative = 0;
        String negativeNum = "";
        String[] stringArray = new String[0];

        numbers = numbers.replaceAll(" ", "");
        if (numbers == "") {
            sumResult = 0;
            return sumResult;
        }

        if (numbers.indexOf("//") != -1) {
            if(numbers.indexOf("\\n") - numbers.indexOf("//") == 3){
                String delimiter = numbers.substring(2,3);
                numbers = numbers.substring(numbers.indexOf("\\n") + 2);
                numbers = numbers.replaceAll(Pattern.quote(delimiter),",");
            }
            else {
                String delimiter = numbers.substring(numbers.indexOf("//") + 2, numbers.indexOf("\\n"));
                numbers = numbers.substring(numbers.indexOf("\\n") + 2);
                if (delimiter.endsWith("]") && delimiter.startsWith("[")) {
                     Pattern pattern = Pattern.compile("\\[(.*?)\\]");
                    Matcher matcher = pattern.matcher(delimiter);

                    while (matcher.find()) {
                        for (int i = 0; i <= matcher.groupCount(); i++) {
                            String m = matcher.group(i);
                            numbers = numbers.replaceAll(Pattern.quote(m), ",");
                        }

                    }
                    numbers = numbers.replaceAll(Pattern.quote(delimiterDefault), ",");
                }
            }
            stringArray = numbers.split(delimiterDefault);
        }else if (numbers.contains("\\n")) {
            String[] strArr = numbers.split("");
            String[] stringArr = new String[numbers.length()];
            for (int i = 0; i < numbers.length(); i++) {
                if (strArr[i].equals("\\") || strArr[i].equals("n") || strArr[i].equals(",")) {
                    continue;
                }
                stringArr[i] = strArr[i];
            }
            stringArray = stringArr;
        }else {
            stringArray = numbers.split(delimiterDefault);
        }
        int res = 0;
        for (String elem : stringArray) {
            int n = 0;
            try {
                if (elem != null) {
                    n = Integer.parseInt(elem);
                }
            }catch (NumberFormatException exception){
                throw new CalculatorExceptions("Values can't be convert into integer");
            }
            if (n < 1001) {
                res += n;
            }
            if (n < 0) {
                negativeNum += String.valueOf(n) + ",";
                negative ++;
            }
        }
        if(negative != 0){
            res = -1;
            throw new CalculatorExceptions("It's seems you have negative numbers: " + negativeNum);
        }
        return res;
    }
}
