#include <stdio.h>
#include <stdlib.h>

int main()
{
    char operatori;
    double risultato;
    double num1;
    double num2;

    printf("\ninserisci una delle quattro operazioni(+, -, *, /): ");
    scanf("%c", &operatori);

    printf("inserisci il primo numero: ");
    scanf("%lf", &num1);

    printf("\ninserisci il secondo numero: ");
    scanf("%lf", &num2);

    

    switch(operatori){
        case '+':
            risultato = num1 + num2;
            printf("\n%.2lf", risultato);
            break;
        case '-':
            risultato = num1 - num2;
            printf("\n%.2lf", risultato);
            break;
        case '*':
            risultato = num1 * num2;
            printf("\n%.2lf", risultato);
            break;
        case '/':
            risultato = num1 / num2;
            printf("\n%.2lf", risultato);
            break;
        default:
            printf("%c non e' valido", operatori);
    }
    return 0;
}