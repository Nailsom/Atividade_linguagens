//A
void main() { 
    int x, *p; 
    x = 100;
    p = x; // Erro: Não é possível atribuir um valor inteiro diretamente a um ponteiro. Deve-se atribuir o endereço de `x` usando `&x`.
    printf("Valor de p: %d.\n", *p); 
    // Erro: Se `p` não for inicializado corretamente, a desreferenciação (*p) resultará em comportamento indefinido.
}

//B
void troca(int *i, int *j) {
    int *temp; 
    *temp = *i; 
    // Erro: O ponteiro `temp` foi declarado, mas não foi inicializado. 
    // Isso causa comportamento indefinido ao tentar acessar o endereço para o qual ele aponta.
    *i = *j;
    *j = *temp; 
    // Erro adicional: Caso `temp` não seja inicializado corretamente, essa linha pode levar a erros de execução.
}

//C
char *a, *b; 
a = "abacate";
b = "uva";
if (a < b) 
// Erro: Comparar strings diretamente com operadores relacionais (`<`, `>`) não funciona em C.
// Para comparar strings, deve-se usar a função `strcmp` da biblioteca `<string.h>`.
    printf("%s vem antes de %s no dicionário", a, b); 
else
    printf("%s vem depois de %s no dicionário", a, b);
