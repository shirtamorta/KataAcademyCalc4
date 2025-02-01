import java.io.IOException;
import java.util.Scanner;


public class Test3 {


    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            String arithmeticOperation = scanner.nextLine();
            boolean stroka = arithmeticOperation.matches(".*\\d.*");
            boolean stroka2 = arithmeticOperation.matches(".*[a-zA-Zа-яА-ЯёЁ].*");
            if (stroka2 && stroka) {
                throw new Exception();
            } else {
                if (stroka2) {
                    calc2(arithmeticOperation);
                    System.out.println(calc2(arithmeticOperation));
                }
                if (stroka) {
                    calc(arithmeticOperation);
                    System.out.println(calc(arithmeticOperation));

                }
            }
        }


        public static String calc(String input) throws Exception {
            int resultArithmeticOperation;
            if (!(input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/"))) {
                throw new Exception();
            } else {
                if (input.contains("-")) {
                    int index4 = input.indexOf("-");
                    String number1 = input.substring(0, index4);
                    String number2 = input.substring(index4 + 1);
                    String number11 = number1.trim();
                    String number22 = number2.trim();
                    int a1 = Integer.parseInt(number11);
                    int a2 = Integer.parseInt(number22);
                    if (!(a1 <= 10 && a2 <= 10)) {
                        throw new IOException();
                    } else {
                        if (input.contains("-")) {
                            resultArithmeticOperation = a1 - a2;
                            String str = "" + resultArithmeticOperation;
                            return str;
                        }

                    }

                }
                if (input.contains("*")) {
                    int index4 = input.indexOf("*");
                    String number1 = input.substring(0, index4);
                    String number2 = input.substring(index4 + 1);
                    String number11 = number1.trim();
                    String number22 = number2.trim();
                    int a1 = Integer.parseInt(number11);
                    int a2 = Integer.parseInt(number22);
                    if (!(a1 <= 10 && a2 <= 10)) {
                        throw new Exception();
                    } else {
                        resultArithmeticOperation = a1 * a2;
                        String str = "" + resultArithmeticOperation;
                        return str;
                    }

                }
                if (input.contains("/")) {
                    int index4 = input.indexOf("/");
                    String number1 = input.substring(0, index4);
                    String number2 = input.substring(index4 + 1);
                    String number11 = number1.trim();
                    String number22 = number2.trim();
                    int a1 = Integer.parseInt(number11);
                    int a2 = Integer.parseInt(number22);
                    if (!(a1 <= 10 && a2 <= 10)) {
                        throw new Exception();
                    } else {
                        resultArithmeticOperation = a1 / a2;
                        String str = "" + resultArithmeticOperation;
                        return str;
                    }

                }
                if (input.contains("+")) {
                    int index4 = input.indexOf("+");
                    String number1 = input.substring(0, index4);
                    String number2 = input.substring(index4 + 1);
                    String number11 = number1.trim();
                    String number22 = number2.trim();
                    int a1 = Integer.parseInt(number11);
                    int a2 = Integer.parseInt(number22);
                    if (!(a1 <= 10 && a2 <= 10)) {
                        throw new Exception();
                    } else {
                        resultArithmeticOperation = a1 + a2;
                        String str = "" + resultArithmeticOperation;
                        return str;
                    }
                }
            }
            return "маг";
        }

        public static String calc2(String input) throws Exception {
            String[] numbersResult = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
            int[] numbersResult1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
            if (!(input.contains("+") || input.contains("-") || input.contains("*") || input.contains("/"))) {
                throw new Exception();
            } else {
                if (input.contains("+")) {
                    int index4 = input.indexOf("+");
                    String number1 = input.substring(0, index4);
                    String number2 = input.substring(index4 + 1);
                    String number11 = number1.trim();
                    String number22 = number2.trim();
                    int arabNumb;
                    int arabNumb1;
                    int resultArabNumb;
                    String resultRimNumb;
                    for (int i = 0; i < numbersResult.length; i++) {
                        if (number11.equals(numbersResult[i])) {
                            arabNumb = numbersResult1[i];
                            for (int o = 0; o < numbersResult.length; o++) {
                                if (number22.equals(numbersResult[o])) {
                                    arabNumb1 = numbersResult1[o];
                                    if (!(arabNumb <= 10 && arabNumb1 <= 10)) {
                                        throw new Exception();
                                    } else {
                                        resultArabNumb = arabNumb + arabNumb1;
                                        for (int u = 0; u < numbersResult1.length; u++) {
                                            if (resultArabNumb == numbersResult1[u]) {
                                                resultRimNumb = numbersResult[u];
                                                return resultRimNumb;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }for (int i = 0; i < numbersResult.length; i++) {

                        if (!(number11.equals(numbersResult[i]))) {
                            throw new Exception();
                        }
                    }
                }

                }
                if (input.contains("-")) {
                    int index4 = input.indexOf("-");
                    String number1 = input.substring(0, index4);
                    String number2 = input.substring(index4 + 1);
                    String number11 = number1.trim();
                    String number22 = number2.trim();
                    int arabNumb;
                    int arabNumb1;
                    int resultArabNumb;
                    String resultRimNumb;
                    for (int i = 0; i < numbersResult.length; i++) {
                        if (number11.equals(numbersResult[i])) {
                            arabNumb = numbersResult1[i];
                            for (int o = 0; o < numbersResult.length; o++) {
                                if (number22.equals(numbersResult[o])) {
                                    arabNumb1 = numbersResult1[o];
                                    if (!(arabNumb <= 10 && arabNumb1 <= 10)) {
                                        throw new Exception();
                                    } else {
                                        resultArabNumb = arabNumb - arabNumb1;
                                        if (resultArabNumb < 1) {
                                            throw new Exception();
                                        } else {
                                            for (int u = 0; u < numbersResult1.length; u++) {
                                                if (resultArabNumb == numbersResult1[u]) {
                                                    resultRimNumb = numbersResult[u];
                                                    return resultRimNumb;
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                                }
                            }
                    for (int i = 0; i < numbersResult.length; i++) {
                        if (!(number11.equals(numbersResult[i]))) {
                            throw new Exception();
                        }
                        }
                    }
            if (input.contains("*")) {
                int index4 = input.indexOf("*");
                String number1 = input.substring(0, index4);
                String number2 = input.substring(index4 + 1);
                String number11 = number1.trim();
                String number22 = number2.trim();
                int arabNumb;
                int arabNumb1;
                int resultArabNumb;
                String resultRimNumb;
                for (int i = 0; i < numbersResult.length; i++) {
                    if (number11.equals(numbersResult[i])) {
                        arabNumb = numbersResult1[i];
                        for (int o = 0; o < numbersResult.length; o++) {
                            if (number22.equals(numbersResult[o])) {
                                arabNumb1 = numbersResult1[o];
                                if (!(arabNumb <= 10 && arabNumb1 <= 10)) {
                                    throw new Exception();
                                } else {
                                    resultArabNumb = arabNumb * arabNumb1;
                                    for (int u = 0; u < numbersResult1.length; u++) {
                                        if (resultArabNumb == numbersResult1[u]) {
                                            resultRimNumb = numbersResult[u];
                                            return resultRimNumb;
                                        }
                                    }
                                }
                            }
                        }

                            }
                        }
                for (int i = 0; i < numbersResult.length; i++) {
                    if (!(number11.equals(numbersResult[i]))) {
                        throw new Exception();
                    }
                }
            }

            if (input.contains("/")) {
                int index4 = input.indexOf("/");
                String number1 = input.substring(0, index4);
                String number2 = input.substring(index4 + 1);
                String number11 = number1.trim();
                String number22 = number2.trim();
                for (int t = 0; t < numbersResult.length; t++) {
                    if (number11.equals(numbersResult[t])) {
                        int arabNumb;
                        int arabNumb1;
                        int resultArabNumb;
                        String resultRimNumb;
                        for (int i = 0; i < numbersResult.length; i++) {
                            if (number11.equals(numbersResult[i])) {
                                arabNumb = numbersResult1[i];
                                for (int o = 0; o < numbersResult.length; o++) {
                                    if (number22.equals(numbersResult[o])) {
                                        arabNumb1 = numbersResult1[o];
                                        if (!(arabNumb <= 10 && arabNumb1 <= 10)) {
                                            throw new Exception();
                                        } else {
                                            resultArabNumb = arabNumb / arabNumb1;
                                            if (resultArabNumb < 1) {
                                                throw new Exception();
                                            }
                                            {
                                                for (int u = 0; u < numbersResult1.length; u++) {
                                                    if (resultArabNumb == numbersResult1[u]) {
                                                        resultRimNumb = numbersResult[u];
                                                        return resultRimNumb;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                        }
                    }

                }
                for (int i = 0; i < numbersResult.length; i++) {
                if (!(number11.equals(numbersResult[i]))) {
                    throw new Exception();
                }
                }
            }
            return null;
            }
        }

