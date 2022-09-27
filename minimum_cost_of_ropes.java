class Solution
{
    //Function to return the minimum cost of connecting the ropes.
    long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++)
            pq.add(arr[i]);
        long ans = 0;
        while(pq.size()>1){
            long r1 = pq.poll();
            long r2 = pq.poll();
            long newr = r1+r2;
            ans += newr;
            pq.add(newr);
        }
        return ans;
    }
}
