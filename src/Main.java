//import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        There are two Data types:

//1) Primitive : (These are native/ default types)
        //  i)int--integer
        //  ii)char--character/string
        //  iii)boolean
        //  iv)long-- jb integer k size bara ho
        //  v)float-- point wale number
        //  vi)double-- jb float k size bara ho

//        int num = 3;
//        char cr = 'a';
//        boolean any = true;
//        long lg = 24;
//        float fl = 24132123;
//        double dbl = 2.4132123;

//        System.out.println(num);
//        System.out.println(cr);
//        System.out.println(any);
//        System.out.println(lg);
//        System.out.println(fl);
//        System.out.println(dbl);
// X--------------------------------------------------X----------------------------------------------------------------X
//2) Non-primitive:
        // i) Wrapper classes:
        // a)Integer
        // b)Boolean
        // c)Double

//        String character = "anas";
//        Integer ine = 12;
//        Boolean bol = true;
//        Double Dbl = 1.212;

//        System.out.println(character);
//        System.out.println(ine);
//        System.out.println(bol);
//        System.out.println(Dbl);
// X--------------------------------------------------X----------------------------------------------------------------X
        // ii)Custom data type / class (Hm apni data types kud bnaskte hn)
//        Car car = new Car("Honda", "Gray", 2002);
//        car.name = "Honda";
//        car.colour = "Gray";
//        car.engineNo = 4114;
//        System.out.println(car);

//        Bike bike = new Bike("KIA","Black");
//        System.out.println(bike);

//        Math math = new Math();
//        Integer add = math.sum(5, 11);
//        System.out.println(add);

//        Integer minus = math.subtract(10, 4);
//        System.out.println(minus);

//        Integer multiply = math.product(2, 2);
//        System.out.println(multiply);

//        Integer per = math.divide(10, 2);
//        System.out.println(per);

//        Bank bank = new Bank();
//        bank.deposit((int) 100.00);
//        bank.checkBalance();
//        bank.withdraw((int) 30.00);
//        bank.checkBalance();

//        Student student1 = new Student("anas");
//        Student student2 = new Student("anas");
//        System.out.println(student1);
//        System.out.println(student2);

//        if (student1.equals(student2)) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
// X--------------------------------------------------X----------------------------------------------------------------X
//                                                  (Switch Case)
//        Scanner switc = new Scanner(System.in);
//        char sww = switc.next().charAt(0);
//
//        switch (sww) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//                System.out.println("It's a vowel");
//                break;
//            default:
//                System.out.println("It's a consonant");
//        }

//        Scanner snacks = new Scanner(System.in);
//        String snack = snacks.next();

//        switch (snack) {
//            case "Lays":
//            case "Kurkure":
//            case "Cheetos":
//            case "Kurleez":
//                System.out.println(snack + "le aao");
//            default:
//                System.out.println("Ghar aajao");
//        }
// X--------------------------------------------------X----------------------------------------------------------------X
//
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }
//
//
//        for (int i = 1; i <= 10; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + " is even");
//            } else {
//                System.out.println(i + " is odd");
//            }
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name = sc.next();
//        System.out.println("What is your name?");
//        Integer times = sc.nextInt();
//        for (int i = 0; i < times; i++) {
//            System.out.println(name);
//        }


//        Scanner scc = new Scanner(System.in);
//        System.out.println("Form where do you want to start?");
//        Integer start = scc.nextInt();
//        System.out.println("What would be the difference?");
//        Integer differernce = scc.nextInt();
//        System.out.println("What would be the end?");
//        Integer end = scc.nextInt();
//        for (int i = start; i <= end; i += differernce) {
//            System.out.println(i);
//        }

//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            sum += i;
//        }
//        System.out.println(sum);


//        for (int i = 0; i <= 20; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


//        for (int i = 20; i > 0; i--) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }


//        Scanner inputNumber = new Scanner(System.in);
//        int primeNumber = inputNumber.nextInt();
//        boolean flag = true;
//        for (int i = 2; i < primeNumber; i++) {
//            if (primeNumber % i == 0) {
//                flag = false;
//            }
//        }
//        if (flag) {
//            System.out.println("Prime");
//        } else {
//            System.out.println("Not prime");
//        }


//        Scanner number = new Scanner(System.in);
//        int summ = number.nextInt();
//        int add = 0;
//        for (int i = 1; i <= summ; i++) {
//            add += i;
//        }
//        System.out.println(add);


//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("-");
//            }
//            System.out.println("*");
//        }
// X--------------------------------------------------X----------------------------------------------------------------X
//
//                                                   (TEST_01)
//
//        Scanner scanner = new Scanner(System.in);
//        String variable = scanner.next();

//        switch (variable) {
//            case "a":
//            case "e":
//            case "i":
//            case "o":
//            case "u":
//                System.out.println("Vowel");
//                break;
//            default:
//                System.out.println("Consonant");
//        }

//        if (variable == "a" || variable == "e" || variable == "i" || variable == "o" || variable == "u") {
//            System.out.println("Vowel");
//        } else {
//            System.out.println("Consonant");
//        }
// X--------------------------------------------------X----------------------------------------------------------------X
//
//                                                 (Arrays)
//
//        int[] arr = new int[4];
//        arr[1] = 62;
//        arr[2] = 23;
//        arr[3] = 12;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//
//        int[] array = {0, 123, 12, 4, 2, 634};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        System.out.println("Write a number to find:");
//
//        Scanner ar = new Scanner(System.in);
//        int num = ar.nextInt();
//
//        boolean found = false;
//
//        for (int i = 0; i < array.length; i++) {
//            if (num == array[i]) {
//                found = true;
//            }
//        }
//        if (found) {
//            System.out.println("Found");
//        } else {
//            System.out.println("Not found");
//        }
//
//
//        int[] aray = new int[6];
//        Scanner arrInput = new Scanner(System.in);
//        for (int i = 0; i < aray.length; i++) {
//            System.out.println("Enter " + i + " value");
//            aray[i] = arrInput.nextInt();
//        }
//        for (int i = 0; i < aray.length; i++) {
//            System.out.println(aray[i]);
//        }
//
//
//        int[] arraySum = {1, 3, 5, 78};
//        int numberSum = 0;
//        for (int i = 0; i < arraySum.length; i++) {
//            numberSum += arraySum[i];
//        }
//        System.out.println(numberSum);
//// X--------------------------------------------------X----------------------------------------------------------------X
////                                              (Foreach loop)
//
//        String[] fruits = {"Apple", "Banana", "Mango"};
//        for (String el : fruits) {
//            System.out.println(el);
//        }
//
//
//        char[] charArray = {'a', 'e', 'w', 'i'};
//        boolean purevowel = true;
//        for (char vowel : charArray) {
//            if (vowel != 'a' && vowel != 'e' && vowel != 'i' && vowel != 'o' && vowel != 'u') {
//                purevowel = false;
//            }
//        }
//        if (purevowel) {
//            System.out.println("Pure vowel array");
//        } else {
//            System.out.println("Contains a consonant");
//        }
//
//
//        int[] arr = {1, 4, 22, 13, 11, 5};
//        int countEven = 0;
//        int countOdd = 0;
//        for (int num : arr) {
//            if (num % 2 == 0) {
//                System.out.println(num + " is even");
//                countEven++;
//            } else {
//                System.out.println(num + " is odd");
//                countOdd++;
//            }
//        }
//        System.out.println("Total even numbers are " + countEven);
//        System.out.println("Total even numbers are " + countOdd);
//
//
//        int[] arr = {1, 4, 22, 13, 11, 5};
//        int num = 11;
//        for (int i = 0; i < arr.length; i++) {
//            if (num == arr[i]) {
//                int left = (i == 0) ? 0 : arr[i - 1];
//                int right = (i == arr.length - 1) ? 0 : arr[i + 1];
//                System.out.println(left + right);
//            }
//        }
//
//
//        int[] arr = {1, 5, 4, 3};
//        int sum = 15;
//        int missedNum = 0;
//        for (int el : arr) {
//            missedNum += el;
//        }
//        System.out.println("Missing number is " + (sum - missedNum));


//        int[] array = {23, 561, 40, 63, 21};
//        int maxNum = 0;
//        for (int el : array) {
//            if (maxNum < el) {
//                maxNum = el;
//            }
//        }
//        System.out.println(maxNum);

//        String var2 = "Mango";
//        String var1 = "Apple";
//        String var3 = var2;
//        var2 = var1;
//        var1 = var3;
//        System.out.println("num1 = " + var1);
//        System.out.println("num2 = " + var2);

//        int num1 = 15;
//        int num2 = 10;
//        int sum = num1 + num2;
//        num1 = sum - num2;
//        num2 = sum - num1;
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Index 1:");
//        Integer index1 = sc.nextInt();
//        System.out.println("Index 2:");
//        Integer index2 = sc.nextInt();
//        int[] arr = {1, 3, 2, 5, 4};
//        arr[1] = index1;
//        arr[2] = index2;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

//        Scanner sc = new Scanner(System.in);
//        int[] array = {1, 3, 2, 5, 4};
//        int index1 = sc.nextInt();
//        int result = findIndex(index1, array);
//        System.out.println(result);

//        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//        String[] fruitsArray = {"Apple", "Mango", "Banana"};
//        Boolean result = findfruit(fruit, fruitsArray);
//        System.out.println(result);

//        String[] fruits = {"Apple", "Mango", "Banana", "Grape"};
//        String[] vegetable = {"Potato", "Tomato", "Onion", "Chilli"};
//        String[] find = {"Apple", "Chilli", "Banana"};
//        Boolean resultFruit = findInFruit(fruits, find);
//        Boolean resultVegetable = findInVegetable(vegetable, find);

//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        Boolean prime = isPrime(num);
//        if (prime) {
//            System.out.println(num + " is prime number");
//        } else {
//            System.out.println(num + " is not a prime number");
//        }

//        int[] arr = {3, 7, 11, 14, 17};
//        for (int el : arr) {
//            for (int i = 2; i < el; i++) {
//                if (el % i == 0) {
//                    System.out.println(el + " is not a prime number");
//                    break;
//                } else {
//                    System.out.println(el + " is a prime number");
//                    break;
//                }
//            }
//        }

//        int[] arr = {4, 13, 11, 7, 12};
//        int[] newArray = swapRight(arr);
//        for (int el : newArray) {
//            System.out.println(el);
//        }

//        int[] arr = {1, 3, 1, 2, 2, 5, 1, 7, 3};
//        int[] nArr = duplicate(arr);
//        for (int el : nArr) {
//            System.out.print(el);
//        }

//        int[] arr = {1, 3, 1, 2, 2, 5, 1, 7, 3};
//        for (int el; arr) {
//            if (containIndex(el, arr)) {
//
//            }
//        }


//        int[] arr = {1, 3, 1, 2, 2, 5, 1, 7, 3};
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int count1 = 0;
//        int count2 = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == num1) {
//                count1++;
//            }
//            if (arr[i] == num2) {
//                count2++;
//            }
//        }
//        System.out.println(count1);
//        System.out.println(count2);

//--------------------------------------Bubble sort (Descending)--------------------------------------------------------
//        int[] arr = {3, 2, 1, 5, 4};
//        for (int j = 0; j < arr.length - 1; j++) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] < arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
////---------------------------------------------------Bubble sort (Ascending)--------------------------------------------
//        for (int j = 0; j < arr.length - 1; j++) {
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] < arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
// X--------------------------------------------------X----------------------------------------------------------------X
//                                                 2d Arrays

//        int[][] arr = new int[2][2];
//        arr[0][0] = 3;
//        arr[0][1] = 8;
//        arr[1][0] = 1;
//        arr[1][1] = 4;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr.length; col++) {
//                System.out.println(arr[row][col]);
//            }
//    }

//        int[][] array = {{3, 1}, {6, 12}};
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array.length; col++) {
//                System.out.println(array[row][col]);
//            }
//        }


//        int[][] array = new int[2][2];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = sc.nextInt();
//            }
//        }
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array.length; col++) {
//                System.out.println(array[row][col]);
//            }
//        }

//        int[][] array = {{3, 1}, {1, 12}};
//        if (array[0][1] == array[1][0]) {
//            System.out.println("It is a diagonal array");
//        } else {
//            System.out.println("It is not a diagonal array");
//        }

//        int[][] arr = {{5, 7}, {3, 2}};
//        int num = 3;
//        boolean result = findElement2d(arr, num);
//        System.out.println(result);

//        int[][] arr = {{5, 7},
//                {3, 2}};
//        int num = 7;
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr.length; col++) {
//                if (num == arr[row][col]) {
//                    int left = (col == 0) ? 0 : arr[row][col - 1];
//                    int right = (col == arr.length - 1) ? 0 : arr[row][col + 1];
//                    int up = (row == 0) ? 0 : arr[row - 1][col];
//                    int down = (row == arr.length - 1) ? 0 : arr[row + 1][col];
//                    System.out.println("left: " + left);
//                    System.out.println("right: " + right);
//                    System.out.println("up: " + up);
//                    System.out.println("down: " + down);
//                }
//            }
//        }

// X--------------------------------------------------X----------------------------------------------------------------X

    }

    private static int[] duplicate(int[] arr) {
        int[] dupArr = new int[5];
        int nArrIndex = 0;
        for (int el : arr) {
            if (containIndex(el, dupArr)) {
                dupArr[nArrIndex] = el;
                nArrIndex++;
            }
        }
        return dupArr;
    }

    private static boolean containIndex(int num, int[] dupArr) {
        for (int el : dupArr) {
            if (num == el) {
                return false;
            }
        }
        return true;
    }

    private static int[] swapRight(int[] arr) {
        int[] narr = new int[arr.length];
        narr[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            narr[i] = arr[i - 1];
        }
        return narr;
    }

    private static Boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findIndex(int index1, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (index1 == arr[i]) {
                return i;
            }
        }
        return -1;

    }

    public static Boolean findfruit(String fruit, String[] fruitsArray) {
        for (String el : fruitsArray) {
            if (fruit.equalsIgnoreCase(el)) {
                return true;
            }
        }
        return false;
    }

    public static boolean findInFruit(String[] fruits, String[] find) {
        for (String el : fruits) {

        }
        return false;
    }

    public static boolean findInVegetable(String[] vegetable, String[] find) {

        return false;
    }

    public static boolean findElement2d(int[][] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }


}



