#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main(int argc, char *argv[]) {

	float valor;  
	
	 printf("Informe o preco do produto\n");
     scanf("%f", &valor);

    if(valor<100){

valor = valor*1.1;

printf("O produto inflacionado por 10 por cento = %f \n" , valor);

}else{

valor = valor*1.2;

printf("O produto inflacionado por 20 por cento é = %f \n" , valor);

}

	

	return 0;
}
