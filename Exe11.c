#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
double media;
double soma=0;
int vetor [10];	
int main(int argc, char *argv[]) {

int i; 

for ( i = 0; i<10; i++) {

int valor;

printf("DIGITE O NUMERO %i \n", i);
scanf("%i", &valor);

vetor[i] = valor; 

soma=soma+vetor[i];


}
printf("\n");
media = soma/10;

for ( i = 0; i<10; i++) {

	
if (vetor[i]==media){
	
printf("O valor e igual a media no espaco %i", i );	
printf("\n");	
}else{
	

printf("O valor e diferente da media no espaco %i", i );
printf("\n");	
}

}



	return 0;
}
