public static boolean isPrime(int number) {
    return !IntStream.rangeClosed(2, number/2).anyMatch(i -> number%i == 0); 
}

or

public static boolean isPrime(int number) {
    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0); 
}
  
