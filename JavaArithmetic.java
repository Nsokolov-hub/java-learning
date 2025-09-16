public class JavaArithmetic {
    public static void main(String[] args) {
        // Пример сложения
int a = 10;
int b = 5;
int result = a + b;
System.out.println(a + " + " + b + " = " + result);

// Пример вычитания
int x = 10;
int y = 5;
int difference = x - y;
System.out.println(x + " - " + y + " = " + difference);

// Пример умножения
int m = 10;
int n = 5;
int product = m * n;
System.out.println(m + " * " + n + " = " + product);

// Пример деления
int p = 10;
int q = 5;
int quotient = p / q;
System.out.println(p + " / " + q + " = " + quotient);

// Пример остатка от деления
int num1 = 10;
int num2 = 3;
int remainder = num1 % num2;
System.out.println(num1 + " % " + num2 + " = " + remainder);

// Пример префиксного инкремента
int var1 = 5;
int var2 = ++var1;
System.out.println("Префиксный инкремент: var1 = " + var1 + ", var2 = " + var2);

// Пример постфиксного инкремента
int var3 = 5;
int var4 = var3++;
System.out.println("Постфиксный инкремент: var3 = " + var3 + ", var4 = " + var4);

// Пример составного оператора присваивания
int num = 10;
num += 5; // эквивалентно num = num + 5;
System.out.println("Результат после составного оператора присваивания: " + num);
    }
}
