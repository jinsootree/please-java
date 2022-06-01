package 배열;

public class ArrayToParameter {
    public static void main(String[] args) {
        int []  evens= {0,2,4,6,8,10,12,14,16,18};
        int []  primes= {2,3,5,7,9,11,13,17,19};

        int evenSum = sum(evens);
        int primeSum = sum(primes);

        System.out.println("0 이상 20 미만의 짝수와 소수 중 ...");
        System.out.printf("짝수의 합 : %d\n", evenSum);
        System.out.printf("소수의 합: %d\n", primeSum);
    }

    public static int sum(int [] arr) {
       int sum = 0;
       
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       return sum; //sum(evens)와 sum(primes)값으로 각각 반환
    }
}
