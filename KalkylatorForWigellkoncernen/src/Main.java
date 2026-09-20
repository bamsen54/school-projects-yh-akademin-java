
// Simon Toivola SY25 Systemutveckling i Java Uppgift 2

public static char userChoiceOperator;
public static ArrayList<Double> operands;

void main() {

    println("");

    while( true ) {

        userChoiceOperator = Menu.displayOperatorMenuAndChoose();

        if( userChoiceOperator != '?' && userChoiceOperator != 'x' )
            operands = Menu.inputOperands();

        switch (userChoiceOperator) {

            case '+' -> Calculator.calculate('+', operands);
            case '-' -> Calculator.calculate('-', operands);
            case '*' -> Calculator.calculate('*', operands);
            case '/' -> Calculator.calculate('/', operands);
            case '%' -> Calculator.calculate('%', operands);
            case '^' -> Calculator.calculate('^', operands );
            case '?' -> Help.getHelp();
            case 'x' -> { return;  }
        }
    }
}
