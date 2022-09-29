class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int sp = 0;
        int ep = n-1;
        int i=0;
        while(i<n){
            if(a[i]==0){
                int temp = a[i];
                a[i] = a[sp];
                a[sp] = temp;
                sp++;
            }
            else if(a[i]==2 && i<ep){
                int temp = a[i];
                a[i] = a[ep];
                a[ep] = temp;
                ep--;
                i--;
            }
            i++;
        }
    }
}
