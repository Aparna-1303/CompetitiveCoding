class Solution {
    static void pushZerosToEnd(int[] arr) {
        int length_of_array = arr.length;
        int count = 0;
        for(int i = 0; i < length_of_array; i++)
        {
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count ++;
            }
        }
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
        pushZerosToEnd(arr);
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
