public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];
        System.out.println("Enter the piles: ");
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        System.out.print("Enter the hours: ");
        int h = sc.nextInt();

        KokoEatingBananas sol = new KokoEatingBananas();
        int result = sol.minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);
    }