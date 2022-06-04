#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int maior = 0;
int menor = 100000000;
int vetor [10];	
int main(int argc, char *argv[]) {


int i; 

for ( i = 0; i<10; i++) {

int valor;

printf("DIGITE O NUMERO %i \n", i);
scanf("%i", &valor);

vetor[i] = valor; 


if (vetor[i]>maior){
	
	maior = vetor[i];
	
}

if (vetor[i]<menor){

menor = vetor[i];	
	
}
}


printf("MAIOR \n %i", maior);
printf("MENOR \n %i", menor);

	return 0;
}
