/*
	Specify the complexity of the piece of codes below 
*/
//1
for (int i = 0; i < n; i++) {
    System.out.println("Hey - I'm busy looking at: " + i);
}
//2.
for (int i = 1; i <= Math.pow(2, n); i+=2){
    System.out.println("Hey - I'm busy looking at: " + i);
}
//3.
for (int i = 1; i <= n; i = i * 2){
    System.out.println("Hey - I'm busy looking at: " + i);
}
//4.1
for (int i = 1; i <= n; i++){			//Outer loop
    for(int j = 1; j <= n; j = j * 2) {	//Inner loop
        System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
    }
}
//4.2
for (int i = 1; i <= n; i++){		//Outer loop
    for(int j = 1; j <= 10; j++) {	//Inner loop
        System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
    }
}
//4.3
for (int i = 1; i <= n; i++){		//Outer loop
    for(int j = 1; j <= i; j++) {	//Inner loop
        System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
    }
}
//-------------------------------------
//5.
int i = 0;
while (n%2 == 0) {
	n = n/2;
	i++;
}
//6.1
for (int i = 0; i < n; i++)
	for (int j = 0; j < n; j++)
		A[i][j] = 0;
for (int k = 0; k < n; k++)
	A[k][k] = 1;

//6.2
for (int i = 0; i < n; i++)
	for (int j = 0; j < n; j++)
		A[i][j] = 0;
	for (int k = 0; k < n; k++)
		A[k][k] = 1;
//6.3
for (int i = 0; i < n; i++){
	for (int j = 0; j < n; j++)
		A[i][j] = 0;
		for (int k = 0; k < n; k++)
			A[k][k] = 1;
//-----------------------------
//7. 
public int fib(int n) {
    if(n <= 2) return 1;
    return fib(n-1) + fib(n-2);
}

