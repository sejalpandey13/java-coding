import java.util.Scanner;

//Brute Force Approach

class IsPrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i< t; i++){
            int n = sc.nextInt();

            int count = 0;
            for(int j = 1; j <= n; j++){
                if(n % j == 0){
                    count++;
                }
            }       

            if(count == 2){
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }

        }
    }
    
}

//Optimized Approach
/*
class IsPrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            int count = 0;

            if (n <= 1) {
                count = 1; // not prime
            } else {
                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        count++;
                        break;
                    }
                }
            }

            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

        sc.close();
    }
}*/

