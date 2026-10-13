class Solution {
    static int getSecondLargest(int[] arr) {
        int length_of_array = arr.length;
        int Largest = -1, second_largest = -1;
        for(int i = 0; i < length_of_array; i++)
        {
            if (arr[i] > Largest)
            {
                second_largest = Largest;
                Largest = arr[i];
            }
            else if(arr[i] < Largest && arr[i] > second_largest)
            {
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(getSecondLargest(arr));
    }
}
