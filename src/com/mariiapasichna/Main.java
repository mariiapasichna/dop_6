package com.mariiapasichna;

public class Main {

    /*6. Баланс скобок. Дана конечная последовательность, состоящая из левых и правых скобок различных заданных типов.
Определить, можно ли добавить в нее цифры и знаки арифметических действий так, чтобы получилось правильное арифметическое выражение.
Примеры:
1	(	NO
2	))	NO
3	[}	NO
4	{}	YES
5	(){}[]	YES
6	({[]}{})	YES
7	[({}())[]	NO
*/

    public static void main(String[] args) {
        BracketBalance.isBalance("(){(<>)}[]");
    }
}