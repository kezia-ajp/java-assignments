class Population {
    public static void main(String[] args) {
        long india = 1420000000L;
        long china = 1410000000L;

        System.out.println("Population of India: " + india);
        System.out.println("Population of China: " + china);

        if (india > china)
            System.out.println("India has a higher population.");
        else
            System.out.println("China has a higher population.");
    }
}
